/*
 * Copyright (c) 2008, SQL Power Group Inc.
 *
 * This file is part of Power*Architect.
 *
 * Power*Architect is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Power*Architect is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */

package ca.sqlpower.architect.swingui;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

import ca.sqlpower.object.SPChildEvent;
import ca.sqlpower.object.SPListener;
import ca.sqlpower.util.SQLPowerUtils;
import ca.sqlpower.util.TransactionEvent;

/**
 * Navigator defines the behaviours of the overview navigation dialog. It
 * captures the whole Playpen and scales it down so that a user can easily
 * navigate to parts of the Playpen.
 * 
 * @author kaiyi
 * 
 */
public class Navigator extends JDialog implements SPListener, AdjustmentListener, PropertyChangeListener {

    private static final int SCALED_IMAGE_WIDTH = 200;

    private static final int SCALED_IMAGE_HEIGHT = 125;

    private PlayPen pp;
    
    private JPanel navigationPanel;

    /**
     * The factor which the entire Playpen is scaled down to
     */
    private double scaleFactor;

    /**
     * Creates a Navigator dialog that displays a scaled down version of the playpen.
     * 
     * @param session Session of the architect frame creating this dialog.
     * @param location Top right corner where this dialog should be placed.
     */
    public Navigator(ArchitectSwingSession session, Point location) {
        super(session.getArchitectFrame(), Messages.getString("Navigator.name")); //$NON-NLS-1$
        this.pp = session.getPlayPen();
        
        SQLPowerUtils.listenToHierarchy(pp.getSession().getTargetDatabase(), this);

        pp.getPlayPenContentPane().addPropertyChangeListener("location", this);
        pp.getPlayPenContentPane().addPropertyChangeListener("connectionPoints", this);
        pp.getPlayPenContentPane().addPropertyChangeListener("backgroundColor", this);
        pp.getPlayPenContentPane().addPropertyChangeListener("foregroundColor", this);
        pp.getPlayPenContentPane().addPropertyChangeListener("dashed", this);
        pp.getPlayPenContentPane().addPropertyChangeListener("rounded", this);
        
        navigationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                double width = Math.max(pp.getUsedArea().getWidth(), pp.getViewportSize().getWidth());
                double height = Math.max(pp.getUsedArea().getHeight(), pp.getViewportSize().getHeight());

                scaleFactor = Math.min(SCALED_IMAGE_WIDTH / width, SCALED_IMAGE_HEIGHT / height);
                ((Graphics2D) g).scale(scaleFactor, scaleFactor);
                RepaintManager currentManager = RepaintManager.currentManager(this);
                try {
                    currentManager.setDoubleBufferingEnabled(false);
                    if (pp.isRenderingAntialiased() == true) {
                        try {
                            pp.setRenderingAntialiased(false);
                            pp.paintComponent(g);
                        } finally {
                            pp.setRenderingAntialiased(true);
                        }
                    } else {
                        pp.paintComponent(g);
                    }
                } finally {
                    currentManager.setDoubleBufferingEnabled(true);
                }

                Rectangle view = pp.getVisibleRect();
                g.setColor(Color.GREEN);
                ((Graphics2D) g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.6f));
                g.drawRect(view.x, view.y, view.width, view.height-5);
            }
        };
        
        navigationPanel.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                adjustViewPort(e.getPoint());
            }
        });

        navigationPanel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                adjustViewPort(e.getPoint());
            }
        });
        
        navigationPanel.setPreferredSize(new Dimension(SCALED_IMAGE_WIDTH, SCALED_IMAGE_HEIGHT));
        getContentPane().add(navigationPanel);
        
        
        pack();
        location.translate(-getWidth(), 0);
        setLocation(location);
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        cleanup();
    }

    /**
     * Returns the corresponding point on the Playpen given a point on the
     * Navigator
     */
    private Point getPointOnPlaypen(Point pointOnNavigator) {
        return new Point((int) (pointOnNavigator.x / scaleFactor), (int) (pointOnNavigator.y / scaleFactor));
    }

    /**
     * Adjusts and moves the view portion of the playpen given a destination
     * point on the Navigator
     */
    private void adjustViewPort(Point pointOnNavigator) {
        Point pointOnPlaypen = getPointOnPlaypen(pointOnNavigator);
        Dimension viewSize = pp.getViewportSize();
        Dimension usedArea = pp.getUsedArea();

        // makes the given point the center of the resulting viewport
        pointOnPlaypen.translate(-viewSize.width / 2, -viewSize.height / 2);
        
        int x = pointOnPlaypen.x;
        int y = pointOnPlaypen.y;
        
        int xBoundary = Math.max(0, usedArea.width - viewSize.width);
        int yBoundary = Math.max(0, usedArea.height - viewSize.height);
        
        if (x < 0) {
            x = 0;
        } else if (x > xBoundary) {
            x = xBoundary;
        }
        
        if (y < 0) {
            y = 0;
        } else if (y > yBoundary) {
            y = yBoundary;
        }
        
        pp.setViewPosition(new Point(x, y));
        
        navigationPanel.repaint();
    }

    /**
     * Refreshes the navigator upon a visible property change
     */
    public void propertyChanged(PropertyChangeEvent evt) {
        navigationPanel.repaint();

    }
    
    public void propertyChange(PropertyChangeEvent evt) {
        navigationPanel.repaint();
    }

    /**
     * Refreshes the navigator upon the addition of a new PlaypenComponent
     */
    public void childAdded(SPChildEvent e) {
        SQLPowerUtils.listenToHierarchy(e.getChild(), this);
    }

    /**
     * Refreshes the navigator upon the removal of a PlaypenComponent
     */
    public void childRemoved(SPChildEvent e) {
        SQLPowerUtils.unlistenToHierarchy(e.getChild(), this);
    }
    
    public void transactionStarted(TransactionEvent e) {
        // no-op
    }
    
    public void transactionEnded(TransactionEvent e) {
        navigationPanel.repaint();
    }
    
    public void transactionRollback(TransactionEvent e) {
        // no-op
    }

    /**
     * Refreshes the navigator upon scrolling
     */
    public void adjustmentValueChanged(AdjustmentEvent e) {
        navigationPanel.repaint();
    }
    
    /**
     * Removes this listener from connected objects.
     */
    public void cleanup() {
        SQLPowerUtils.unlistenToHierarchy(pp.getSession().getTargetDatabase(), this);
        pp.getPlayPenContentPane().removePropertyChangeListener(this);
    }
}
