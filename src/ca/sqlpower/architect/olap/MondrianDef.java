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

package ca.sqlpower.architect.olap;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import mondrian.olap.DimensionType;
import mondrian.olap.Util;
import mondrian.rolap.sql.SqlQuery;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.ObservableElementList;

/**
 * This is the XML model for Mondrian schemas.
 * Revision is $Id: //open/mondrian/src/main/mondrian/olap/Mondrian.xml#71 $
 * <p>This class was generated from XOM model 'mondrian' on Mon Jul 28 16:17:02 EDT 2008
 */
public class MondrianDef {

    public static java.lang.Class getXMLDefClass()
    {
        return MondrianDef.class;
    }

    public static String[] _elements = {
        "Schema",
        "CubeDimension",
        "Cube",
        "VirtualCube",
        "CubeUsages",
        "CubeUsage",
        "VirtualCubeDimension",
        "VirtualCubeMeasure",
        "DimensionUsage",
        "Dimension",
        "Hierarchy",
        "Level",
        "Closure",
        "Property",
        "Measure",
        "CalculatedMember",
        "CalculatedMemberProperty",
        "NamedSet",
        "Formula",
        "MemberReaderParameter",
        "RelationOrJoin",
        "Relation",
        "View",
        "SQL",
        "Join",
        "Table",
        "InlineTable",
        "ColumnDefs",
        "ColumnDef",
        "Rows",
        "Row",
        "Value",
        "AggTable",
        "AggName",
        "AggPattern",
        "AggExclude",
        "AggColumnName",
        "AggFactCount",
        "AggIgnoreColumn",
        "AggForeignKey",
        "AggLevel",
        "AggMeasure",
        "Expression",
        "Column",
        "ExpressionView",
        "KeyExpression",
        "ParentExpression",
        "OrdinalExpression",
        "NameExpression",
        "CaptionExpression",
        "MeasureExpression",
        "Role",
        "Grant",
        "SchemaGrant",
        "CubeGrant",
        "DimensionGrant",
        "HierarchyGrant",
        "MemberGrant",
        "Union",
        "RoleUsage",
        "UserDefinedFunction",
        "Parameter"
    };

    /**
     * A schema is a collection of cubes and virtual cubes.
     * It can also contain shared dimensions (for use by those
     * cubes), named sets, roles, and declarations of
     * user-defined functions.
     */
    public static class Schema extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Schema()
        {
        }

        public Schema(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setMeasuresCaption((String)_parser.getAttribute("measuresCaption", "String", null, null, false));
                setDefaultRole((String)_parser.getAttribute("defaultRole", "String", null, null, false));
                _tempArray = _parser.getArray(Parameter.class, 0, 0);
                parameters = new ArrayList<Parameter>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    parameters.add((Parameter)_tempArray[_i]);
                }
                parametersEventList =  GlazedLists.eventList(parameters);
                parametersObservableList = new ObservableElementList<Parameter>(parametersEventList, GlazedLists.beanConnector(Parameter.class));
                _tempArray = _parser.getArray(Dimension.class, 0, 0);
                dimensions = new ArrayList<Dimension>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    dimensions.add((Dimension)_tempArray[_i]);
                }
                dimensionsEventList =  GlazedLists.eventList(dimensions);
                dimensionsObservableList = new ObservableElementList<Dimension>(dimensionsEventList, GlazedLists.beanConnector(Dimension.class));
                _tempArray = _parser.getArray(Cube.class, 0, 0);
                cubes = new ArrayList<Cube>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    cubes.add((Cube)_tempArray[_i]);
                }
                cubesEventList =  GlazedLists.eventList(cubes);
                cubesObservableList = new ObservableElementList<Cube>(cubesEventList, GlazedLists.beanConnector(Cube.class));
                _tempArray = _parser.getArray(VirtualCube.class, 0, 0);
                virtualCubes = new ArrayList<VirtualCube>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    virtualCubes.add((VirtualCube)_tempArray[_i]);
                }
                virtualCubesEventList =  GlazedLists.eventList(virtualCubes);
                virtualCubesObservableList = new ObservableElementList<VirtualCube>(virtualCubesEventList, GlazedLists.beanConnector(VirtualCube.class));
                _tempArray = _parser.getArray(NamedSet.class, 0, 0);
                namedSets = new ArrayList<NamedSet>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    namedSets.add((NamedSet)_tempArray[_i]);
                }
                namedSetsEventList =  GlazedLists.eventList(namedSets);
                namedSetsObservableList = new ObservableElementList<NamedSet>(namedSetsEventList, GlazedLists.beanConnector(NamedSet.class));
                _tempArray = _parser.getArray(Role.class, 0, 0);
                roles = new ArrayList<Role>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    roles.add((Role)_tempArray[_i]);
                }
                rolesEventList =  GlazedLists.eventList(roles);
                rolesObservableList = new ObservableElementList<Role>(rolesEventList, GlazedLists.beanConnector(Role.class));
                _tempArray = _parser.getArray(UserDefinedFunction.class, 0, 0);
                userDefinedFunctions = new ArrayList<UserDefinedFunction>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    userDefinedFunctions.add((UserDefinedFunction)_tempArray[_i]);
                }
                userDefinedFunctionsEventList =  GlazedLists.eventList(userDefinedFunctions);
                userDefinedFunctionsObservableList = new ObservableElementList<UserDefinedFunction>(userDefinedFunctionsEventList, GlazedLists.beanConnector(UserDefinedFunction.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String measuresCaption;  // optional attribute
        public String getMeasuresCaption() {
            return measuresCaption;
        }
        public void setMeasuresCaption(String val) {
            String oldval = this.measuresCaption;
            this.measuresCaption = val;
            _pcs.firePropertyChange("measuresCaption", oldval, val);
        }

        private String defaultRole;  // optional attribute
        public String getDefaultRole() {
            return defaultRole;
        }
        public void setDefaultRole(String val) {
            String oldval = this.defaultRole;
            this.defaultRole = val;
            _pcs.firePropertyChange("defaultRole", oldval, val);
        }


        /**
         * This schema's parameter definitions.
         */
        private List<Parameter> parameters;
        private EventList<Parameter> parametersEventList;
        private ObservableElementList<Parameter> parametersObservableList;

        public EventList<Parameter> getParametersEventList() {
            return parametersEventList;
        }
        public ObservableElementList<Parameter> getParametersObservableList() {
            return parametersObservableList;
        }

        /**
         * Shared dimensions in this schema.
         */
        private List<Dimension> dimensions;
        private EventList<Dimension> dimensionsEventList;
        private ObservableElementList<Dimension> dimensionsObservableList;

        public EventList<Dimension> getDimensionsEventList() {
            return dimensionsEventList;
        }
        public ObservableElementList<Dimension> getDimensionsObservableList() {
            return dimensionsObservableList;
        }

        /**
         * Cubes in this schema.
         */
        private List<Cube> cubes;
        private EventList<Cube> cubesEventList;
        private ObservableElementList<Cube> cubesObservableList;

        public EventList<Cube> getCubesEventList() {
            return cubesEventList;
        }
        public ObservableElementList<Cube> getCubesObservableList() {
            return cubesObservableList;
        }

        /**
         * Virtual cubes in this schema.
         */
        private List<VirtualCube> virtualCubes;
        private EventList<VirtualCube> virtualCubesEventList;
        private ObservableElementList<VirtualCube> virtualCubesObservableList;

        public EventList<VirtualCube> getVirtualCubesEventList() {
            return virtualCubesEventList;
        }
        public ObservableElementList<VirtualCube> getVirtualCubesObservableList() {
            return virtualCubesObservableList;
        }

        /**
         * Named sets in this schema.
         */
        private List<NamedSet> namedSets;
        private EventList<NamedSet> namedSetsEventList;
        private ObservableElementList<NamedSet> namedSetsObservableList;

        public EventList<NamedSet> getNamedSetsEventList() {
            return namedSetsEventList;
        }
        public ObservableElementList<NamedSet> getNamedSetsObservableList() {
            return namedSetsObservableList;
        }

        /**
         * Roles in this schema.
         */
        private List<Role> roles;
        private EventList<Role> rolesEventList;
        private ObservableElementList<Role> rolesObservableList;

        public EventList<Role> getRolesEventList() {
            return rolesEventList;
        }
        public ObservableElementList<Role> getRolesObservableList() {
            return rolesObservableList;
        }

        /**
         * Declarations of user-defined functions in this schema.
         */
        private List<UserDefinedFunction> userDefinedFunctions;
        private EventList<UserDefinedFunction> userDefinedFunctionsEventList;
        private ObservableElementList<UserDefinedFunction> userDefinedFunctionsObservableList;

        public EventList<UserDefinedFunction> getUserDefinedFunctionsEventList() {
            return userDefinedFunctionsEventList;
        }
        public ObservableElementList<UserDefinedFunction> getUserDefinedFunctionsObservableList() {
            return userDefinedFunctionsObservableList;
        }


        public String getName()
        {
            return "Schema";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "measuresCaption", getMeasuresCaption(), _indent+1);
            displayAttribute(_out, "defaultRole", getDefaultRole(), _indent+1);
            displayElementArray(_out, "parameters", (Parameter[])getParametersEventList().toArray(), _indent+1);
            displayElementArray(_out, "dimensions", (Dimension[])getDimensionsEventList().toArray(), _indent+1);
            displayElementArray(_out, "cubes", (Cube[])getCubesEventList().toArray(), _indent+1);
            displayElementArray(_out, "virtualCubes", (VirtualCube[])getVirtualCubesEventList().toArray(), _indent+1);
            displayElementArray(_out, "namedSets", (NamedSet[])getNamedSetsEventList().toArray(), _indent+1);
            displayElementArray(_out, "roles", (Role[])getRolesEventList().toArray(), _indent+1);
            displayElementArray(_out, "userDefinedFunctions", (UserDefinedFunction[])getUserDefinedFunctionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Schema", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("measuresCaption", getMeasuresCaption())
                .add("defaultRole", getDefaultRole())
                );
            displayXMLElementArray(_out, (Parameter[])getParametersEventList().toArray());
            displayXMLElementArray(_out, (Dimension[])getDimensionsEventList().toArray());
            displayXMLElementArray(_out, (Cube[])getCubesEventList().toArray());
            displayXMLElementArray(_out, (VirtualCube[])getVirtualCubesEventList().toArray());
            displayXMLElementArray(_out, (NamedSet[])getNamedSetsEventList().toArray());
            displayXMLElementArray(_out, (Role[])getRolesEventList().toArray());
            displayXMLElementArray(_out, (UserDefinedFunction[])getUserDefinedFunctionsEventList().toArray());
            _out.endTag("Schema");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Schema _cother = (Schema)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("measuresCaption", getMeasuresCaption(), _cother.getMeasuresCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("defaultRole", getDefaultRole(), _cother.getDefaultRole(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("parameters", (Parameter[])getParametersEventList().toArray(), (Parameter[])_cother.getParametersEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("dimensions", (Dimension[])getDimensionsEventList().toArray(), (Dimension[])_cother.getDimensionsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("cubes", (Cube[])getCubesEventList().toArray(), (Cube[])_cother.getCubesEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("virtualCubes", (VirtualCube[])getVirtualCubesEventList().toArray(), (VirtualCube[])_cother.getVirtualCubesEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("namedSets", (NamedSet[])getNamedSetsEventList().toArray(), (NamedSet[])_cother.getNamedSetsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("roles", (Role[])getRolesEventList().toArray(), (Role[])_cother.getRolesEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("userDefinedFunctions", (UserDefinedFunction[])getUserDefinedFunctionsEventList().toArray(), (UserDefinedFunction[])_cother.getUserDefinedFunctionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
Cube getCube(String cubeName) {
                for (Cube cube : getCubesEventList()) {
                    if ((cube.getInstanceName()).equals(cubeName)) {
                        return cube;
                    }
                }
                throw Util.newInternal("Cannot find cube '" + cubeName + "'");
            }
            Dimension getPublicDimension(String dimensionName) {
                for (Dimension dim : getDimensionsEventList()) {
                    if ((dim.getInstanceName()).equals(dimensionName)) {
                        return dim;
                    }
                }
                throw Util.newInternal(
                    "Cannot find public dimension '" + dimensionName + "'");
            }
        // END pass-through code block ---
    }

    /**
     * A CubeDimension is either a usage of a Dimension ('shared
     * dimension', in MSOLAP parlance), or a 'private dimension'.
     */
    public static abstract class CubeDimension extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CubeDimension()
        {
        }

        public CubeDimension(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setForeignKey((String)_parser.getAttribute("foreignKey", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private String foreignKey;  // optional attribute
        public String getForeignKey() {
            return foreignKey;
        }
        public void setForeignKey(String val) {
            String oldval = this.foreignKey;
            this.foreignKey = val;
            _pcs.firePropertyChange("foreignKey", oldval, val);
        }



        public String getName()
        {
            return "CubeDimension";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "foreignKey", getForeignKey(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%CubeDimension;)", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("caption", getCaption())
                .add("foreignKey", getForeignKey())
                );
            _out.endTag("(%CubeDimension;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CubeDimension _cother = (CubeDimension)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("foreignKey", getForeignKey(), _cother.getForeignKey(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/**
             * Looks up the base dimension of this dimension. If this is a
             * usage of a shared dimension, returns the referenced dimension;
             * otherwise returns the dimension itself.
             *
             * <p>Never returns null; if the dimension cannot be
             * found, throws an error.
             *
             * @param schema Schema, never null
             * @pre schema != null
             * @post return != null
             */
            public abstract Dimension getDimension(Schema schema);
        // END pass-through code block ---
    }

    /**
     * Definition of a cube.
     */
    public static class Cube extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Cube()
        {
        }

        public Cube(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setDefaultMeasure((String)_parser.getAttribute("defaultMeasure", "String", null, null, false));
                setCache((Boolean)_parser.getAttribute("cache", "Boolean", "true", null, false));
                setEnabled((Boolean)_parser.getAttribute("enabled", "Boolean", "true", null, false));
                setFact((Relation)_parser.getElement(Relation.class, true));
                _tempArray = _parser.getArray(CubeDimension.class, 0, 0);
                dimensions = new ArrayList<CubeDimension>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    dimensions.add((CubeDimension)_tempArray[_i]);
                }
                dimensionsEventList =  GlazedLists.eventList(dimensions);
                dimensionsObservableList = new ObservableElementList<CubeDimension>(dimensionsEventList, GlazedLists.beanConnector(CubeDimension.class));
                _tempArray = _parser.getArray(Measure.class, 0, 0);
                measures = new ArrayList<Measure>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    measures.add((Measure)_tempArray[_i]);
                }
                measuresEventList =  GlazedLists.eventList(measures);
                measuresObservableList = new ObservableElementList<Measure>(measuresEventList, GlazedLists.beanConnector(Measure.class));
                _tempArray = _parser.getArray(CalculatedMember.class, 0, 0);
                calculatedMembers = new ArrayList<CalculatedMember>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    calculatedMembers.add((CalculatedMember)_tempArray[_i]);
                }
                calculatedMembersEventList =  GlazedLists.eventList(calculatedMembers);
                calculatedMembersObservableList = new ObservableElementList<CalculatedMember>(calculatedMembersEventList, GlazedLists.beanConnector(CalculatedMember.class));
                _tempArray = _parser.getArray(NamedSet.class, 0, 0);
                namedSets = new ArrayList<NamedSet>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    namedSets.add((NamedSet)_tempArray[_i]);
                }
                namedSetsEventList =  GlazedLists.eventList(namedSets);
                namedSetsObservableList = new ObservableElementList<NamedSet>(namedSetsEventList, GlazedLists.beanConnector(NamedSet.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private String defaultMeasure;  // optional attribute
        public String getDefaultMeasure() {
            return defaultMeasure;
        }
        public void setDefaultMeasure(String val) {
            String oldval = this.defaultMeasure;
            this.defaultMeasure = val;
            _pcs.firePropertyChange("defaultMeasure", oldval, val);
        }

        private Boolean cache;  // attribute default: true
        public Boolean getCache() {
            return cache;
        }
        public void setCache(Boolean val) {
            Boolean oldval = this.cache;
            this.cache = val;
            _pcs.firePropertyChange("cache", oldval, val);
        }

        private Boolean enabled;  // attribute default: true
        public Boolean getEnabled() {
            return enabled;
        }
        public void setEnabled(Boolean val) {
            Boolean oldval = this.enabled;
            this.enabled = val;
            _pcs.firePropertyChange("enabled", oldval, val);
        }


        /**
         * The fact table is the source of all measures in this cube. If
         * this is a Table and the schema name is not
         * present, table name is left unqualified.
         */
        private Relation fact;  //
        public Relation getFact() {
            return fact;
        }
        public void setFact(Relation val) {
            Relation oldval = this.fact;
            this.fact = val;
            _pcs.firePropertyChange("fact", oldval, val);
        }

        /**
         */
        private List<CubeDimension> dimensions;
        private EventList<CubeDimension> dimensionsEventList;
        private ObservableElementList<CubeDimension> dimensionsObservableList;

        public EventList<CubeDimension> getDimensionsEventList() {
            return dimensionsEventList;
        }
        public ObservableElementList<CubeDimension> getDimensionsObservableList() {
            return dimensionsObservableList;
        }

        /**
         */
        private List<Measure> measures;
        private EventList<Measure> measuresEventList;
        private ObservableElementList<Measure> measuresObservableList;

        public EventList<Measure> getMeasuresEventList() {
            return measuresEventList;
        }
        public ObservableElementList<Measure> getMeasuresObservableList() {
            return measuresObservableList;
        }

        /**
         * Calculated members in this cube.
         */
        private List<CalculatedMember> calculatedMembers;
        private EventList<CalculatedMember> calculatedMembersEventList;
        private ObservableElementList<CalculatedMember> calculatedMembersObservableList;

        public EventList<CalculatedMember> getCalculatedMembersEventList() {
            return calculatedMembersEventList;
        }
        public ObservableElementList<CalculatedMember> getCalculatedMembersObservableList() {
            return calculatedMembersObservableList;
        }

        /**
         * Named sets in this cube.
         */
        private List<NamedSet> namedSets;
        private EventList<NamedSet> namedSetsEventList;
        private ObservableElementList<NamedSet> namedSetsObservableList;

        public EventList<NamedSet> getNamedSetsEventList() {
            return namedSetsEventList;
        }
        public ObservableElementList<NamedSet> getNamedSetsObservableList() {
            return namedSetsObservableList;
        }


        public String getName()
        {
            return "Cube";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "defaultMeasure", getDefaultMeasure(), _indent+1);
            displayAttribute(_out, "cache", getCache(), _indent+1);
            displayAttribute(_out, "enabled", getEnabled(), _indent+1);
            displayElement(_out, "fact", getFact(), _indent+1);
            displayElementArray(_out, "dimensions", (CubeDimension[])getDimensionsEventList().toArray(), _indent+1);
            displayElementArray(_out, "measures", (Measure[])getMeasuresEventList().toArray(), _indent+1);
            displayElementArray(_out, "calculatedMembers", (CalculatedMember[])getCalculatedMembersEventList().toArray(), _indent+1);
            displayElementArray(_out, "namedSets", (NamedSet[])getNamedSetsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Cube", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("caption", getCaption())
                .add("defaultMeasure", getDefaultMeasure())
                .add("cache", getCache())
                .add("enabled", getEnabled())
                );
            displayXMLElement(_out, getFact());
            displayXMLElementArray(_out, (CubeDimension[])getDimensionsEventList().toArray());
            displayXMLElementArray(_out, (Measure[])getMeasuresEventList().toArray());
            displayXMLElementArray(_out, (CalculatedMember[])getCalculatedMembersEventList().toArray());
            displayXMLElementArray(_out, (NamedSet[])getNamedSetsEventList().toArray());
            _out.endTag("Cube");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Cube _cother = (Cube)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("defaultMeasure", getDefaultMeasure(), _cother.getDefaultMeasure(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("cache", getCache(), _cother.getCache(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("enabled", getEnabled(), _cother.getEnabled(), _out, _indent+1);
            _diff = _diff && displayElementDiff("fact", getFact(), _cother.getFact(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("dimensions", (CubeDimension[])getDimensionsEventList().toArray(), (CubeDimension[])_cother.getDimensionsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("measures", (Measure[])getMeasuresEventList().toArray(), (Measure[])_cother.getMeasuresEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("calculatedMembers", (CalculatedMember[])getCalculatedMembersEventList().toArray(), (CalculatedMember[])_cother.getCalculatedMembersEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("namedSets", (NamedSet[])getNamedSetsEventList().toArray(), (NamedSet[])_cother.getNamedSetsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public boolean isEnabled() {
                return enabled.booleanValue();
            }
            Dimension getDimension(Schema xmlSchema, String dimensionName) {
                 for (CubeDimension dim : getDimensionsEventList()) {
                    if ((dim.getInstanceName()).equals(dimensionName)) {
                        return dim.getDimension(xmlSchema);
                    }
                }
                throw Util.newInternal(
                    "Cannot find dimension '" + dimensionName + "' in cube '" +
                    name + "'");
            }
        // END pass-through code block ---
    }

    /**
     * A VirtualCube is a set of dimensions and
     * measures gleaned from other cubes.
     */
    public static class VirtualCube extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public VirtualCube()
        {
        }

        public VirtualCube(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setEnabled((Boolean)_parser.getAttribute("enabled", "Boolean", "true", null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setDefaultMeasure((String)_parser.getAttribute("defaultMeasure", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setCubeUsage((CubeUsages)_parser.getElement(CubeUsages.class, false));
                _tempArray = _parser.getArray(VirtualCubeDimension.class, 0, 0);
                dimensions = new ArrayList<VirtualCubeDimension>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    dimensions.add((VirtualCubeDimension)_tempArray[_i]);
                }
                dimensionsEventList =  GlazedLists.eventList(dimensions);
                dimensionsObservableList = new ObservableElementList<VirtualCubeDimension>(dimensionsEventList, GlazedLists.beanConnector(VirtualCubeDimension.class));
                _tempArray = _parser.getArray(VirtualCubeMeasure.class, 0, 0);
                measures = new ArrayList<VirtualCubeMeasure>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    measures.add((VirtualCubeMeasure)_tempArray[_i]);
                }
                measuresEventList =  GlazedLists.eventList(measures);
                measuresObservableList = new ObservableElementList<VirtualCubeMeasure>(measuresEventList, GlazedLists.beanConnector(VirtualCubeMeasure.class));
                _tempArray = _parser.getArray(CalculatedMember.class, 0, 0);
                calculatedMembers = new ArrayList<CalculatedMember>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    calculatedMembers.add((CalculatedMember)_tempArray[_i]);
                }
                calculatedMembersEventList =  GlazedLists.eventList(calculatedMembers);
                calculatedMembersObservableList = new ObservableElementList<CalculatedMember>(calculatedMembersEventList, GlazedLists.beanConnector(CalculatedMember.class));
                _tempArray = _parser.getArray(NamedSet.class, 0, 0);
                namedSets = new ArrayList<NamedSet>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    namedSets.add((NamedSet)_tempArray[_i]);
                }
                namedSetsEventList =  GlazedLists.eventList(namedSets);
                namedSetsObservableList = new ObservableElementList<NamedSet>(namedSetsEventList, GlazedLists.beanConnector(NamedSet.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private Boolean enabled;  // attribute default: true
        public Boolean getEnabled() {
            return enabled;
        }
        public void setEnabled(Boolean val) {
            Boolean oldval = this.enabled;
            this.enabled = val;
            _pcs.firePropertyChange("enabled", oldval, val);
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String defaultMeasure;  // optional attribute
        public String getDefaultMeasure() {
            return defaultMeasure;
        }
        public void setDefaultMeasure(String val) {
            String oldval = this.defaultMeasure;
            this.defaultMeasure = val;
            _pcs.firePropertyChange("defaultMeasure", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }


        /**
         */
        private CubeUsages cubeUsage;  //
        public CubeUsages getCubeUsage() {
            return cubeUsage;
        }
        public void setCubeUsage(CubeUsages val) {
            CubeUsages oldval = this.cubeUsage;
            this.cubeUsage = val;
            _pcs.firePropertyChange("cubeUsage", oldval, val);
        }

        /**
         */
        private List<VirtualCubeDimension> dimensions;
        private EventList<VirtualCubeDimension> dimensionsEventList;
        private ObservableElementList<VirtualCubeDimension> dimensionsObservableList;

        public EventList<VirtualCubeDimension> getDimensionsEventList() {
            return dimensionsEventList;
        }
        public ObservableElementList<VirtualCubeDimension> getDimensionsObservableList() {
            return dimensionsObservableList;
        }

        /**
         */
        private List<VirtualCubeMeasure> measures;
        private EventList<VirtualCubeMeasure> measuresEventList;
        private ObservableElementList<VirtualCubeMeasure> measuresObservableList;

        public EventList<VirtualCubeMeasure> getMeasuresEventList() {
            return measuresEventList;
        }
        public ObservableElementList<VirtualCubeMeasure> getMeasuresObservableList() {
            return measuresObservableList;
        }

        /**
         * Calculated members that belong to this virtual cube.
         * (Calculated members inherited from other cubes should not be
         * in this list.)
         */
        private List<CalculatedMember> calculatedMembers;
        private EventList<CalculatedMember> calculatedMembersEventList;
        private ObservableElementList<CalculatedMember> calculatedMembersObservableList;

        public EventList<CalculatedMember> getCalculatedMembersEventList() {
            return calculatedMembersEventList;
        }
        public ObservableElementList<CalculatedMember> getCalculatedMembersObservableList() {
            return calculatedMembersObservableList;
        }

        /**
         * Named sets in this cube.
         */
        private List<NamedSet> namedSets;
        private EventList<NamedSet> namedSetsEventList;
        private ObservableElementList<NamedSet> namedSetsObservableList;

        public EventList<NamedSet> getNamedSetsEventList() {
            return namedSetsEventList;
        }
        public ObservableElementList<NamedSet> getNamedSetsObservableList() {
            return namedSetsObservableList;
        }


        public String getName()
        {
            return "VirtualCube";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "enabled", getEnabled(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "defaultMeasure", getDefaultMeasure(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayElement(_out, "cubeUsage", getCubeUsage(), _indent+1);
            displayElementArray(_out, "dimensions", (VirtualCubeDimension[])getDimensionsEventList().toArray(), _indent+1);
            displayElementArray(_out, "measures", (VirtualCubeMeasure[])getMeasuresEventList().toArray(), _indent+1);
            displayElementArray(_out, "calculatedMembers", (CalculatedMember[])getCalculatedMembersEventList().toArray(), _indent+1);
            displayElementArray(_out, "namedSets", (NamedSet[])getNamedSetsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("VirtualCube", new org.eigenbase.xom.XMLAttrVector()
                .add("enabled", getEnabled())
                .add("name", getInstanceName())
                .add("defaultMeasure", getDefaultMeasure())
                .add("caption", getCaption())
                );
            displayXMLElement(_out, getCubeUsage());
            displayXMLElementArray(_out, (VirtualCubeDimension[])getDimensionsEventList().toArray());
            displayXMLElementArray(_out, (VirtualCubeMeasure[])getMeasuresEventList().toArray());
            displayXMLElementArray(_out, (CalculatedMember[])getCalculatedMembersEventList().toArray());
            displayXMLElementArray(_out, (NamedSet[])getNamedSetsEventList().toArray());
            _out.endTag("VirtualCube");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            VirtualCube _cother = (VirtualCube)_other;
            _diff = _diff && displayAttributeDiff("enabled", getEnabled(), _cother.getEnabled(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("defaultMeasure", getDefaultMeasure(), _cother.getDefaultMeasure(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayElementDiff("cubeUsage", getCubeUsage(), _cother.getCubeUsage(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("dimensions", (VirtualCubeDimension[])getDimensionsEventList().toArray(), (VirtualCubeDimension[])_cother.getDimensionsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("measures", (VirtualCubeMeasure[])getMeasuresEventList().toArray(), (VirtualCubeMeasure[])_cother.getMeasuresEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("calculatedMembers", (CalculatedMember[])getCalculatedMembersEventList().toArray(), (CalculatedMember[])_cother.getCalculatedMembersEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("namedSets", (NamedSet[])getNamedSetsEventList().toArray(), (NamedSet[])_cother.getNamedSetsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public boolean isEnabled() {
                return enabled.booleanValue();
            }
        // END pass-through code block ---
    }

    /**
     * List of base cubes used by the virtual cube.
     */
    public static class CubeUsages extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CubeUsages()
        {
        }

        public CubeUsages(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(CubeUsage.class, 1, 0);
                cubeUsages = new ArrayList<CubeUsage>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    cubeUsages.add((CubeUsage)_tempArray[_i]);
                }
                cubeUsagesEventList =  GlazedLists.eventList(cubeUsages);
                cubeUsagesObservableList = new ObservableElementList<CubeUsage>(cubeUsagesEventList, GlazedLists.beanConnector(CubeUsage.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        /**
         */
        private List<CubeUsage> cubeUsages;
        private EventList<CubeUsage> cubeUsagesEventList;
        private ObservableElementList<CubeUsage> cubeUsagesObservableList;

        public EventList<CubeUsage> getCubeUsagesEventList() {
            return cubeUsagesEventList;
        }
        public ObservableElementList<CubeUsage> getCubeUsagesObservableList() {
            return cubeUsagesObservableList;
        }


        public String getName()
        {
            return "CubeUsages";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "cubeUsages", (CubeUsage[])getCubeUsagesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CubeUsages", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (CubeUsage[])getCubeUsagesEventList().toArray());
            _out.endTag("CubeUsages");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CubeUsages _cother = (CubeUsages)_other;
            _diff = _diff && displayElementArrayDiff("cubeUsages", (CubeUsage[])getCubeUsagesEventList().toArray(), (CubeUsage[])_cother.getCubeUsagesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class CubeUsage extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CubeUsage()
        {
        }

        public CubeUsage(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setCubeName((String)_parser.getAttribute("cubeName", "String", null, null, true));
                setIgnoreUnrelatedDimensions((Boolean)_parser.getAttribute("ignoreUnrelatedDimensions", "Boolean", "false", null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String cubeName;  // required attribute
        public String getCubeName() {
            return cubeName;
        }
        public void setCubeName(String val) {
            String oldval = this.cubeName;
            this.cubeName = val;
            _pcs.firePropertyChange("cubeName", oldval, val);
        }

        private Boolean ignoreUnrelatedDimensions;  // attribute default: false
        public Boolean getIgnoreUnrelatedDimensions() {
            return ignoreUnrelatedDimensions;
        }
        public void setIgnoreUnrelatedDimensions(Boolean val) {
            Boolean oldval = this.ignoreUnrelatedDimensions;
            this.ignoreUnrelatedDimensions = val;
            _pcs.firePropertyChange("ignoreUnrelatedDimensions", oldval, val);
        }



        public String getName()
        {
            return "CubeUsage";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "cubeName", getCubeName(), _indent+1);
            displayAttribute(_out, "ignoreUnrelatedDimensions", getIgnoreUnrelatedDimensions(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CubeUsage", new org.eigenbase.xom.XMLAttrVector()
                .add("cubeName", getCubeName())
                .add("ignoreUnrelatedDimensions", getIgnoreUnrelatedDimensions())
                );
            _out.endTag("CubeUsage");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CubeUsage _cother = (CubeUsage)_other;
            _diff = _diff && displayAttributeDiff("cubeName", getCubeName(), _cother.getCubeName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("ignoreUnrelatedDimensions", getIgnoreUnrelatedDimensions(), _cother.getIgnoreUnrelatedDimensions(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A VirtualCubeDimension is a usage of a Dimension in a VirtualCube.
     */
    public static class VirtualCubeDimension extends CubeDimension
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public VirtualCubeDimension()
        {
        }

        public VirtualCubeDimension(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setCubeName((String)_parser.getAttribute("cubeName", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setForeignKey((String)_parser.getAttribute("foreignKey", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String cubeName;  // optional attribute
        public String getCubeName() {
            return cubeName;
        }
        public void setCubeName(String val) {
            String oldval = this.cubeName;
            this.cubeName = val;
            _pcs.firePropertyChange("cubeName", oldval, val);
        }



        public String getName()
        {
            return "VirtualCubeDimension";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "cubeName", getCubeName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "foreignKey", getForeignKey(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("VirtualCubeDimension", new org.eigenbase.xom.XMLAttrVector()
                .add("cubeName", getCubeName())
                .add("caption", getCaption())
                .add("foreignKey", getForeignKey())
                .add("name", getInstanceName())
                );
            _out.endTag("VirtualCubeDimension");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            VirtualCubeDimension _cother = (VirtualCubeDimension)_other;
            _diff = _diff && displayAttributeDiff("cubeName", getCubeName(), _cother.getCubeName(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
// implement CubeDimension
            public Dimension getDimension(Schema schema) {
                Util.assertPrecondition(schema != null, "schema != null");
                if (cubeName == null) {
                    return schema.getPublicDimension(getInstanceName());
                } else {
                    Cube cube = schema.getCube(cubeName);
                    return cube.getDimension(schema, getInstanceName());
                }
            }
        // END pass-through code block ---
    }

    /**
     * A VirtualCubeMeasure is a usage of a Measure in a VirtualCube.
     */
    public static class VirtualCubeMeasure extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public VirtualCubeMeasure()
        {
        }

        public VirtualCubeMeasure(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setCubeName((String)_parser.getAttribute("cubeName", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setVisible((Boolean)_parser.getAttribute("visible", "Boolean", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String cubeName;  // optional attribute
        public String getCubeName() {
            return cubeName;
        }
        public void setCubeName(String val) {
            String oldval = this.cubeName;
            this.cubeName = val;
            _pcs.firePropertyChange("cubeName", oldval, val);
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private Boolean visible;  // optional attribute
        public Boolean getVisible() {
            return visible;
        }
        public void setVisible(Boolean val) {
            Boolean oldval = this.visible;
            this.visible = val;
            _pcs.firePropertyChange("visible", oldval, val);
        }



        public String getName()
        {
            return "VirtualCubeMeasure";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "cubeName", getCubeName(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "visible", getVisible(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("VirtualCubeMeasure", new org.eigenbase.xom.XMLAttrVector()
                .add("cubeName", getCubeName())
                .add("name", getInstanceName())
                .add("visible", getVisible())
                );
            _out.endTag("VirtualCubeMeasure");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            VirtualCubeMeasure _cother = (VirtualCubeMeasure)_other;
            _diff = _diff && displayAttributeDiff("cubeName", getCubeName(), _cother.getCubeName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("visible", getVisible(), _cother.getVisible(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A DimensionUsage is usage of a shared
     * Dimension within the context of a cube.
     */
    public static class DimensionUsage extends CubeDimension
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public DimensionUsage()
        {
        }

        public DimensionUsage(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setSource((String)_parser.getAttribute("source", "String", null, null, true));
                setLevel((String)_parser.getAttribute("level", "String", null, null, false));
                setUsagePrefix((String)_parser.getAttribute("usagePrefix", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setForeignKey((String)_parser.getAttribute("foreignKey", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String source;  // required attribute
        public String getSource() {
            return source;
        }
        public void setSource(String val) {
            String oldval = this.source;
            this.source = val;
            _pcs.firePropertyChange("source", oldval, val);
        }

        private String level;  // optional attribute
        public String getLevel() {
            return level;
        }
        public void setLevel(String val) {
            String oldval = this.level;
            this.level = val;
            _pcs.firePropertyChange("level", oldval, val);
        }

        private String usagePrefix;  // optional attribute
        public String getUsagePrefix() {
            return usagePrefix;
        }
        public void setUsagePrefix(String val) {
            String oldval = this.usagePrefix;
            this.usagePrefix = val;
            _pcs.firePropertyChange("usagePrefix", oldval, val);
        }



        public String getName()
        {
            return "DimensionUsage";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "source", getSource(), _indent+1);
            displayAttribute(_out, "level", getLevel(), _indent+1);
            displayAttribute(_out, "usagePrefix", getUsagePrefix(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "foreignKey", getForeignKey(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("DimensionUsage", new org.eigenbase.xom.XMLAttrVector()
                .add("source", getSource())
                .add("level", getLevel())
                .add("usagePrefix", getUsagePrefix())
                .add("name", getInstanceName())
                .add("caption", getCaption())
                .add("foreignKey", getForeignKey())
                );
            _out.endTag("DimensionUsage");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            DimensionUsage _cother = (DimensionUsage)_other;
            _diff = _diff && displayAttributeDiff("source", getSource(), _cother.getSource(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("level", getLevel(), _cother.getLevel(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("usagePrefix", getUsagePrefix(), _cother.getUsagePrefix(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
// implement CubeDimension
            public Dimension getDimension(Schema schema) {
                Util.assertPrecondition(schema != null, "schema != null");
                for (Dimension dim : schema.getDimensionsEventList()) {
                    if ((dim.getInstanceName()).equals(source)) {
                        return dim;
                    }
                }
                throw Util.newInternal(
                    "Cannot find shared dimension '" + source + "'");
            }
        // END pass-through code block ---
    }

    /**
     * A Dimension is a collection of hierarchies. There are
     * two kinds: a public dimension belongs to a
     * Schema, and be used by several cubes; a
     * private dimension belongs to a
     * Cube. The foreignKey field is only
     * applicable to private dimensions.
     */
    public static class Dimension extends CubeDimension
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Dimension()
        {
        }

        public Dimension(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceType((String)_parser.getAttribute("type", "String", null, _type_values, false));
                setUsagePrefix((String)_parser.getAttribute("usagePrefix", "String", null, null, false));
                setForeignKey((String)_parser.getAttribute("foreignKey", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                _tempArray = _parser.getArray(Hierarchy.class, 0, 0);
                hierarchies = new ArrayList<Hierarchy>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    hierarchies.add((Hierarchy)_tempArray[_i]);
                }
                hierarchiesEventList =  GlazedLists.eventList(hierarchies);
                hierarchiesObservableList = new ObservableElementList<Hierarchy>(hierarchiesEventList, GlazedLists.beanConnector(Hierarchy.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        /** Allowable values for {@link #type}. */
        public static final String[] _type_values = {"StandardDimension", "TimeDimension"};
        private String type;  // optional attribute
        public String getInstanceType() {
            return type;
        }
        public void setInstanceType(String val) {
            String oldval = this.type;
            this.type = val;
            _pcs.firePropertyChange("instanceType", oldval, val);
        }

        private String usagePrefix;  // optional attribute
        public String getUsagePrefix() {
            return usagePrefix;
        }
        public void setUsagePrefix(String val) {
            String oldval = this.usagePrefix;
            this.usagePrefix = val;
            _pcs.firePropertyChange("usagePrefix", oldval, val);
        }


        /**
         */
        private List<Hierarchy> hierarchies;
        private EventList<Hierarchy> hierarchiesEventList;
        private ObservableElementList<Hierarchy> hierarchiesObservableList;

        public EventList<Hierarchy> getHierarchiesEventList() {
            return hierarchiesEventList;
        }
        public ObservableElementList<Hierarchy> getHierarchiesObservableList() {
            return hierarchiesObservableList;
        }


        public String getName()
        {
            return "Dimension";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "type", getInstanceType(), _indent+1);
            displayAttribute(_out, "usagePrefix", getUsagePrefix(), _indent+1);
            displayAttribute(_out, "foreignKey", getForeignKey(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayElementArray(_out, "hierarchies", (Hierarchy[])getHierarchiesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Dimension", new org.eigenbase.xom.XMLAttrVector()
                .add("type", getInstanceType())
                .add("usagePrefix", getUsagePrefix())
                .add("foreignKey", getForeignKey())
                .add("name", getInstanceName())
                .add("caption", getCaption())
                );
            displayXMLElementArray(_out, (Hierarchy[])getHierarchiesEventList().toArray());
            _out.endTag("Dimension");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Dimension _cother = (Dimension)_other;
            _diff = _diff && displayAttributeDiff("type", getInstanceType(), _cother.getInstanceType(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("usagePrefix", getUsagePrefix(), _cother.getUsagePrefix(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("hierarchies", (Hierarchy[])getHierarchiesEventList().toArray(), (Hierarchy[])_cother.getHierarchiesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
// implement CubeDimension
            public Dimension getDimension(Schema schema) {
                Util.assertPrecondition(schema != null, "schema != null");
                return this;
            }

            // Return the dimension's enumerated type.
            public DimensionType getDimensionType() {
                if (type == null) {
                    return null; //DimensionType.StandardDimension;
                } else {
                    return DimensionType.valueOf(type);
                }
            }
        // END pass-through code block ---
    }

    /**
     * Defines a hierarchy.
     * You must specify at most one <Relation>
     * or memberReaderClass. If you specify none, the
     * hierarchy is assumed to come from the same fact table of the
     * current cube.
     */
    public static class Hierarchy extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Hierarchy()
        {
        }

        public Hierarchy(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setHasAll((Boolean)_parser.getAttribute("hasAll", "Boolean", null, null, true));
                setAllMemberName((String)_parser.getAttribute("allMemberName", "String", null, null, false));
                setAllMemberCaption((String)_parser.getAttribute("allMemberCaption", "String", null, null, false));
                setAllLevelName((String)_parser.getAttribute("allLevelName", "String", null, null, false));
                setPrimaryKey((String)_parser.getAttribute("primaryKey", "String", null, null, false));
                setPrimaryKeyTable((String)_parser.getAttribute("primaryKeyTable", "String", null, null, false));
                setDefaultMember((String)_parser.getAttribute("defaultMember", "String", null, null, false));
                setMemberReaderClass((String)_parser.getAttribute("memberReaderClass", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setRelation((RelationOrJoin)_parser.getElement(RelationOrJoin.class, false));
                _tempArray = _parser.getArray(Level.class, 0, 0);
                levels = new ArrayList<Level>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    levels.add((Level)_tempArray[_i]);
                }
                levelsEventList =  GlazedLists.eventList(levels);
                levelsObservableList = new ObservableElementList<Level>(levelsEventList, GlazedLists.beanConnector(Level.class));
                _tempArray = _parser.getArray(MemberReaderParameter.class, 0, 0);
                memberReaderParameters = new ArrayList<MemberReaderParameter>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    memberReaderParameters.add((MemberReaderParameter)_tempArray[_i]);
                }
                memberReaderParametersEventList =  GlazedLists.eventList(memberReaderParameters);
                memberReaderParametersObservableList = new ObservableElementList<MemberReaderParameter>(memberReaderParametersEventList, GlazedLists.beanConnector(MemberReaderParameter.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private Boolean hasAll;  // required attribute
        public Boolean getHasAll() {
            return hasAll;
        }
        public void setHasAll(Boolean val) {
            Boolean oldval = this.hasAll;
            this.hasAll = val;
            _pcs.firePropertyChange("hasAll", oldval, val);
        }

        private String allMemberName;  // optional attribute
        public String getAllMemberName() {
            return allMemberName;
        }
        public void setAllMemberName(String val) {
            String oldval = this.allMemberName;
            this.allMemberName = val;
            _pcs.firePropertyChange("allMemberName", oldval, val);
        }

        private String allMemberCaption;  // optional attribute
        public String getAllMemberCaption() {
            return allMemberCaption;
        }
        public void setAllMemberCaption(String val) {
            String oldval = this.allMemberCaption;
            this.allMemberCaption = val;
            _pcs.firePropertyChange("allMemberCaption", oldval, val);
        }

        private String allLevelName;  // optional attribute
        public String getAllLevelName() {
            return allLevelName;
        }
        public void setAllLevelName(String val) {
            String oldval = this.allLevelName;
            this.allLevelName = val;
            _pcs.firePropertyChange("allLevelName", oldval, val);
        }

        private String primaryKey;  // optional attribute
        public String getPrimaryKey() {
            return primaryKey;
        }
        public void setPrimaryKey(String val) {
            String oldval = this.primaryKey;
            this.primaryKey = val;
            _pcs.firePropertyChange("primaryKey", oldval, val);
        }

        private String primaryKeyTable;  // optional attribute
        public String getPrimaryKeyTable() {
            return primaryKeyTable;
        }
        public void setPrimaryKeyTable(String val) {
            String oldval = this.primaryKeyTable;
            this.primaryKeyTable = val;
            _pcs.firePropertyChange("primaryKeyTable", oldval, val);
        }

        private String defaultMember;  // optional attribute
        public String getDefaultMember() {
            return defaultMember;
        }
        public void setDefaultMember(String val) {
            String oldval = this.defaultMember;
            this.defaultMember = val;
            _pcs.firePropertyChange("defaultMember", oldval, val);
        }

        private String memberReaderClass;  // optional attribute
        public String getMemberReaderClass() {
            return memberReaderClass;
        }
        public void setMemberReaderClass(String val) {
            String oldval = this.memberReaderClass;
            this.memberReaderClass = val;
            _pcs.firePropertyChange("memberReaderClass", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }


        /**
         * The {@link MondrianDef.Table table},
         * {@link MondrianDef.Join set of tables},
         * {@link MondrianDef.View SQL statement}, or
         * {@link MondrianDef.InlineTable inline table}
         * which populates this hierarchy.
         */
        private RelationOrJoin relation;  //
        public RelationOrJoin getRelation() {
            return relation;
        }
        public void setRelation(RelationOrJoin val) {
            RelationOrJoin oldval = this.relation;
            this.relation = val;
            _pcs.firePropertyChange("relation", oldval, val);
        }

        /**
         */
        private List<Level> levels;
        private EventList<Level> levelsEventList;
        private ObservableElementList<Level> levelsObservableList;

        public EventList<Level> getLevelsEventList() {
            return levelsEventList;
        }
        public ObservableElementList<Level> getLevelsObservableList() {
            return levelsObservableList;
        }

        private List<MemberReaderParameter> memberReaderParameters;
        private EventList<MemberReaderParameter> memberReaderParametersEventList;
        private ObservableElementList<MemberReaderParameter> memberReaderParametersObservableList;

        public EventList<MemberReaderParameter> getMemberReaderParametersEventList() {
            return memberReaderParametersEventList;
        }
        public ObservableElementList<MemberReaderParameter> getMemberReaderParametersObservableList() {
            return memberReaderParametersObservableList;
        }


        public String getName()
        {
            return "Hierarchy";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "hasAll", getHasAll(), _indent+1);
            displayAttribute(_out, "allMemberName", getAllMemberName(), _indent+1);
            displayAttribute(_out, "allMemberCaption", getAllMemberCaption(), _indent+1);
            displayAttribute(_out, "allLevelName", getAllLevelName(), _indent+1);
            displayAttribute(_out, "primaryKey", getPrimaryKey(), _indent+1);
            displayAttribute(_out, "primaryKeyTable", getPrimaryKeyTable(), _indent+1);
            displayAttribute(_out, "defaultMember", getDefaultMember(), _indent+1);
            displayAttribute(_out, "memberReaderClass", getMemberReaderClass(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayElement(_out, "relation", getRelation(), _indent+1);
            displayElementArray(_out, "levels", (Level[])getLevelsEventList().toArray(), _indent+1);
            displayElementArray(_out, "memberReaderParameters", (MemberReaderParameter[])getMemberReaderParametersEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Hierarchy", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("hasAll", getHasAll())
                .add("allMemberName", getAllMemberName())
                .add("allMemberCaption", getAllMemberCaption())
                .add("allLevelName", getAllLevelName())
                .add("primaryKey", getPrimaryKey())
                .add("primaryKeyTable", getPrimaryKeyTable())
                .add("defaultMember", getDefaultMember())
                .add("memberReaderClass", getMemberReaderClass())
                .add("caption", getCaption())
                );
            displayXMLElement(_out, getRelation());
            displayXMLElementArray(_out, (Level[])getLevelsEventList().toArray());
            displayXMLElementArray(_out, (MemberReaderParameter[])getMemberReaderParametersEventList().toArray());
            _out.endTag("Hierarchy");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Hierarchy _cother = (Hierarchy)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("hasAll", getHasAll(), _cother.getHasAll(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("allMemberName", getAllMemberName(), _cother.getAllMemberName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("allMemberCaption", getAllMemberCaption(), _cother.getAllMemberCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("allLevelName", getAllLevelName(), _cother.getAllLevelName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("primaryKey", getPrimaryKey(), _cother.getPrimaryKey(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("primaryKeyTable", getPrimaryKeyTable(), _cother.getPrimaryKeyTable(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("defaultMember", getDefaultMember(), _cother.getDefaultMember(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("memberReaderClass", getMemberReaderClass(), _cother.getMemberReaderClass(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayElementDiff("relation", getRelation(), _cother.getRelation(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("levels", (Level[])getLevelsEventList().toArray(), (Level[])_cother.getLevelsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("memberReaderParameters", (MemberReaderParameter[])getMemberReaderParametersEventList().toArray(), (MemberReaderParameter[])_cother.getMemberReaderParametersEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class Level extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Level()
        {
        }

        public Level(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setApproxRowCount((String)_parser.getAttribute("approxRowCount", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setTable((String)_parser.getAttribute("table", "String", null, null, false));
                setColumn((String)_parser.getAttribute("column", "String", null, null, false));
                setNameColumn((String)_parser.getAttribute("nameColumn", "String", null, null, false));
                setOrdinalColumn((String)_parser.getAttribute("ordinalColumn", "String", null, null, false));
                setParentColumn((String)_parser.getAttribute("parentColumn", "String", null, null, false));
                setNullParentValue((String)_parser.getAttribute("nullParentValue", "String", null, null, false));
                setInstanceType((String)_parser.getAttribute("type", "String", "String", _type_values, false));
                setUniqueMembers((Boolean)_parser.getAttribute("uniqueMembers", "Boolean", "false", null, false));
                setLevelType((String)_parser.getAttribute("levelType", "String", "Regular", _levelType_values, false));
                setHideMemberIf((String)_parser.getAttribute("hideMemberIf", "String", "Never", _hideMemberIf_values, false));
                setFormatter((String)_parser.getAttribute("formatter", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setCaptionColumn((String)_parser.getAttribute("captionColumn", "String", null, null, false));
                setInstanceKeyExp((KeyExpression)_parser.getElement(KeyExpression.class, false));
                setInstanceNameExp((NameExpression)_parser.getElement(NameExpression.class, false));
                setInstanceOrdinalExp((OrdinalExpression)_parser.getElement(OrdinalExpression.class, false));
                setInstanceParentExp((ParentExpression)_parser.getElement(ParentExpression.class, false));
                setClosure((Closure)_parser.getElement(Closure.class, false));
                _tempArray = _parser.getArray(Property.class, 0, 0);
                properties = new ArrayList<Property>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    properties.add((Property)_tempArray[_i]);
                }
                propertiesEventList =  GlazedLists.eventList(properties);
                propertiesObservableList = new ObservableElementList<Property>(propertiesEventList, GlazedLists.beanConnector(Property.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String approxRowCount;  // optional attribute
        public String getApproxRowCount() {
            return approxRowCount;
        }
        public void setApproxRowCount(String val) {
            String oldval = this.approxRowCount;
            this.approxRowCount = val;
            _pcs.firePropertyChange("approxRowCount", oldval, val);
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String table;  // optional attribute
        public String getTable() {
            return table;
        }
        public void setTable(String val) {
            String oldval = this.table;
            this.table = val;
            _pcs.firePropertyChange("table", oldval, val);
        }

        private String column;  // optional attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }

        private String nameColumn;  // optional attribute
        public String getNameColumn() {
            return nameColumn;
        }
        public void setNameColumn(String val) {
            String oldval = this.nameColumn;
            this.nameColumn = val;
            _pcs.firePropertyChange("nameColumn", oldval, val);
        }

        private String ordinalColumn;  // optional attribute
        public String getOrdinalColumn() {
            return ordinalColumn;
        }
        public void setOrdinalColumn(String val) {
            String oldval = this.ordinalColumn;
            this.ordinalColumn = val;
            _pcs.firePropertyChange("ordinalColumn", oldval, val);
        }

        private String parentColumn;  // optional attribute
        public String getParentColumn() {
            return parentColumn;
        }
        public void setParentColumn(String val) {
            String oldval = this.parentColumn;
            this.parentColumn = val;
            _pcs.firePropertyChange("parentColumn", oldval, val);
        }

        private String nullParentValue;  // optional attribute
        public String getNullParentValue() {
            return nullParentValue;
        }
        public void setNullParentValue(String val) {
            String oldval = this.nullParentValue;
            this.nullParentValue = val;
            _pcs.firePropertyChange("nullParentValue", oldval, val);
        }

        /** Allowable values for {@link #type}. */
        public static final String[] _type_values = {"String", "Numeric", "Integer", "Boolean", "Date", "Time", "Timestamp"};
        private String type;  // attribute default: String
        public String getInstanceType() {
            return type;
        }
        public void setInstanceType(String val) {
            String oldval = this.type;
            this.type = val;
            _pcs.firePropertyChange("instanceType", oldval, val);
        }

        private Boolean uniqueMembers;  // attribute default: false
        public Boolean getUniqueMembers() {
            return uniqueMembers;
        }
        public void setUniqueMembers(Boolean val) {
            Boolean oldval = this.uniqueMembers;
            this.uniqueMembers = val;
            _pcs.firePropertyChange("uniqueMembers", oldval, val);
        }

        /** Allowable values for {@link #levelType}. */
        public static final String[] _levelType_values = {"Regular", "TimeYears", "TimeQuarters", "TimeMonths", "TimeWeeks", "TimeDays"};
        private String levelType;  // attribute default: Regular
        public String getLevelType() {
            return levelType;
        }
        public void setLevelType(String val) {
            String oldval = this.levelType;
            this.levelType = val;
            _pcs.firePropertyChange("levelType", oldval, val);
        }

        /** Allowable values for {@link #hideMemberIf}. */
        public static final String[] _hideMemberIf_values = {"Never", "IfBlankName", "IfParentsName"};
        private String hideMemberIf;  // attribute default: Never
        public String getHideMemberIf() {
            return hideMemberIf;
        }
        public void setHideMemberIf(String val) {
            String oldval = this.hideMemberIf;
            this.hideMemberIf = val;
            _pcs.firePropertyChange("hideMemberIf", oldval, val);
        }

        private String formatter;  // optional attribute
        public String getFormatter() {
            return formatter;
        }
        public void setFormatter(String val) {
            String oldval = this.formatter;
            this.formatter = val;
            _pcs.firePropertyChange("formatter", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private String captionColumn;  // optional attribute
        public String getCaptionColumn() {
            return captionColumn;
        }
        public void setCaptionColumn(String val) {
            String oldval = this.captionColumn;
            this.captionColumn = val;
            _pcs.firePropertyChange("captionColumn", oldval, val);
        }


        /**
         * The SQL expression used to populate this level's key.
         */
        private KeyExpression keyExp;  //
        public KeyExpression getInstanceKeyExp() {
            return keyExp;
        }
        public void setInstanceKeyExp(KeyExpression val) {
            KeyExpression oldval = this.keyExp;
            this.keyExp = val;
            _pcs.firePropertyChange("instanceKeyExp", oldval, val);
        }

        /**
         * The SQL expression used to populate this level's name. If not
         * specified, the level's key is used.
         */
        private NameExpression nameExp;  //
        public NameExpression getInstanceNameExp() {
            return nameExp;
        }
        public void setInstanceNameExp(NameExpression val) {
            NameExpression oldval = this.nameExp;
            this.nameExp = val;
            _pcs.firePropertyChange("instanceNameExp", oldval, val);
        }

        /**
         * The SQL expression used to populate this level's ordinal.
         */
        private OrdinalExpression ordinalExp;  //
        public OrdinalExpression getInstanceOrdinalExp() {
            return ordinalExp;
        }
        public void setInstanceOrdinalExp(OrdinalExpression val) {
            OrdinalExpression oldval = this.ordinalExp;
            this.ordinalExp = val;
            _pcs.firePropertyChange("instanceOrdinalExp", oldval, val);
        }

        /**
         * The SQL expression used to join to the parent member in a
         * parent-child hierarchy.
         */
        private ParentExpression parentExp;  //
        public ParentExpression getInstanceParentExp() {
            return parentExp;
        }
        public void setInstanceParentExp(ParentExpression val) {
            ParentExpression oldval = this.parentExp;
            this.parentExp = val;
            _pcs.firePropertyChange("instanceParentExp", oldval, val);
        }

        private Closure closure;  //
        public Closure getClosure() {
            return closure;
        }
        public void setClosure(Closure val) {
            Closure oldval = this.closure;
            this.closure = val;
            _pcs.firePropertyChange("closure", oldval, val);
        }

        private List<Property> properties;
        private EventList<Property> propertiesEventList;
        private ObservableElementList<Property> propertiesObservableList;

        public EventList<Property> getPropertiesEventList() {
            return propertiesEventList;
        }
        public ObservableElementList<Property> getPropertiesObservableList() {
            return propertiesObservableList;
        }


        public String getName()
        {
            return "Level";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "approxRowCount", getApproxRowCount(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "table", getTable(), _indent+1);
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayAttribute(_out, "nameColumn", getNameColumn(), _indent+1);
            displayAttribute(_out, "ordinalColumn", getOrdinalColumn(), _indent+1);
            displayAttribute(_out, "parentColumn", getParentColumn(), _indent+1);
            displayAttribute(_out, "nullParentValue", getNullParentValue(), _indent+1);
            displayAttribute(_out, "type", getInstanceType(), _indent+1);
            displayAttribute(_out, "uniqueMembers", getUniqueMembers(), _indent+1);
            displayAttribute(_out, "levelType", getLevelType(), _indent+1);
            displayAttribute(_out, "hideMemberIf", getHideMemberIf(), _indent+1);
            displayAttribute(_out, "formatter", getFormatter(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "captionColumn", getCaptionColumn(), _indent+1);
            displayElement(_out, "keyExp", getInstanceKeyExp(), _indent+1);
            displayElement(_out, "nameExp", getInstanceNameExp(), _indent+1);
            displayElement(_out, "ordinalExp", getInstanceOrdinalExp(), _indent+1);
            displayElement(_out, "parentExp", getInstanceParentExp(), _indent+1);
            displayElement(_out, "closure", getClosure(), _indent+1);
            displayElementArray(_out, "properties", (Property[])getPropertiesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Level", new org.eigenbase.xom.XMLAttrVector()
                .add("approxRowCount", getApproxRowCount())
                .add("name", getInstanceName())
                .add("table", getTable())
                .add("column", getColumn())
                .add("nameColumn", getNameColumn())
                .add("ordinalColumn", getOrdinalColumn())
                .add("parentColumn", getParentColumn())
                .add("nullParentValue", getNullParentValue())
                .add("type", getInstanceType())
                .add("uniqueMembers", getUniqueMembers())
                .add("levelType", getLevelType())
                .add("hideMemberIf", getHideMemberIf())
                .add("formatter", getFormatter())
                .add("caption", getCaption())
                .add("captionColumn", getCaptionColumn())
                );
            displayXMLElement(_out, getInstanceKeyExp());
            displayXMLElement(_out, getInstanceNameExp());
            displayXMLElement(_out, getInstanceOrdinalExp());
            displayXMLElement(_out, getInstanceParentExp());
            displayXMLElement(_out, getClosure());
            displayXMLElementArray(_out, (Property[])getPropertiesEventList().toArray());
            _out.endTag("Level");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Level _cother = (Level)_other;
            _diff = _diff && displayAttributeDiff("approxRowCount", getApproxRowCount(), _cother.getApproxRowCount(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("table", getTable(), _cother.getTable(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("nameColumn", getNameColumn(), _cother.getNameColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("ordinalColumn", getOrdinalColumn(), _cother.getOrdinalColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("parentColumn", getParentColumn(), _cother.getParentColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("nullParentValue", getNullParentValue(), _cother.getNullParentValue(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("type", getInstanceType(), _cother.getInstanceType(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("uniqueMembers", getUniqueMembers(), _cother.getUniqueMembers(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("levelType", getLevelType(), _cother.getLevelType(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("hideMemberIf", getHideMemberIf(), _cother.getHideMemberIf(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formatter", getFormatter(), _cother.getFormatter(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("captionColumn", getCaptionColumn(), _cother.getCaptionColumn(), _out, _indent+1);
            _diff = _diff && displayElementDiff("keyExp", getInstanceKeyExp(), _cother.getInstanceKeyExp(), _out, _indent+1);
            _diff = _diff && displayElementDiff("nameExp", getInstanceNameExp(), _cother.getInstanceNameExp(), _out, _indent+1);
            _diff = _diff && displayElementDiff("ordinalExp", getInstanceOrdinalExp(), _cother.getInstanceOrdinalExp(), _out, _indent+1);
            _diff = _diff && displayElementDiff("parentExp", getInstanceParentExp(), _cother.getInstanceParentExp(), _out, _indent+1);
            _diff = _diff && displayElementDiff("closure", getClosure(), _cother.getClosure(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("properties", (Property[])getPropertiesEventList().toArray(), (Property[])_cother.getPropertiesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public Expression getKeyExp() {
                if (keyExp != null) {
                    return keyExp;
                } else if (column != null) {
                    return new Column(table, column);
                } else {
                    return null;
                }
            }

            public Expression getNameExp() {
                if (nameExp != null) {
                    return nameExp;
                } else if (nameColumn != null) {
                    return new Column(table, nameColumn);
                } else {
                    return null;
                }
            }

            public Expression getCaptionExp() {
                if (captionColumn != null) {
                    return new Column(table, captionColumn);
                } else {
                    return null;
                }
            }

            public Expression getOrdinalExp() {
                if (ordinalExp != null) {
                    return ordinalExp;
                } else if (ordinalColumn != null) {
                    return new Column(table, ordinalColumn);
                } else {
                    return null;
                }
            }

            public Expression getParentExp() {
                if (parentExp != null) {
                    return parentExp;
                } else if (parentColumn != null) {
                    return new Column(table, parentColumn);
                } else {
                    return null;
                }
            }

            public Expression getPropertyExp(int i) {
                return new Column(table, properties.get(i).column);
            }

            public SqlQuery.Datatype getDatatype() {
                return SqlQuery.Datatype.valueOf(type);
            }
        // END pass-through code block ---
    }

    /**
     * Specifies the transitive closure of a parent-child hierarchy.
     * Optional, but recommended for better performance.
     * The closure is provided as a set of (parent/child) pairs:
     * since it is the transitive closure these are actually (ancestor/descendant) pairs.
     */
    public static class Closure extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Closure()
        {
        }

        public Closure(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setParentColumn((String)_parser.getAttribute("parentColumn", "String", null, null, true));
                setChildColumn((String)_parser.getAttribute("childColumn", "String", null, null, true));
                setTable((Table)_parser.getElement(Table.class, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String parentColumn;  // required attribute
        public String getParentColumn() {
            return parentColumn;
        }
        public void setParentColumn(String val) {
            String oldval = this.parentColumn;
            this.parentColumn = val;
            _pcs.firePropertyChange("parentColumn", oldval, val);
        }

        private String childColumn;  // required attribute
        public String getChildColumn() {
            return childColumn;
        }
        public void setChildColumn(String val) {
            String oldval = this.childColumn;
            this.childColumn = val;
            _pcs.firePropertyChange("childColumn", oldval, val);
        }


        private Table table;  //
        public Table getTable() {
            return table;
        }
        public void setTable(Table val) {
            Table oldval = this.table;
            this.table = val;
            _pcs.firePropertyChange("table", oldval, val);
        }


        public String getName()
        {
            return "Closure";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "parentColumn", getParentColumn(), _indent+1);
            displayAttribute(_out, "childColumn", getChildColumn(), _indent+1);
            displayElement(_out, "table", getTable(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Closure", new org.eigenbase.xom.XMLAttrVector()
                .add("parentColumn", getParentColumn())
                .add("childColumn", getChildColumn())
                );
            displayXMLElement(_out, getTable());
            _out.endTag("Closure");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Closure _cother = (Closure)_other;
            _diff = _diff && displayAttributeDiff("parentColumn", getParentColumn(), _cother.getParentColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("childColumn", getChildColumn(), _cother.getChildColumn(), _out, _indent+1);
            _diff = _diff && displayElementDiff("table", getTable(), _cother.getTable(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Member property.
     */
    public static class Property extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Property()
        {
        }

        public Property(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setColumn((String)_parser.getAttribute("column", "String", null, null, false));
                setInstanceType((String)_parser.getAttribute("type", "String", "String", _type_values, false));
                setFormatter((String)_parser.getAttribute("formatter", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String column;  // optional attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }

        /** Allowable values for {@link #type}. */
        public static final String[] _type_values = {"String", "Numeric", "Integer", "Boolean", "Date", "Time", "Timestamp"};
        private String type;  // attribute default: String
        public String getInstanceType() {
            return type;
        }
        public void setInstanceType(String val) {
            String oldval = this.type;
            this.type = val;
            _pcs.firePropertyChange("instanceType", oldval, val);
        }

        private String formatter;  // optional attribute
        public String getFormatter() {
            return formatter;
        }
        public void setFormatter(String val) {
            String oldval = this.formatter;
            this.formatter = val;
            _pcs.firePropertyChange("formatter", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }



        public String getName()
        {
            return "Property";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayAttribute(_out, "type", getInstanceType(), _indent+1);
            displayAttribute(_out, "formatter", getFormatter(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Property", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("column", getColumn())
                .add("type", getInstanceType())
                .add("formatter", getFormatter())
                .add("caption", getCaption())
                );
            _out.endTag("Property");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Property _cother = (Property)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("type", getInstanceType(), _cother.getInstanceType(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formatter", getFormatter(), _cother.getFormatter(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            return _diff;
        }
    }

    public static class Measure extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Measure()
        {
        }

        public Measure(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setColumn((String)_parser.getAttribute("column", "String", null, null, false));
                setDatatype((String)_parser.getAttribute("datatype", "String", null, _datatype_values, false));
                setFormatString((String)_parser.getAttribute("formatString", "String", null, null, false));
                setAggregator((String)_parser.getAttribute("aggregator", "String", null, null, true));
                setFormatter((String)_parser.getAttribute("formatter", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setVisible((Boolean)_parser.getAttribute("visible", "Boolean", null, null, false));
                setMeasureExp((MeasureExpression)_parser.getElement(MeasureExpression.class, false));
                _tempArray = _parser.getArray(CalculatedMemberProperty.class, 0, 0);
                memberProperties = new ArrayList<CalculatedMemberProperty>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    memberProperties.add((CalculatedMemberProperty)_tempArray[_i]);
                }
                memberPropertiesEventList =  GlazedLists.eventList(memberProperties);
                memberPropertiesObservableList = new ObservableElementList<CalculatedMemberProperty>(memberPropertiesEventList, GlazedLists.beanConnector(CalculatedMemberProperty.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String column;  // optional attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }

        /** Allowable values for {@link #datatype}. */
        public static final String[] _datatype_values = {"String", "Numeric", "Integer", "Boolean", "Date", "Time", "Timestamp"};
        private String datatype;  // optional attribute
        public String getDatatype() {
            return datatype;
        }
        public void setDatatype(String val) {
            String oldval = this.datatype;
            this.datatype = val;
            _pcs.firePropertyChange("datatype", oldval, val);
        }

        private String formatString;  // optional attribute
        public String getFormatString() {
            return formatString;
        }
        public void setFormatString(String val) {
            String oldval = this.formatString;
            this.formatString = val;
            _pcs.firePropertyChange("formatString", oldval, val);
        }

        private String aggregator;  // required attribute
        public String getAggregator() {
            return aggregator;
        }
        public void setAggregator(String val) {
            String oldval = this.aggregator;
            this.aggregator = val;
            _pcs.firePropertyChange("aggregator", oldval, val);
        }

        private String formatter;  // optional attribute
        public String getFormatter() {
            return formatter;
        }
        public void setFormatter(String val) {
            String oldval = this.formatter;
            this.formatter = val;
            _pcs.firePropertyChange("formatter", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private Boolean visible;  // optional attribute
        public Boolean getVisible() {
            return visible;
        }
        public void setVisible(Boolean val) {
            Boolean oldval = this.visible;
            this.visible = val;
            _pcs.firePropertyChange("visible", oldval, val);
        }


        /**
         * The SQL expression used to calculate a measure.
         * Must be specified if a source column is not specified.
         */
        private MeasureExpression measureExp;  //
        public MeasureExpression getMeasureExp() {
            return measureExp;
        }
        public void setMeasureExp(MeasureExpression val) {
            MeasureExpression oldval = this.measureExp;
            this.measureExp = val;
            _pcs.firePropertyChange("measureExp", oldval, val);
        }

        private List<CalculatedMemberProperty> memberProperties;
        private EventList<CalculatedMemberProperty> memberPropertiesEventList;
        private ObservableElementList<CalculatedMemberProperty> memberPropertiesObservableList;

        public EventList<CalculatedMemberProperty> getMemberPropertiesEventList() {
            return memberPropertiesEventList;
        }
        public ObservableElementList<CalculatedMemberProperty> getMemberPropertiesObservableList() {
            return memberPropertiesObservableList;
        }


        public String getName()
        {
            return "Measure";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayAttribute(_out, "datatype", getDatatype(), _indent+1);
            displayAttribute(_out, "formatString", getFormatString(), _indent+1);
            displayAttribute(_out, "aggregator", getAggregator(), _indent+1);
            displayAttribute(_out, "formatter", getFormatter(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "visible", getVisible(), _indent+1);
            displayElement(_out, "measureExp", getMeasureExp(), _indent+1);
            displayElementArray(_out, "memberProperties", (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Measure", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("column", getColumn())
                .add("datatype", getDatatype())
                .add("formatString", getFormatString())
                .add("aggregator", getAggregator())
                .add("formatter", getFormatter())
                .add("caption", getCaption())
                .add("visible", getVisible())
                );
            displayXMLElement(_out, getMeasureExp());
            displayXMLElementArray(_out, (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray());
            _out.endTag("Measure");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Measure _cother = (Measure)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("datatype", getDatatype(), _cother.getDatatype(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formatString", getFormatString(), _cother.getFormatString(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("aggregator", getAggregator(), _cother.getAggregator(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formatter", getFormatter(), _cother.getFormatter(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("visible", getVisible(), _cother.getVisible(), _out, _indent+1);
            _diff = _diff && displayElementDiff("measureExp", getMeasureExp(), _cother.getMeasureExp(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("memberProperties", (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray(), (CalculatedMemberProperty[])_cother.getMemberPropertiesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class CalculatedMember extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CalculatedMember()
        {
        }

        public CalculatedMember(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setFormatString((String)_parser.getAttribute("formatString", "String", null, null, false));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setInstanceFormula((String)_parser.getAttribute("formula", "String", null, null, false));
                setDimension((String)_parser.getAttribute("dimension", "String", null, null, true));
                setVisible((Boolean)_parser.getAttribute("visible", "Boolean", null, null, false));
                setFormulaElement((Formula)_parser.getElement(Formula.class, false));
                _tempArray = _parser.getArray(CalculatedMemberProperty.class, 0, 0);
                memberProperties = new ArrayList<CalculatedMemberProperty>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    memberProperties.add((CalculatedMemberProperty)_tempArray[_i]);
                }
                memberPropertiesEventList =  GlazedLists.eventList(memberProperties);
                memberPropertiesObservableList = new ObservableElementList<CalculatedMemberProperty>(memberPropertiesEventList, GlazedLists.beanConnector(CalculatedMemberProperty.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String formatString;  // optional attribute
        public String getFormatString() {
            return formatString;
        }
        public void setFormatString(String val) {
            String oldval = this.formatString;
            this.formatString = val;
            _pcs.firePropertyChange("formatString", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private String formula;  // optional attribute
        public String getInstanceFormula() {
            return formula;
        }
        public void setInstanceFormula(String val) {
            String oldval = this.formula;
            this.formula = val;
            _pcs.firePropertyChange("instanceFormula", oldval, val);
        }

        private String dimension;  // required attribute
        public String getDimension() {
            return dimension;
        }
        public void setDimension(String val) {
            String oldval = this.dimension;
            this.dimension = val;
            _pcs.firePropertyChange("dimension", oldval, val);
        }

        private Boolean visible;  // optional attribute
        public Boolean getVisible() {
            return visible;
        }
        public void setVisible(Boolean val) {
            Boolean oldval = this.visible;
            this.visible = val;
            _pcs.firePropertyChange("visible", oldval, val);
        }


        /**
         * MDX expression which gives the value of this member.
         */
        private Formula formulaElement;  //
        public Formula getFormulaElement() {
            return formulaElement;
        }
        public void setFormulaElement(Formula val) {
            Formula oldval = this.formulaElement;
            this.formulaElement = val;
            _pcs.firePropertyChange("formulaElement", oldval, val);
        }

        private List<CalculatedMemberProperty> memberProperties;
        private EventList<CalculatedMemberProperty> memberPropertiesEventList;
        private ObservableElementList<CalculatedMemberProperty> memberPropertiesObservableList;

        public EventList<CalculatedMemberProperty> getMemberPropertiesEventList() {
            return memberPropertiesEventList;
        }
        public ObservableElementList<CalculatedMemberProperty> getMemberPropertiesObservableList() {
            return memberPropertiesObservableList;
        }


        public String getName()
        {
            return "CalculatedMember";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "formatString", getFormatString(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "formula", getInstanceFormula(), _indent+1);
            displayAttribute(_out, "dimension", getDimension(), _indent+1);
            displayAttribute(_out, "visible", getVisible(), _indent+1);
            displayElement(_out, "formulaElement", getFormulaElement(), _indent+1);
            displayElementArray(_out, "memberProperties", (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CalculatedMember", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("formatString", getFormatString())
                .add("caption", getCaption())
                .add("formula", getInstanceFormula())
                .add("dimension", getDimension())
                .add("visible", getVisible())
                );
            displayXMLElement(_out, getFormulaElement());
            displayXMLElementArray(_out, (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray());
            _out.endTag("CalculatedMember");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CalculatedMember _cother = (CalculatedMember)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formatString", getFormatString(), _cother.getFormatString(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formula", getInstanceFormula(), _cother.getInstanceFormula(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("dimension", getDimension(), _cother.getDimension(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("visible", getVisible(), _cother.getVisible(), _out, _indent+1);
            _diff = _diff && displayElementDiff("formulaElement", getFormulaElement(), _cother.getFormulaElement(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("memberProperties", (CalculatedMemberProperty[])getMemberPropertiesEventList().toArray(), (CalculatedMemberProperty[])_cother.getMemberPropertiesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/**
              * Returns the formula, looking for a sub-element called
              * "Formula" first, then looking for an attribute called
              * "formula".
              */
            public String getFormula() {
                if (formulaElement != null) {
                    return formulaElement.cdata;
                } else {
                    return formula;
                }
            }
        // END pass-through code block ---
    }

    /**
     * Property of a calculated member defined against a cube.
     * It must have either an expression or a value.
     */
    public static class CalculatedMemberProperty extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CalculatedMemberProperty()
        {
        }

        public CalculatedMemberProperty(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setCaption((String)_parser.getAttribute("caption", "String", null, null, false));
                setExpression((String)_parser.getAttribute("expression", "String", null, null, false));
                setValue((String)_parser.getAttribute("value", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String caption;  // optional attribute
        public String getCaption() {
            return caption;
        }
        public void setCaption(String val) {
            String oldval = this.caption;
            this.caption = val;
            _pcs.firePropertyChange("caption", oldval, val);
        }

        private String expression;  // optional attribute
        public String getExpression() {
            return expression;
        }
        public void setExpression(String val) {
            String oldval = this.expression;
            this.expression = val;
            _pcs.firePropertyChange("expression", oldval, val);
        }

        private String value;  // optional attribute
        public String getValue() {
            return value;
        }
        public void setValue(String val) {
            String oldval = this.value;
            this.value = val;
            _pcs.firePropertyChange("value", oldval, val);
        }



        public String getName()
        {
            return "CalculatedMemberProperty";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "caption", getCaption(), _indent+1);
            displayAttribute(_out, "expression", getExpression(), _indent+1);
            displayAttribute(_out, "value", getValue(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CalculatedMemberProperty", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("caption", getCaption())
                .add("expression", getExpression())
                .add("value", getValue())
                );
            _out.endTag("CalculatedMemberProperty");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CalculatedMemberProperty _cother = (CalculatedMemberProperty)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("caption", getCaption(), _cother.getCaption(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("expression", getExpression(), _cother.getExpression(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("value", getValue(), _cother.getValue(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * <p>Defines a named set which can be used in queries in the
     * same way as a set defined using a WITH SET clause.</p>
     * <p>A named set can be defined against a particular cube,
     * or can be global to a schema. If it is defined against a
     * cube, it is only available to queries which use that cube.</p>
     * <p>A named set defined against a cube is not inherited by
     * a virtual cubes defined against that cube. (But you can
     * define a named set against a virtual cube.)</p>
     * <p>A named set defined against a schema is available in
     * all cubes and virtual cubes in that schema. However, it is
     * only valid if the cube contains dimensions with the names
     * required to make the formula valid.</p>
     */
    public static class NamedSet extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public NamedSet()
        {
        }

        public NamedSet(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setInstanceFormula((String)_parser.getAttribute("formula", "String", null, null, false));
                setFormulaElement((Formula)_parser.getElement(Formula.class, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String formula;  // optional attribute
        public String getInstanceFormula() {
            return formula;
        }
        public void setInstanceFormula(String val) {
            String oldval = this.formula;
            this.formula = val;
            _pcs.firePropertyChange("instanceFormula", oldval, val);
        }


        /**
         * MDX expression which gives the value of this set.
         */
        private Formula formulaElement;  //
        public Formula getFormulaElement() {
            return formulaElement;
        }
        public void setFormulaElement(Formula val) {
            Formula oldval = this.formulaElement;
            this.formulaElement = val;
            _pcs.firePropertyChange("formulaElement", oldval, val);
        }


        public String getName()
        {
            return "NamedSet";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "formula", getInstanceFormula(), _indent+1);
            displayElement(_out, "formulaElement", getFormulaElement(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("NamedSet", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("formula", getInstanceFormula())
                );
            displayXMLElement(_out, getFormulaElement());
            _out.endTag("NamedSet");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            NamedSet _cother = (NamedSet)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("formula", getInstanceFormula(), _cother.getInstanceFormula(), _out, _indent+1);
            _diff = _diff && displayElementDiff("formulaElement", getFormulaElement(), _cother.getFormulaElement(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/**
              * Returns the formula, looking for a sub-element called
              * "Formula" first, then looking for an attribute called
              * "formula".
              */
            public String getFormula() {
                if (formulaElement != null) {
                    return formulaElement.cdata;
                } else {
                    return formula;
                }
            }
        // END pass-through code block ---
    }

    public static class Formula extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Formula()
        {
        }

        public Formula(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                cdata = _parser.getText();
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        public String cdata;  // All text goes here
        public String getName()
        {
            return "Formula";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayString(_out, "cdata", cdata, _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Formula", new org.eigenbase.xom.XMLAttrVector()
                );
            _out.cdata(cdata);
            _out.endTag("Formula");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Formula _cother = (Formula)_other;
            _diff = _diff && displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Not used
     */
    public static class MemberReaderParameter extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public MemberReaderParameter()
        {
        }

        public MemberReaderParameter(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setValue((String)_parser.getAttribute("value", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String value;  // optional attribute
        public String getValue() {
            return value;
        }
        public void setValue(String val) {
            String oldval = this.value;
            this.value = val;
            _pcs.firePropertyChange("value", oldval, val);
        }



        public String getName()
        {
            return "MemberReaderParameter";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "value", getValue(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("MemberReaderParameter", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("value", getValue())
                );
            _out.endTag("MemberReaderParameter");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            MemberReaderParameter _cother = (MemberReaderParameter)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("value", getValue(), _cother.getValue(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A table or a join
     */
    public static abstract class RelationOrJoin extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public RelationOrJoin()
        {
        }

        public RelationOrJoin(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
        }



        public String getName()
        {
            return "RelationOrJoin";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%RelationOrJoin;)", new org.eigenbase.xom.XMLAttrVector()
                );
            _out.endTag("(%RelationOrJoin;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            return _diff;
        }
        // BEGIN pass-through code block ---
public abstract Relation find(String seekAlias);
            public boolean equals(Object o) {
                return this == o;
            }
            public int hashCode() {
                return System.identityHashCode(this);
            }
        // END pass-through code block ---
    }

    /**
     * A table, inline table or view
     */
    public static abstract class Relation extends RelationOrJoin
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Relation()
        {
        }

        public Relation(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
        }



        public String getName()
        {
            return "Relation";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%Relation;)", new org.eigenbase.xom.XMLAttrVector()
                );
            _out.endTag("(%Relation;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            return _diff;
        }
        // BEGIN pass-through code block ---
public abstract String getAlias();
        // END pass-through code block ---
    }

    /**
     * A collection of SQL statements, one per dialect.
     */
    public static class View extends Relation
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public View()
        {
        }

        public View(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceAlias((String)_parser.getAttribute("alias", "String", null, null, true));
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                selects = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    selects.add((SQL)_tempArray[_i]);
                }
                selectsEventList =  GlazedLists.eventList(selects);
                selectsObservableList = new ObservableElementList<SQL>(selectsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String alias;  // required attribute
        public String getInstanceAlias() {
            return alias;
        }
        public void setInstanceAlias(String val) {
            String oldval = this.alias;
            this.alias = val;
            _pcs.firePropertyChange("instanceAlias", oldval, val);
        }


        private List<SQL> selects;
        private EventList<SQL> selectsEventList;
        private ObservableElementList<SQL> selectsObservableList;

        public EventList<SQL> getSelectsEventList() {
            return selectsEventList;
        }
        public ObservableElementList<SQL> getSelectsObservableList() {
            return selectsObservableList;
        }


        public String getName()
        {
            return "View";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "alias", getInstanceAlias(), _indent+1);
            displayElementArray(_out, "selects", (SQL[])getSelectsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("View", new org.eigenbase.xom.XMLAttrVector()
                .add("alias", getInstanceAlias())
                );
            displayXMLElementArray(_out, (SQL[])getSelectsEventList().toArray());
            _out.endTag("View");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            View _cother = (View)_other;
            _diff = _diff && displayAttributeDiff("alias", getInstanceAlias(), _cother.getInstanceAlias(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("selects", (SQL[])getSelectsEventList().toArray(), (SQL[])_cother.getSelectsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/**
             * Copy constructor.
             */
            public View(View view) {
                this.alias = view.alias;
                this.selects = new ArrayList(view.selects);
            }
            public String toString() {
                return selectsEventList.get(0).cdata;
            }

            public View find(String seekAlias) {
                if (seekAlias.equals(alias)) {
                    return this;
                } else {
                    return null;
                }
            }

            public String getAlias() {
                return alias;
            }

            public SqlQuery.CodeSet getCodeSet() {
                return SQL.toCodeSet((MondrianDef.SQL[])getSelectsEventList().toArray());
            }

            public void addCode(String dialect, String code) {
                if (selectsEventList == null) {
                    selects = new ArrayList<SQL>();
                    selectsEventList =  GlazedLists.eventList(selects);
                    selectsObservableList = new ObservableElementList<SQL>(selectsEventList, GlazedLists.beanConnector(SQL.class));
                } else {
                    SQL[] olds = (MondrianDef.SQL[])getSelectsEventList().toArray();
                    getSelectsEventList().clear();
                    for (int i = 0; i < olds.length; i++) {
                        getSelectsEventList().add(olds[i]);
                    }
                }
                SQL sql = new SQL();
                sql.dialect = dialect;
                sql.cdata = code;
                getSelectsEventList().set(getSelectsEventList().size() -1, sql);
            }
        // END pass-through code block ---
    }

    public static class SQL extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public SQL()
        {
        }

        public SQL(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setDialect((String)_parser.getAttribute("dialect", "String", "generic", _dialect_values, false));
                cdata = _parser.getText();
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        /** Allowable values for {@link #dialect}. */
        public static final String[] _dialect_values = {"generic", "access", "db2", "derby", "firebird", "hsqldb", "mssql", "mysql", "oracle", "postgres", "sybase", "teradata", "ingres", "luciddb"};
        private String dialect;  // attribute default: generic
        public String getDialect() {
            return dialect;
        }
        public void setDialect(String val) {
            String oldval = this.dialect;
            this.dialect = val;
            _pcs.firePropertyChange("dialect", oldval, val);
        }


        public String cdata;  // All text goes here
        public String getName()
        {
            return "SQL";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "dialect", getDialect(), _indent+1);
            displayString(_out, "cdata", cdata, _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("SQL", new org.eigenbase.xom.XMLAttrVector()
                .add("dialect", getDialect())
                );
            _out.cdata(cdata);
            _out.endTag("SQL");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            SQL _cother = (SQL)_other;
            _diff = _diff && displayAttributeDiff("dialect", getDialect(), _cother.getDialect(), _out, _indent+1);
            _diff = _diff && displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public int hashCode() {
                return dialect.hashCode();
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof SQL)) {
                    return false;
                }
                SQL that = (SQL) obj;
                return this.dialect.equals(that.dialect) &&
                        Util.equals(this.cdata, that.cdata);
            }

            /**
             * Converts an array of SQL to a
             * {@link mondrian.rolap.sql.SqlQuery.CodeSet} object.
             */
            public static SqlQuery.CodeSet toCodeSet(SQL[] sqls) {
                SqlQuery.CodeSet codeSet = new SqlQuery.CodeSet();
                for (SQL sql : sqls) {
                    codeSet.put(sql.dialect, sql.cdata);
                }
                return codeSet;
            }
        // END pass-through code block ---
    }

    public static class Join extends RelationOrJoin
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Join()
        {
        }

        public Join(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceLeftAlias((String)_parser.getAttribute("leftAlias", "String", null, null, false));
                setLeftKey((String)_parser.getAttribute("leftKey", "String", null, null, true));
                setInstanceRightAlias((String)_parser.getAttribute("rightAlias", "String", null, null, false));
                setRightKey((String)_parser.getAttribute("rightKey", "String", null, null, true));
                setLeft((RelationOrJoin)_parser.getElement(RelationOrJoin.class, true));
                setRight((RelationOrJoin)_parser.getElement(RelationOrJoin.class, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String leftAlias;  // optional attribute
        public String getInstanceLeftAlias() {
            return leftAlias;
        }
        public void setInstanceLeftAlias(String val) {
            String oldval = this.leftAlias;
            this.leftAlias = val;
            _pcs.firePropertyChange("instanceLeftAlias", oldval, val);
        }

        private String leftKey;  // required attribute
        public String getLeftKey() {
            return leftKey;
        }
        public void setLeftKey(String val) {
            String oldval = this.leftKey;
            this.leftKey = val;
            _pcs.firePropertyChange("leftKey", oldval, val);
        }

        private String rightAlias;  // optional attribute
        public String getInstanceRightAlias() {
            return rightAlias;
        }
        public void setInstanceRightAlias(String val) {
            String oldval = this.rightAlias;
            this.rightAlias = val;
            _pcs.firePropertyChange("instanceRightAlias", oldval, val);
        }

        private String rightKey;  // required attribute
        public String getRightKey() {
            return rightKey;
        }
        public void setRightKey(String val) {
            String oldval = this.rightKey;
            this.rightKey = val;
            _pcs.firePropertyChange("rightKey", oldval, val);
        }


        private RelationOrJoin left;  //
        public RelationOrJoin getLeft() {
            return left;
        }
        public void setLeft(RelationOrJoin val) {
            RelationOrJoin oldval = this.left;
            this.left = val;
            _pcs.firePropertyChange("left", oldval, val);
        }

        private RelationOrJoin right;  //
        public RelationOrJoin getRight() {
            return right;
        }
        public void setRight(RelationOrJoin val) {
            RelationOrJoin oldval = this.right;
            this.right = val;
            _pcs.firePropertyChange("right", oldval, val);
        }


        public String getName()
        {
            return "Join";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "leftAlias", getInstanceLeftAlias(), _indent+1);
            displayAttribute(_out, "leftKey", getLeftKey(), _indent+1);
            displayAttribute(_out, "rightAlias", getInstanceRightAlias(), _indent+1);
            displayAttribute(_out, "rightKey", getRightKey(), _indent+1);
            displayElement(_out, "left", getLeft(), _indent+1);
            displayElement(_out, "right", getRight(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Join", new org.eigenbase.xom.XMLAttrVector()
                .add("leftAlias", getInstanceLeftAlias())
                .add("leftKey", getLeftKey())
                .add("rightAlias", getInstanceRightAlias())
                .add("rightKey", getRightKey())
                );
            displayXMLElement(_out, getLeft());
            displayXMLElement(_out, getRight());
            _out.endTag("Join");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Join _cother = (Join)_other;
            _diff = _diff && displayAttributeDiff("leftAlias", getInstanceLeftAlias(), _cother.getInstanceLeftAlias(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("leftKey", getLeftKey(), _cother.getLeftKey(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("rightAlias", getInstanceRightAlias(), _cother.getInstanceRightAlias(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("rightKey", getRightKey(), _cother.getRightKey(), _out, _indent+1);
            _diff = _diff && displayElementDiff("left", getLeft(), _cother.getLeft(), _out, _indent+1);
            _diff = _diff && displayElementDiff("right", getRight(), _cother.getRight(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/** Convenience constructor. */
            public Join(
                String leftAlias,
                String leftKey,
                RelationOrJoin left,
                String rightAlias, 
                String rightKey,
                RelationOrJoin right)
            {
                this.leftAlias = leftAlias;
                this.leftKey = leftKey;
                this.left = left;
                this.rightAlias = rightAlias;
                this.rightKey = rightKey;
                this.right = right;
            }
            /**
              * Returns the alias of the left join key, defaulting to left's
              * alias if left is a table.
              */
            public String getLeftAlias() {
                if (leftAlias != null) {
                    return leftAlias;
                }
                if (left instanceof Relation) {
                    return ((Relation) left).getAlias();
                }
                throw Util.newInternal(
                    "alias is required because " + left + " is not a table");
            }
            /**
              * Returns the alias of the right join key, defaulting to right's
              * alias if right is a table.
              */
            public String getRightAlias() {
                if (rightAlias != null) {
                    return rightAlias;
                }
                if (right instanceof Relation) {
                    return ((Relation) right).getAlias();
                }
                if (right instanceof Join) {
                    return ((Join) right).getLeftAlias();
                }
                throw Util.newInternal(
                    "alias is required because " + right + " is not a table");
            }
            public String toString() {
                return "(" + left + ") join (" + right + ") on " +
                    leftAlias + "." + leftKey + " = " +
                    rightAlias + "." + rightKey;
            }
            public Relation find(String seekAlias) {
                Relation relation = left.find(seekAlias);
                if (relation == null) {
                    relation = right.find(seekAlias);
                }
                return relation;
            }
        // END pass-through code block ---
    }

    public static class Table extends Relation
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Table()
        {
        }

        public Table(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setSchema((String)_parser.getAttribute("schema", "String", null, null, false));
                setInstanceAlias((String)_parser.getAttribute("alias", "String", null, null, false));
                setInstanceFilter((SQL)_parser.getElement(SQL.class, false));
                _tempArray = _parser.getArray(AggExclude.class, 0, 0);
                aggExcludes = new ArrayList<AggExclude>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    aggExcludes.add((AggExclude)_tempArray[_i]);
                }
                aggExcludesEventList =  GlazedLists.eventList(aggExcludes);
                aggExcludesObservableList = new ObservableElementList<AggExclude>(aggExcludesEventList, GlazedLists.beanConnector(AggExclude.class));
                _tempArray = _parser.getArray(AggTable.class, 0, 0);
                aggTables = new ArrayList<AggTable>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    aggTables.add((AggTable)_tempArray[_i]);
                }
                aggTablesEventList =  GlazedLists.eventList(aggTables);
                aggTablesObservableList = new ObservableElementList<AggTable>(aggTablesEventList, GlazedLists.beanConnector(AggTable.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String schema;  // optional attribute
        public String getSchema() {
            return schema;
        }
        public void setSchema(String val) {
            String oldval = this.schema;
            this.schema = val;
            _pcs.firePropertyChange("schema", oldval, val);
        }

        private String alias;  // optional attribute
        public String getInstanceAlias() {
            return alias;
        }
        public void setInstanceAlias(String val) {
            String oldval = this.alias;
            this.alias = val;
            _pcs.firePropertyChange("instanceAlias", oldval, val);
        }


        /**
         * The SQL WHERE clause expression to be appended to any select statement
         */
        private SQL filter;  //
        public SQL getInstanceFilter() {
            return filter;
        }
        public void setInstanceFilter(SQL val) {
            SQL oldval = this.filter;
            this.filter = val;
            _pcs.firePropertyChange("instanceFilter", oldval, val);
        }

        private List<AggExclude> aggExcludes;
        private EventList<AggExclude> aggExcludesEventList;
        private ObservableElementList<AggExclude> aggExcludesObservableList;

        public EventList<AggExclude> getAggExcludesEventList() {
            return aggExcludesEventList;
        }
        public ObservableElementList<AggExclude> getAggExcludesObservableList() {
            return aggExcludesObservableList;
        }

        private List<AggTable> aggTables;
        private EventList<AggTable> aggTablesEventList;
        private ObservableElementList<AggTable> aggTablesObservableList;

        public EventList<AggTable> getAggTablesEventList() {
            return aggTablesEventList;
        }
        public ObservableElementList<AggTable> getAggTablesObservableList() {
            return aggTablesObservableList;
        }


        public String getName()
        {
            return "Table";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "schema", getSchema(), _indent+1);
            displayAttribute(_out, "alias", getInstanceAlias(), _indent+1);
            displayElement(_out, "filter", getInstanceFilter(), _indent+1);
            displayElementArray(_out, "aggExcludes", (AggExclude[])getAggExcludesEventList().toArray(), _indent+1);
            displayElementArray(_out, "aggTables", (AggTable[])getAggTablesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Table", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("schema", getSchema())
                .add("alias", getInstanceAlias())
                );
            displayXMLElement(_out, getInstanceFilter());
            displayXMLElementArray(_out, (AggExclude[])getAggExcludesEventList().toArray());
            displayXMLElementArray(_out, (AggTable[])getAggTablesEventList().toArray());
            _out.endTag("Table");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Table _cother = (Table)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("schema", getSchema(), _cother.getSchema(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("alias", getInstanceAlias(), _cother.getInstanceAlias(), _out, _indent+1);
            _diff = _diff && displayElementDiff("filter", getInstanceFilter(), _cother.getInstanceFilter(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("aggExcludes", (AggExclude[])getAggExcludesEventList().toArray(), (AggExclude[])_cother.getAggExcludesEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("aggTables", (AggTable[])getAggTablesEventList().toArray(), (AggTable[])_cother.getAggTablesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/** Convenience constructor. */
            public Table(Table table) {
                this(table.schema, table.name, table.alias);
            }
            public Table(String schema, String name, String alias) {
                this();
                this.schema = schema;
                this.name = name;
                this.alias = alias;
            }
            /** Returns the alias or, if it is null, the table name. */
            public String getAlias() {
                return (alias != null) ? alias : name;
            }
            public String toString() {
                return (schema == null) ?
                    name :
                    schema + "." + name;
            }
            public Table find(String seekAlias) {
                return seekAlias.equals(name) ? this :
                    (alias != null) && seekAlias.equals(alias) ? this :
                    null;
            }
            public boolean equals(Object o) {
                if (o instanceof Table) {
                    Table that = (Table) o;
                    return this.name.equals(that.name) &&
                        Util.equals(this.alias, that.alias) &&
                        Util.equals(this.schema, that.schema);
                } else {
                    return false;
                }
            }
            public int hashCode() {
                return toString().hashCode();
            }
            public String getFilter() {
                return (filter == null) ? null : filter.cdata;
            }
            public AggExclude[] getAggExcludes() {
                return (AggExclude[])getAggExcludesEventList().toArray();
            }
            public AggTable[] getAggTables() {
                return (AggTable[])getAggTablesEventList().toArray();
            }
        // END pass-through code block ---
    }

    public static class InlineTable extends Relation
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public InlineTable()
        {
        }

        public InlineTable(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceAlias((String)_parser.getAttribute("alias", "String", null, null, false));
                setColumnDefs((ColumnDefs)_parser.getElement(ColumnDefs.class, true));
                setRows((Rows)_parser.getElement(Rows.class, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String alias;  // optional attribute
        public String getInstanceAlias() {
            return alias;
        }
        public void setInstanceAlias(String val) {
            String oldval = this.alias;
            this.alias = val;
            _pcs.firePropertyChange("instanceAlias", oldval, val);
        }


        private ColumnDefs columnDefs;  //
        public ColumnDefs getColumnDefs() {
            return columnDefs;
        }
        public void setColumnDefs(ColumnDefs val) {
            ColumnDefs oldval = this.columnDefs;
            this.columnDefs = val;
            _pcs.firePropertyChange("columnDefs", oldval, val);
        }

        private Rows rows;  //
        public Rows getRows() {
            return rows;
        }
        public void setRows(Rows val) {
            Rows oldval = this.rows;
            this.rows = val;
            _pcs.firePropertyChange("rows", oldval, val);
        }


        public String getName()
        {
            return "InlineTable";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "alias", getInstanceAlias(), _indent+1);
            displayElement(_out, "columnDefs", getColumnDefs(), _indent+1);
            displayElement(_out, "rows", getRows(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("InlineTable", new org.eigenbase.xom.XMLAttrVector()
                .add("alias", getInstanceAlias())
                );
            displayXMLElement(_out, getColumnDefs());
            displayXMLElement(_out, getRows());
            _out.endTag("InlineTable");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            InlineTable _cother = (InlineTable)_other;
            _diff = _diff && displayAttributeDiff("alias", getInstanceAlias(), _cother.getInstanceAlias(), _out, _indent+1);
            _diff = _diff && displayElementDiff("columnDefs", getColumnDefs(), _cother.getColumnDefs(), _out, _indent+1);
            _diff = _diff && displayElementDiff("rows", getRows(), _cother.getRows(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/** Convenience constructor. */
            public InlineTable(InlineTable inlineTable) {
                this.alias = inlineTable.alias;
                this.columnDefs = new ColumnDefs();
                this.columnDefs.array = new ArrayList(inlineTable.columnDefs.array);
                this.rows = new Rows();
                this.rows.array = new ArrayList(inlineTable.rows.array);
            }
            public String getAlias() {
                return alias;
            }
            public String toString() {
                return "<inline data>";
            }
            public InlineTable find(String seekAlias) {
                return seekAlias.equals(this.alias) ? this : null;
            }
            public boolean equals(Object o) {
                if (o instanceof InlineTable) {
                    InlineTable that = (InlineTable) o;
                    return this.alias.equals(that.alias);
                } else {
                    return false;
                }
            }
            public int hashCode() {
                return toString().hashCode();
            }
        // END pass-through code block ---
    }

    /**
     * Holder for an array of ColumnDef elements
     */
    public static class ColumnDefs extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public ColumnDefs()
        {
        }

        public ColumnDefs(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(ColumnDef.class, 0, 0);
                array = new ArrayList<ColumnDef>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    array.add((ColumnDef)_tempArray[_i]);
                }
                arrayEventList =  GlazedLists.eventList(array);
                arrayObservableList = new ObservableElementList<ColumnDef>(arrayEventList, GlazedLists.beanConnector(ColumnDef.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        private List<ColumnDef> array;
        private EventList<ColumnDef> arrayEventList;
        private ObservableElementList<ColumnDef> arrayObservableList;

        public EventList<ColumnDef> getArrayEventList() {
            return arrayEventList;
        }
        public ObservableElementList<ColumnDef> getArrayObservableList() {
            return arrayObservableList;
        }


        public String getName()
        {
            return "ColumnDefs";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "array", (ColumnDef[])getArrayEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("ColumnDefs", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (ColumnDef[])getArrayEventList().toArray());
            _out.endTag("ColumnDefs");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            ColumnDefs _cother = (ColumnDefs)_other;
            _diff = _diff && displayElementArrayDiff("array", (ColumnDef[])getArrayEventList().toArray(), (ColumnDef[])_cother.getArrayEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Column definition for an inline table.
     */
    public static class ColumnDef extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public ColumnDef()
        {
        }

        public ColumnDef(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setInstanceType((String)_parser.getAttribute("type", "String", null, _type_values, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        /** Allowable values for {@link #type}. */
        public static final String[] _type_values = {"String", "Numeric", "Integer", "Boolean", "Date", "Time", "Timestamp"};
        private String type;  // required attribute
        public String getInstanceType() {
            return type;
        }
        public void setInstanceType(String val) {
            String oldval = this.type;
            this.type = val;
            _pcs.firePropertyChange("instanceType", oldval, val);
        }



        public String getName()
        {
            return "ColumnDef";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "type", getInstanceType(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("ColumnDef", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("type", getInstanceType())
                );
            _out.endTag("ColumnDef");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            ColumnDef _cother = (ColumnDef)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("type", getInstanceType(), _cother.getInstanceType(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Holder for an array of Row elements
     */
    public static class Rows extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Rows()
        {
        }

        public Rows(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(Row.class, 0, 0);
                array = new ArrayList<Row>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    array.add((Row)_tempArray[_i]);
                }
                arrayEventList =  GlazedLists.eventList(array);
                arrayObservableList = new ObservableElementList<Row>(arrayEventList, GlazedLists.beanConnector(Row.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        private List<Row> array;
        private EventList<Row> arrayEventList;
        private ObservableElementList<Row> arrayObservableList;

        public EventList<Row> getArrayEventList() {
            return arrayEventList;
        }
        public ObservableElementList<Row> getArrayObservableList() {
            return arrayObservableList;
        }


        public String getName()
        {
            return "Rows";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "array", (Row[])getArrayEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Rows", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (Row[])getArrayEventList().toArray());
            _out.endTag("Rows");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Rows _cother = (Rows)_other;
            _diff = _diff && displayElementArrayDiff("array", (Row[])getArrayEventList().toArray(), (Row[])_cother.getArrayEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Row definition for an inline table.
     * Must have one Column for each ColumnDef in the InlineTable.
     */
    public static class Row extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Row()
        {
        }

        public Row(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(Value.class, 0, 0);
                values = new ArrayList<Value>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    values.add((Value)_tempArray[_i]);
                }
                valuesEventList =  GlazedLists.eventList(values);
                valuesObservableList = new ObservableElementList<Value>(valuesEventList, GlazedLists.beanConnector(Value.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        private List<Value> values;
        private EventList<Value> valuesEventList;
        private ObservableElementList<Value> valuesObservableList;

        public EventList<Value> getValuesEventList() {
            return valuesEventList;
        }
        public ObservableElementList<Value> getValuesObservableList() {
            return valuesObservableList;
        }


        public String getName()
        {
            return "Row";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "values", (Value[])getValuesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Row", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (Value[])getValuesEventList().toArray());
            _out.endTag("Row");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Row _cother = (Row)_other;
            _diff = _diff && displayElementArrayDiff("values", (Value[])getValuesEventList().toArray(), (Value[])_cother.getValuesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Column value for an inline table.
     * The CDATA holds the value of the column.
     */
    public static class Value extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Value()
        {
        }

        public Value(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
                cdata = _parser.getText();
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String column;  // required attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }


        public String cdata;  // All text goes here
        public String getName()
        {
            return "Value";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayString(_out, "cdata", cdata, _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Value", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                );
            _out.cdata(cdata);
            _out.endTag("Value");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Value _cother = (Value)_other;
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A definition of an aggregate table for a base fact table.
     * This aggregate table must be in the same schema as the
     * base fact table.
     */
    public static abstract class AggTable extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggTable()
        {
        }

        public AggTable(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setIgnorecase((Boolean)_parser.getAttribute("ignorecase", "Boolean", "true", null, false));
                setFactcount((AggFactCount)_parser.getElement(AggFactCount.class, true));
                _tempArray = _parser.getArray(AggIgnoreColumn.class, 0, 0);
                ignoreColumns = new ArrayList<AggIgnoreColumn>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    ignoreColumns.add((AggIgnoreColumn)_tempArray[_i]);
                }
                ignoreColumnsEventList =  GlazedLists.eventList(ignoreColumns);
                ignoreColumnsObservableList = new ObservableElementList<AggIgnoreColumn>(ignoreColumnsEventList, GlazedLists.beanConnector(AggIgnoreColumn.class));
                _tempArray = _parser.getArray(AggForeignKey.class, 0, 0);
                foreignKeys = new ArrayList<AggForeignKey>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    foreignKeys.add((AggForeignKey)_tempArray[_i]);
                }
                foreignKeysEventList =  GlazedLists.eventList(foreignKeys);
                foreignKeysObservableList = new ObservableElementList<AggForeignKey>(foreignKeysEventList, GlazedLists.beanConnector(AggForeignKey.class));
                _tempArray = _parser.getArray(AggMeasure.class, 0, 0);
                measures = new ArrayList<AggMeasure>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    measures.add((AggMeasure)_tempArray[_i]);
                }
                measuresEventList =  GlazedLists.eventList(measures);
                measuresObservableList = new ObservableElementList<AggMeasure>(measuresEventList, GlazedLists.beanConnector(AggMeasure.class));
                _tempArray = _parser.getArray(AggLevel.class, 0, 0);
                levels = new ArrayList<AggLevel>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    levels.add((AggLevel)_tempArray[_i]);
                }
                levelsEventList =  GlazedLists.eventList(levels);
                levelsObservableList = new ObservableElementList<AggLevel>(levelsEventList, GlazedLists.beanConnector(AggLevel.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private Boolean ignorecase;  // attribute default: true
        public Boolean getIgnorecase() {
            return ignorecase;
        }
        public void setIgnorecase(Boolean val) {
            Boolean oldval = this.ignorecase;
            this.ignorecase = val;
            _pcs.firePropertyChange("ignorecase", oldval, val);
        }


        /**
         * What does the fact_count column look like.
         */
        private AggFactCount factcount;  //
        public AggFactCount getFactcount() {
            return factcount;
        }
        public void setFactcount(AggFactCount val) {
            AggFactCount oldval = this.factcount;
            this.factcount = val;
            _pcs.firePropertyChange("factcount", oldval, val);
        }

        protected List<AggIgnoreColumn> ignoreColumns;
        protected EventList<AggIgnoreColumn> ignoreColumnsEventList;
        protected ObservableElementList<AggIgnoreColumn> ignoreColumnsObservableList;

        public EventList<AggIgnoreColumn> getIgnoreColumnsEventList() {
            return ignoreColumnsEventList;
        }
        public ObservableElementList<AggIgnoreColumn> getIgnoreColumnsObservableList() {
            return ignoreColumnsObservableList;
        }

        protected List<AggForeignKey> foreignKeys;
        protected EventList<AggForeignKey> foreignKeysEventList;
        protected ObservableElementList<AggForeignKey> foreignKeysObservableList;

        public EventList<AggForeignKey> getForeignKeysEventList() {
            return foreignKeysEventList;
        }
        public ObservableElementList<AggForeignKey> getForeignKeysObservableList() {
            return foreignKeysObservableList;
        }

        protected List<AggMeasure> measures;
        protected EventList<AggMeasure> measuresEventList;
        protected ObservableElementList<AggMeasure> measuresObservableList;

        public EventList<AggMeasure> getMeasuresEventList() {
            return measuresEventList;
        }
        public ObservableElementList<AggMeasure> getMeasuresObservableList() {
            return measuresObservableList;
        }

        protected List<AggLevel> levels;
        protected EventList<AggLevel> levelsEventList;
        protected ObservableElementList<AggLevel> levelsObservableList;

        public EventList<AggLevel> getLevelsEventList() {
            return levelsEventList;
        }
        public ObservableElementList<AggLevel> getLevelsObservableList() {
            return levelsObservableList;
        }


        public String getName()
        {
            return "AggTable";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "ignorecase", getIgnorecase(), _indent+1);
            displayElement(_out, "factcount", getFactcount(), _indent+1);
            displayElementArray(_out, "ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), _indent+1);
            displayElementArray(_out, "foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), _indent+1);
            displayElementArray(_out, "measures", (AggMeasure[])getMeasuresEventList().toArray(), _indent+1);
            displayElementArray(_out, "levels", (AggLevel[])getLevelsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%AggTable;)", new org.eigenbase.xom.XMLAttrVector()
                .add("ignorecase", getIgnorecase())
                );
            displayXMLElement(_out, getFactcount());
            displayXMLElementArray(_out, (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray());
            displayXMLElementArray(_out, (AggForeignKey[])getForeignKeysEventList().toArray());
            displayXMLElementArray(_out, (AggMeasure[])getMeasuresEventList().toArray());
            displayXMLElementArray(_out, (AggLevel[])getLevelsEventList().toArray());
            _out.endTag("(%AggTable;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggTable _cother = (AggTable)_other;
            _diff = _diff && displayAttributeDiff("ignorecase", getIgnorecase(), _cother.getIgnorecase(), _out, _indent+1);
            _diff = _diff && displayElementDiff("factcount", getFactcount(), _cother.getFactcount(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), (AggIgnoreColumn[])_cother.getIgnoreColumnsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), (AggForeignKey[])_cother.getForeignKeysEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("measures", (AggMeasure[])getMeasuresEventList().toArray(), (AggMeasure[])_cother.getMeasuresEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("levels", (AggLevel[])getLevelsEventList().toArray(), (AggLevel[])_cother.getLevelsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public boolean isIgnoreCase() {
                return ignorecase.booleanValue();
            }
            public AggFactCount getAggFactCount() {
                return factcount;
            }
            public AggIgnoreColumn[] getAggIgnoreColumns() {
                return (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray();
            }
            public AggForeignKey[] getAggForeignKeys() {
                return (AggForeignKey[])getForeignKeysEventList().toArray();
            }
            public AggMeasure[] getAggMeasures() {
                return (AggMeasure[])getMeasuresEventList().toArray();
            }
            public AggLevel[] getAggLevels() {
                return (AggLevel[])getLevelsEventList().toArray();
            }
        // END pass-through code block ---
    }

    public static class AggName extends AggTable
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggName()
        {
        }

        public AggName(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setIgnorecase((Boolean)_parser.getAttribute("ignorecase", "Boolean", "true", null, false));
                setFactcount((AggFactCount)_parser.getElement(AggFactCount.class, true));
                _tempArray = _parser.getArray(AggIgnoreColumn.class, 0, 0);
                ignoreColumns = new ArrayList<AggIgnoreColumn>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    ignoreColumns.add((AggIgnoreColumn)_tempArray[_i]);
                }
                ignoreColumnsEventList =  GlazedLists.eventList(ignoreColumns);
                ignoreColumnsObservableList = new ObservableElementList<AggIgnoreColumn>(ignoreColumnsEventList, GlazedLists.beanConnector(AggIgnoreColumn.class));
                _tempArray = _parser.getArray(AggForeignKey.class, 0, 0);
                foreignKeys = new ArrayList<AggForeignKey>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    foreignKeys.add((AggForeignKey)_tempArray[_i]);
                }
                foreignKeysEventList =  GlazedLists.eventList(foreignKeys);
                foreignKeysObservableList = new ObservableElementList<AggForeignKey>(foreignKeysEventList, GlazedLists.beanConnector(AggForeignKey.class));
                _tempArray = _parser.getArray(AggMeasure.class, 0, 0);
                measures = new ArrayList<AggMeasure>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    measures.add((AggMeasure)_tempArray[_i]);
                }
                measuresEventList =  GlazedLists.eventList(measures);
                measuresObservableList = new ObservableElementList<AggMeasure>(measuresEventList, GlazedLists.beanConnector(AggMeasure.class));
                _tempArray = _parser.getArray(AggLevel.class, 0, 0);
                levels = new ArrayList<AggLevel>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    levels.add((AggLevel)_tempArray[_i]);
                }
                levelsEventList =  GlazedLists.eventList(levels);
                levelsObservableList = new ObservableElementList<AggLevel>(levelsEventList, GlazedLists.beanConnector(AggLevel.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }



        public String getName()
        {
            return "AggName";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "ignorecase", getIgnorecase(), _indent+1);
            displayElement(_out, "factcount", getFactcount(), _indent+1);
            displayElementArray(_out, "ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), _indent+1);
            displayElementArray(_out, "foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), _indent+1);
            displayElementArray(_out, "measures", (AggMeasure[])getMeasuresEventList().toArray(), _indent+1);
            displayElementArray(_out, "levels", (AggLevel[])getLevelsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggName", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("ignorecase", getIgnorecase())
                );
            displayXMLElement(_out, getFactcount());
            displayXMLElementArray(_out, (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray());
            displayXMLElementArray(_out, (AggForeignKey[])getForeignKeysEventList().toArray());
            displayXMLElementArray(_out, (AggMeasure[])getMeasuresEventList().toArray());
            displayXMLElementArray(_out, (AggLevel[])getLevelsEventList().toArray());
            _out.endTag("AggName");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggName _cother = (AggName)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayElementDiff("factcount", getFactcount(), _cother.getFactcount(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), (AggIgnoreColumn[])_cother.getIgnoreColumnsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), (AggForeignKey[])_cother.getForeignKeysEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("measures", (AggMeasure[])getMeasuresEventList().toArray(), (AggMeasure[])_cother.getMeasuresEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("levels", (AggLevel[])getLevelsEventList().toArray(), (AggLevel[])_cother.getLevelsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getNameAttribute() {
                return name;
            }
        // END pass-through code block ---
    }

    public static class AggPattern extends AggTable
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggPattern()
        {
        }

        public AggPattern(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstancePattern((String)_parser.getAttribute("pattern", "String", null, null, true));
                setIgnorecase((Boolean)_parser.getAttribute("ignorecase", "Boolean", "true", null, false));
                setFactcount((AggFactCount)_parser.getElement(AggFactCount.class, true));
                _tempArray = _parser.getArray(AggIgnoreColumn.class, 0, 0);
                ignoreColumns = new ArrayList<AggIgnoreColumn>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    ignoreColumns.add((AggIgnoreColumn)_tempArray[_i]);
                }
                ignoreColumnsEventList =  GlazedLists.eventList(ignoreColumns);
                ignoreColumnsObservableList = new ObservableElementList<AggIgnoreColumn>(ignoreColumnsEventList, GlazedLists.beanConnector(AggIgnoreColumn.class));
                _tempArray = _parser.getArray(AggForeignKey.class, 0, 0);
                foreignKeys = new ArrayList<AggForeignKey>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    foreignKeys.add((AggForeignKey)_tempArray[_i]);
                }
                foreignKeysEventList =  GlazedLists.eventList(foreignKeys);
                foreignKeysObservableList = new ObservableElementList<AggForeignKey>(foreignKeysEventList, GlazedLists.beanConnector(AggForeignKey.class));
                _tempArray = _parser.getArray(AggMeasure.class, 0, 0);
                measures = new ArrayList<AggMeasure>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    measures.add((AggMeasure)_tempArray[_i]);
                }
                measuresEventList =  GlazedLists.eventList(measures);
                measuresObservableList = new ObservableElementList<AggMeasure>(measuresEventList, GlazedLists.beanConnector(AggMeasure.class));
                _tempArray = _parser.getArray(AggLevel.class, 0, 0);
                levels = new ArrayList<AggLevel>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    levels.add((AggLevel)_tempArray[_i]);
                }
                levelsEventList =  GlazedLists.eventList(levels);
                levelsObservableList = new ObservableElementList<AggLevel>(levelsEventList, GlazedLists.beanConnector(AggLevel.class));
                _tempArray = _parser.getArray(AggExclude.class, 0, 0);
                excludes = new ArrayList<AggExclude>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    excludes.add((AggExclude)_tempArray[_i]);
                }
                excludesEventList =  GlazedLists.eventList(excludes);
                excludesObservableList = new ObservableElementList<AggExclude>(excludesEventList, GlazedLists.beanConnector(AggExclude.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String pattern;  // required attribute
        public String getInstancePattern() {
            return pattern;
        }
        public void setInstancePattern(String val) {
            String oldval = this.pattern;
            this.pattern = val;
            _pcs.firePropertyChange("instancePattern", oldval, val);
        }


        private List<AggExclude> excludes;
        private EventList<AggExclude> excludesEventList;
        private ObservableElementList<AggExclude> excludesObservableList;

        public EventList<AggExclude> getExcludesEventList() {
            return excludesEventList;
        }
        public ObservableElementList<AggExclude> getExcludesObservableList() {
            return excludesObservableList;
        }


        public String getName()
        {
            return "AggPattern";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "pattern", getInstancePattern(), _indent+1);
            displayAttribute(_out, "ignorecase", getIgnorecase(), _indent+1);
            displayElement(_out, "factcount", getFactcount(), _indent+1);
            displayElementArray(_out, "ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), _indent+1);
            displayElementArray(_out, "foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), _indent+1);
            displayElementArray(_out, "measures", (AggMeasure[])getMeasuresEventList().toArray(), _indent+1);
            displayElementArray(_out, "levels", (AggLevel[])getLevelsEventList().toArray(), _indent+1);
            displayElementArray(_out, "excludes", (AggExclude[])getExcludesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggPattern", new org.eigenbase.xom.XMLAttrVector()
                .add("pattern", getInstancePattern())
                .add("ignorecase", getIgnorecase())
                );
            displayXMLElement(_out, getFactcount());
            displayXMLElementArray(_out, (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray());
            displayXMLElementArray(_out, (AggForeignKey[])getForeignKeysEventList().toArray());
            displayXMLElementArray(_out, (AggMeasure[])getMeasuresEventList().toArray());
            displayXMLElementArray(_out, (AggLevel[])getLevelsEventList().toArray());
            displayXMLElementArray(_out, (AggExclude[])getExcludesEventList().toArray());
            _out.endTag("AggPattern");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggPattern _cother = (AggPattern)_other;
            _diff = _diff && displayAttributeDiff("pattern", getInstancePattern(), _cother.getInstancePattern(), _out, _indent+1);
            _diff = _diff && displayElementDiff("factcount", getFactcount(), _cother.getFactcount(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("ignoreColumns", (AggIgnoreColumn[])getIgnoreColumnsEventList().toArray(), (AggIgnoreColumn[])_cother.getIgnoreColumnsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("foreignKeys", (AggForeignKey[])getForeignKeysEventList().toArray(), (AggForeignKey[])_cother.getForeignKeysEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("measures", (AggMeasure[])getMeasuresEventList().toArray(), (AggMeasure[])_cother.getMeasuresEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("levels", (AggLevel[])getLevelsEventList().toArray(), (AggLevel[])_cother.getLevelsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("excludes", (AggExclude[])getExcludesEventList().toArray(), (AggExclude[])_cother.getExcludesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getPattern() {
                return pattern;
            }
            public AggExclude[] getAggExcludes() {
                return (AggExclude[])getExcludesEventList().toArray();
            }
        // END pass-through code block ---
    }

    public static class AggExclude extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggExclude()
        {
        }

        public AggExclude(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstancePattern((String)_parser.getAttribute("pattern", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, false));
                setIgnorecase((Boolean)_parser.getAttribute("ignorecase", "Boolean", "true", null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String pattern;  // optional attribute
        public String getInstancePattern() {
            return pattern;
        }
        public void setInstancePattern(String val) {
            String oldval = this.pattern;
            this.pattern = val;
            _pcs.firePropertyChange("instancePattern", oldval, val);
        }

        private String name;  // optional attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private Boolean ignorecase;  // attribute default: true
        public Boolean getIgnorecase() {
            return ignorecase;
        }
        public void setIgnorecase(Boolean val) {
            Boolean oldval = this.ignorecase;
            this.ignorecase = val;
            _pcs.firePropertyChange("ignorecase", oldval, val);
        }



        public String getName()
        {
            return "AggExclude";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "pattern", getInstancePattern(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "ignorecase", getIgnorecase(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggExclude", new org.eigenbase.xom.XMLAttrVector()
                .add("pattern", getInstancePattern())
                .add("name", getInstanceName())
                .add("ignorecase", getIgnorecase())
                );
            _out.endTag("AggExclude");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggExclude _cother = (AggExclude)_other;
            _diff = _diff && displayAttributeDiff("pattern", getInstancePattern(), _cother.getInstancePattern(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("ignorecase", getIgnorecase(), _cother.getIgnorecase(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public boolean isIgnoreCase() {
                return ignorecase.booleanValue();
            }
        // END pass-through code block ---
    }

    public static abstract class AggColumnName extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggColumnName()
        {
        }

        public AggColumnName(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String column;  // required attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }



        public String getName()
        {
            return "AggColumnName";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%AggColumnName;)", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                );
            _out.endTag("(%AggColumnName;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggColumnName _cother = (AggColumnName)_other;
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getColumnName() {
                return column;
            }
        // END pass-through code block ---
    }

    public static class AggFactCount extends AggColumnName
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggFactCount()
        {
        }

        public AggFactCount(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "AggFactCount";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggFactCount", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                );
            _out.endTag("AggFactCount");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggFactCount _cother = (AggFactCount)_other;
            return _diff;
        }
    }

    public static class AggIgnoreColumn extends AggColumnName
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggIgnoreColumn()
        {
        }

        public AggIgnoreColumn(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "AggIgnoreColumn";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggIgnoreColumn", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                );
            _out.endTag("AggIgnoreColumn");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggIgnoreColumn _cother = (AggIgnoreColumn)_other;
            return _diff;
        }
    }

    /**
     * The name of the column mapping from base fact table foreign key
     * to aggregate table foreign key.
     */
    public static class AggForeignKey extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggForeignKey()
        {
        }

        public AggForeignKey(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setFactColumn((String)_parser.getAttribute("factColumn", "String", null, null, true));
                setAggColumn((String)_parser.getAttribute("aggColumn", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String factColumn;  // required attribute
        public String getFactColumn() {
            return factColumn;
        }
        public void setFactColumn(String val) {
            String oldval = this.factColumn;
            this.factColumn = val;
            _pcs.firePropertyChange("factColumn", oldval, val);
        }

        private String aggColumn;  // required attribute
        public String getAggColumn() {
            return aggColumn;
        }
        public void setAggColumn(String val) {
            String oldval = this.aggColumn;
            this.aggColumn = val;
            _pcs.firePropertyChange("aggColumn", oldval, val);
        }



        public String getName()
        {
            return "AggForeignKey";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "factColumn", getFactColumn(), _indent+1);
            displayAttribute(_out, "aggColumn", getAggColumn(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggForeignKey", new org.eigenbase.xom.XMLAttrVector()
                .add("factColumn", getFactColumn())
                .add("aggColumn", getAggColumn())
                );
            _out.endTag("AggForeignKey");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggForeignKey _cother = (AggForeignKey)_other;
            _diff = _diff && displayAttributeDiff("factColumn", getFactColumn(), _cother.getFactColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("aggColumn", getAggColumn(), _cother.getAggColumn(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getFactFKColumnName() {
                return factColumn;
            }
            public String getAggregateFKColumnName() {
                return aggColumn;
            }
        // END pass-through code block ---
    }

    public static class AggLevel extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggLevel()
        {
        }

        public AggLevel(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String column;  // required attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }



        public String getName()
        {
            return "AggLevel";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggLevel", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                .add("name", getInstanceName())
                );
            _out.endTag("AggLevel");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggLevel _cother = (AggLevel)_other;
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getNameAttribute() {
                return name;
            }
            public String getColumnName() {
                return column;
            }
        // END pass-through code block ---
    }

    public static class AggMeasure extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public AggMeasure()
        {
        }

        public AggMeasure(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setColumn((String)_parser.getAttribute("column", "String", null, null, true));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String column;  // required attribute
        public String getColumn() {
            return column;
        }
        public void setColumn(String val) {
            String oldval = this.column;
            this.column = val;
            _pcs.firePropertyChange("column", oldval, val);
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }



        public String getName()
        {
            return "AggMeasure";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "column", getColumn(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("AggMeasure", new org.eigenbase.xom.XMLAttrVector()
                .add("column", getColumn())
                .add("name", getInstanceName())
                );
            _out.endTag("AggMeasure");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            AggMeasure _cother = (AggMeasure)_other;
            _diff = _diff && displayAttributeDiff("column", getColumn(), _cother.getColumn(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String getNameAttribute() {
                return name;
            }
        // END pass-through code block ---
    }

    public static abstract class Expression extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Expression()
        {
        }

        public Expression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
        }



        public String getName()
        {
            return "Expression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%Expression;)", new org.eigenbase.xom.XMLAttrVector()
                );
            _out.endTag("(%Expression;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            return _diff;
        }
        // BEGIN pass-through code block ---
public abstract String getExpression(SqlQuery query);
            public abstract String getGenericExpression();
            public abstract String getTableAlias();
        // END pass-through code block ---
    }

    public static class Column extends Expression
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Column()
        {
        }

        public Column(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setTable((String)_parser.getAttribute("table", "String", null, null, false));
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String table;  // optional attribute
        public String getTable() {
            return table;
        }
        public void setTable(String val) {
            String oldval = this.table;
            this.table = val;
            _pcs.firePropertyChange("table", oldval, val);
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }



        public String getName()
        {
            return "Column";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "table", getTable(), _indent+1);
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Column", new org.eigenbase.xom.XMLAttrVector()
                .add("table", getTable())
                .add("name", getInstanceName())
                );
            _out.endTag("Column");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Column _cother = (Column)_other;
            _diff = _diff && displayAttributeDiff("table", getTable(), _cother.getTable(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
/** Convenience constructor. */
            public Column(String table, String name) {
                this();
                Util.assertTrue(name != null);
                this.table = table;
                this.name = name;
            }
            public String getExpression(SqlQuery query) {
                return query.getDialect().quoteIdentifier(table, name);
            }
            public String getGenericExpression() {
                if (table == null) {
                    return name;
                } else {
                    return table + "." + name;
                }
            }
            public String getColumnName() {
                return name;
            }
            public String getTableAlias() {
                return table;
            }
            public int hashCode() {
                return name.hashCode() ^ (table==null ? 0 : table.hashCode());
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Column)) {
                    return false;
                }
                Column that = (Column) obj;
                return this.name.equals(that.name) &&
                        Util.equals(this.table, that.table);
            }
        // END pass-through code block ---
    }

    /**
     * A collection of SQL expressions, one per dialect.
     */
    public static abstract class ExpressionView extends Expression
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public ExpressionView()
        {
        }

        public ExpressionView(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        protected List<SQL> expressions;
        protected EventList<SQL> expressionsEventList;
        protected ObservableElementList<SQL> expressionsObservableList;

        public EventList<SQL> getExpressionsEventList() {
            return expressionsEventList;
        }
        public ObservableElementList<SQL> getExpressionsObservableList() {
            return expressionsObservableList;
        }


        public String getName()
        {
            return "ExpressionView";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%ExpressionView;)", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("(%ExpressionView;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            ExpressionView _cother = (ExpressionView)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
        // BEGIN pass-through code block ---
public String toString() {
                return getExpressionsEventList().get(0).cdata;
            }

            public String getExpression(SqlQuery query) {
                return SQL.toCodeSet((MondrianDef.SQL[])getExpressionsEventList().toArray()).chooseQuery(query.getDialect());
            }

            public String getGenericExpression() {
                for (SQL exp : getExpressionsEventList()) {
                    if (exp.getDialect().equals("generic")) {
                        return exp.cdata;
                    }
                }
                return getExpressionsEventList().get(0).cdata;
            }

            public String getTableAlias() {
                return null;
            }

            public int hashCode() {
                int h = 17;
                for (SQL exp : getExpressionsEventList()) {
                    h = 37 * h + exp.hashCode();
                }
                return h;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof ExpressionView)) {
                    return false;
                }
                ExpressionView that = (ExpressionView) obj;
                if (getExpressionsEventList().size() != that.getExpressionsEventList().size()) {
                    return false;
                }
                for (int i = 0; i < getExpressionsEventList().size(); i++) {
                    if (! getExpressionsEventList().get(i).equals(that.getExpressionsEventList().get(i))) {
                        return false;
                    }
                }
                return true;
            }
        // END pass-through code block ---
    }

    public static class KeyExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public KeyExpression()
        {
        }

        public KeyExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "KeyExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("KeyExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("KeyExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            KeyExpression _cother = (KeyExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class ParentExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public ParentExpression()
        {
        }

        public ParentExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "ParentExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("ParentExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("ParentExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            ParentExpression _cother = (ParentExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class OrdinalExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public OrdinalExpression()
        {
        }

        public OrdinalExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "OrdinalExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("OrdinalExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("OrdinalExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            OrdinalExpression _cother = (OrdinalExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class NameExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public NameExpression()
        {
        }

        public NameExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "NameExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("NameExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("NameExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            NameExpression _cother = (NameExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class CaptionExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CaptionExpression()
        {
        }

        public CaptionExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "CaptionExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CaptionExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("CaptionExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CaptionExpression _cother = (CaptionExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    public static class MeasureExpression extends ExpressionView
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public MeasureExpression()
        {
        }

        public MeasureExpression(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(SQL.class, 1, 0);
                expressions = new ArrayList<SQL>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    expressions.add((SQL)_tempArray[_i]);
                }
                expressionsEventList =  GlazedLists.eventList(expressions);
                expressionsObservableList = new ObservableElementList<SQL>(expressionsEventList, GlazedLists.beanConnector(SQL.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }



        public String getName()
        {
            return "MeasureExpression";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "expressions", (SQL[])getExpressionsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("MeasureExpression", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (SQL[])getExpressionsEventList().toArray());
            _out.endTag("MeasureExpression");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            MeasureExpression _cother = (MeasureExpression)_other;
            _diff = _diff && displayElementArrayDiff("expressions", (SQL[])getExpressionsEventList().toArray(), (SQL[])_cother.getExpressionsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A role defines an access-control profile. It has a series of grants
     * (or denials) for schema elements.
     */
    public static class Role extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Role()
        {
        }

        public Role(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                _tempArray = _parser.getArray(SchemaGrant.class, 0, 0);
                schemaGrants = new ArrayList<SchemaGrant>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    schemaGrants.add((SchemaGrant)_tempArray[_i]);
                }
                schemaGrantsEventList =  GlazedLists.eventList(schemaGrants);
                schemaGrantsObservableList = new ObservableElementList<SchemaGrant>(schemaGrantsEventList, GlazedLists.beanConnector(SchemaGrant.class));
                setUnion((Union)_parser.getElement(Union.class, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }


        private List<SchemaGrant> schemaGrants;
        private EventList<SchemaGrant> schemaGrantsEventList;
        private ObservableElementList<SchemaGrant> schemaGrantsObservableList;

        public EventList<SchemaGrant> getSchemaGrantsEventList() {
            return schemaGrantsEventList;
        }
        public ObservableElementList<SchemaGrant> getSchemaGrantsObservableList() {
            return schemaGrantsObservableList;
        }

        private Union union;  //
        public Union getUnion() {
            return union;
        }
        public void setUnion(Union val) {
            Union oldval = this.union;
            this.union = val;
            _pcs.firePropertyChange("union", oldval, val);
        }


        public String getName()
        {
            return "Role";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayElementArray(_out, "schemaGrants", (SchemaGrant[])getSchemaGrantsEventList().toArray(), _indent+1);
            displayElement(_out, "union", getUnion(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Role", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                );
            displayXMLElementArray(_out, (SchemaGrant[])getSchemaGrantsEventList().toArray());
            displayXMLElement(_out, getUnion());
            _out.endTag("Role");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Role _cother = (Role)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("schemaGrants", (SchemaGrant[])getSchemaGrantsEventList().toArray(), (SchemaGrant[])_cother.getSchemaGrantsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementDiff("union", getUnion(), _cother.getUnion(), _out, _indent+1);
            return _diff;
        }
    }

    public static abstract class Grant extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Grant()
        {
        }

        public Grant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        /** Allowable values for {@link #access}. */
        public static final String[] _access_values = {"all", "custom", "none", "all_dimensions"};
        private String access;  // required attribute
        public String getAccess() {
            return access;
        }
        public void setAccess(String val) {
            String oldval = this.access;
            this.access = val;
            _pcs.firePropertyChange("access", oldval, val);
        }



        public String getName()
        {
            return "Grant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "access", getAccess(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("(%Grant;)", new org.eigenbase.xom.XMLAttrVector()
                .add("access", getAccess())
                );
            _out.endTag("(%Grant;)");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Grant _cother = (Grant)_other;
            _diff = _diff && displayAttributeDiff("access", getAccess(), _cother.getAccess(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Grants (or denies) this role access to this schema.
     * access may be "all", "all_dimensions", or "none".
     * If access is "all_dimensions", the role has access
     * to all dimensions but still needs explicit access to cubes.
     * See mondrian.olap.Role#grant(mondrian.olap.Schema,int).
     */
    public static class SchemaGrant extends Grant
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public SchemaGrant()
        {
        }

        public SchemaGrant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
                _tempArray = _parser.getArray(CubeGrant.class, 0, 0);
                cubeGrants = new ArrayList<CubeGrant>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    cubeGrants.add((CubeGrant)_tempArray[_i]);
                }
                cubeGrantsEventList =  GlazedLists.eventList(cubeGrants);
                cubeGrantsObservableList = new ObservableElementList<CubeGrant>(cubeGrantsEventList, GlazedLists.beanConnector(CubeGrant.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        private List<CubeGrant> cubeGrants;
        private EventList<CubeGrant> cubeGrantsEventList;
        private ObservableElementList<CubeGrant> cubeGrantsObservableList;

        public EventList<CubeGrant> getCubeGrantsEventList() {
            return cubeGrantsEventList;
        }
        public ObservableElementList<CubeGrant> getCubeGrantsObservableList() {
            return cubeGrantsObservableList;
        }


        public String getName()
        {
            return "SchemaGrant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "access", getAccess(), _indent+1);
            displayElementArray(_out, "cubeGrants", (CubeGrant[])getCubeGrantsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("SchemaGrant", new org.eigenbase.xom.XMLAttrVector()
                .add("access", getAccess())
                );
            displayXMLElementArray(_out, (CubeGrant[])getCubeGrantsEventList().toArray());
            _out.endTag("SchemaGrant");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            SchemaGrant _cother = (SchemaGrant)_other;
            _diff = _diff && displayElementArrayDiff("cubeGrants", (CubeGrant[])getCubeGrantsEventList().toArray(), (CubeGrant[])_cother.getCubeGrantsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Grants (or denies) this role access to a cube.
     * access may be "all" or "none".
     * See mondrian.olap.Role#grant(mondrian.olap.Cube,int).
     */
    public static class CubeGrant extends Grant
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public CubeGrant()
        {
        }

        public CubeGrant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setCube((String)_parser.getAttribute("cube", "String", null, null, true));
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
                _tempArray = _parser.getArray(DimensionGrant.class, 0, 0);
                dimensionGrants = new ArrayList<DimensionGrant>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    dimensionGrants.add((DimensionGrant)_tempArray[_i]);
                }
                dimensionGrantsEventList =  GlazedLists.eventList(dimensionGrants);
                dimensionGrantsObservableList = new ObservableElementList<DimensionGrant>(dimensionGrantsEventList, GlazedLists.beanConnector(DimensionGrant.class));
                _tempArray = _parser.getArray(HierarchyGrant.class, 0, 0);
                hierarchyGrants = new ArrayList<HierarchyGrant>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    hierarchyGrants.add((HierarchyGrant)_tempArray[_i]);
                }
                hierarchyGrantsEventList =  GlazedLists.eventList(hierarchyGrants);
                hierarchyGrantsObservableList = new ObservableElementList<HierarchyGrant>(hierarchyGrantsEventList, GlazedLists.beanConnector(HierarchyGrant.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String cube;  // required attribute
        public String getCube() {
            return cube;
        }
        public void setCube(String val) {
            String oldval = this.cube;
            this.cube = val;
            _pcs.firePropertyChange("cube", oldval, val);
        }


        private List<DimensionGrant> dimensionGrants;
        private EventList<DimensionGrant> dimensionGrantsEventList;
        private ObservableElementList<DimensionGrant> dimensionGrantsObservableList;

        public EventList<DimensionGrant> getDimensionGrantsEventList() {
            return dimensionGrantsEventList;
        }
        public ObservableElementList<DimensionGrant> getDimensionGrantsObservableList() {
            return dimensionGrantsObservableList;
        }

        private List<HierarchyGrant> hierarchyGrants;
        private EventList<HierarchyGrant> hierarchyGrantsEventList;
        private ObservableElementList<HierarchyGrant> hierarchyGrantsObservableList;

        public EventList<HierarchyGrant> getHierarchyGrantsEventList() {
            return hierarchyGrantsEventList;
        }
        public ObservableElementList<HierarchyGrant> getHierarchyGrantsObservableList() {
            return hierarchyGrantsObservableList;
        }


        public String getName()
        {
            return "CubeGrant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "cube", getCube(), _indent+1);
            displayAttribute(_out, "access", getAccess(), _indent+1);
            displayElementArray(_out, "dimensionGrants", (DimensionGrant[])getDimensionGrantsEventList().toArray(), _indent+1);
            displayElementArray(_out, "hierarchyGrants", (HierarchyGrant[])getHierarchyGrantsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("CubeGrant", new org.eigenbase.xom.XMLAttrVector()
                .add("cube", getCube())
                .add("access", getAccess())
                );
            displayXMLElementArray(_out, (DimensionGrant[])getDimensionGrantsEventList().toArray());
            displayXMLElementArray(_out, (HierarchyGrant[])getHierarchyGrantsEventList().toArray());
            _out.endTag("CubeGrant");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            CubeGrant _cother = (CubeGrant)_other;
            _diff = _diff && displayAttributeDiff("cube", getCube(), _cother.getCube(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("dimensionGrants", (DimensionGrant[])getDimensionGrantsEventList().toArray(), (DimensionGrant[])_cother.getDimensionGrantsEventList().toArray(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("hierarchyGrants", (HierarchyGrant[])getHierarchyGrantsEventList().toArray(), (HierarchyGrant[])_cother.getHierarchyGrantsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Grants (or denies) this role access to a dimension.
     * access may be "all" or "none".
     * Note that a role is implicitly given access to a dimension when it
     * is given acess to a cube.
     * See also the "all_dimensions" option of the "SchemaGrant" element.
     * See mondrian.olap.Role#grant(mondrian.olap.Dimension,int).
     */
    public static class DimensionGrant extends Grant
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public DimensionGrant()
        {
        }

        public DimensionGrant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setDimension((String)_parser.getAttribute("dimension", "String", null, null, true));
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String dimension;  // required attribute
        public String getDimension() {
            return dimension;
        }
        public void setDimension(String val) {
            String oldval = this.dimension;
            this.dimension = val;
            _pcs.firePropertyChange("dimension", oldval, val);
        }



        public String getName()
        {
            return "DimensionGrant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "dimension", getDimension(), _indent+1);
            displayAttribute(_out, "access", getAccess(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("DimensionGrant", new org.eigenbase.xom.XMLAttrVector()
                .add("dimension", getDimension())
                .add("access", getAccess())
                );
            _out.endTag("DimensionGrant");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            DimensionGrant _cother = (DimensionGrant)_other;
            _diff = _diff && displayAttributeDiff("dimension", getDimension(), _cother.getDimension(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Grants (or denies) this role access to a hierarchy.
     * access may be "all", "custom" or "none".
     * If access is "custom", you may also specify the
     * attributes topLevel, bottomLevel, and
     * the member grants.
     * See mondrian.olap.Role#grant(mondrian.olap.Hierarchy, int, mondrian.olap.Level).
     */
    public static class HierarchyGrant extends Grant
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public HierarchyGrant()
        {
        }

        public HierarchyGrant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                setHierarchy((String)_parser.getAttribute("hierarchy", "String", null, null, true));
                setTopLevel((String)_parser.getAttribute("topLevel", "String", null, null, false));
                setBottomLevel((String)_parser.getAttribute("bottomLevel", "String", null, null, false));
                setRollupPolicy((String)_parser.getAttribute("rollupPolicy", "String", null, null, false));
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
                _tempArray = _parser.getArray(MemberGrant.class, 0, 0);
                memberGrants = new ArrayList<MemberGrant>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    memberGrants.add((MemberGrant)_tempArray[_i]);
                }
                memberGrantsEventList =  GlazedLists.eventList(memberGrants);
                memberGrantsObservableList = new ObservableElementList<MemberGrant>(memberGrantsEventList, GlazedLists.beanConnector(MemberGrant.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String hierarchy;  // required attribute
        public String getHierarchy() {
            return hierarchy;
        }
        public void setHierarchy(String val) {
            String oldval = this.hierarchy;
            this.hierarchy = val;
            _pcs.firePropertyChange("hierarchy", oldval, val);
        }

        private String topLevel;  // optional attribute
        public String getTopLevel() {
            return topLevel;
        }
        public void setTopLevel(String val) {
            String oldval = this.topLevel;
            this.topLevel = val;
            _pcs.firePropertyChange("topLevel", oldval, val);
        }

        private String bottomLevel;  // optional attribute
        public String getBottomLevel() {
            return bottomLevel;
        }
        public void setBottomLevel(String val) {
            String oldval = this.bottomLevel;
            this.bottomLevel = val;
            _pcs.firePropertyChange("bottomLevel", oldval, val);
        }

        private String rollupPolicy;  // optional attribute
        public String getRollupPolicy() {
            return rollupPolicy;
        }
        public void setRollupPolicy(String val) {
            String oldval = this.rollupPolicy;
            this.rollupPolicy = val;
            _pcs.firePropertyChange("rollupPolicy", oldval, val);
        }


        private List<MemberGrant> memberGrants;
        private EventList<MemberGrant> memberGrantsEventList;
        private ObservableElementList<MemberGrant> memberGrantsObservableList;

        public EventList<MemberGrant> getMemberGrantsEventList() {
            return memberGrantsEventList;
        }
        public ObservableElementList<MemberGrant> getMemberGrantsObservableList() {
            return memberGrantsObservableList;
        }


        public String getName()
        {
            return "HierarchyGrant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "hierarchy", getHierarchy(), _indent+1);
            displayAttribute(_out, "topLevel", getTopLevel(), _indent+1);
            displayAttribute(_out, "bottomLevel", getBottomLevel(), _indent+1);
            displayAttribute(_out, "rollupPolicy", getRollupPolicy(), _indent+1);
            displayAttribute(_out, "access", getAccess(), _indent+1);
            displayElementArray(_out, "memberGrants", (MemberGrant[])getMemberGrantsEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("HierarchyGrant", new org.eigenbase.xom.XMLAttrVector()
                .add("hierarchy", getHierarchy())
                .add("topLevel", getTopLevel())
                .add("bottomLevel", getBottomLevel())
                .add("rollupPolicy", getRollupPolicy())
                .add("access", getAccess())
                );
            displayXMLElementArray(_out, (MemberGrant[])getMemberGrantsEventList().toArray());
            _out.endTag("HierarchyGrant");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            HierarchyGrant _cother = (HierarchyGrant)_other;
            _diff = _diff && displayAttributeDiff("hierarchy", getHierarchy(), _cother.getHierarchy(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("topLevel", getTopLevel(), _cother.getTopLevel(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("bottomLevel", getBottomLevel(), _cother.getBottomLevel(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("rollupPolicy", getRollupPolicy(), _cother.getRollupPolicy(), _out, _indent+1);
            _diff = _diff && displayElementArrayDiff("memberGrants", (MemberGrant[])getMemberGrantsEventList().toArray(), (MemberGrant[])_cother.getMemberGrantsEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Grants (or denies) this role access to a member.
     * The children of this member inherit that access.
     * You can implicitly see a member if you can see any of its children.
     * See mondrian.olap.Role#grant(mondrian.olap.Member,int).
     */
    public static class MemberGrant extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public MemberGrant()
        {
        }

        public MemberGrant(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setMember((String)_parser.getAttribute("member", "String", null, null, true));
                setAccess((String)_parser.getAttribute("access", "String", null, _access_values, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String member;  // required attribute
        public String getMember() {
            return member;
        }
        public void setMember(String val) {
            String oldval = this.member;
            this.member = val;
            _pcs.firePropertyChange("member", oldval, val);
        }

        /** Allowable values for {@link #access}. */
        public static final String[] _access_values = {"all", "none"};
        private String access;  // required attribute
        public String getAccess() {
            return access;
        }
        public void setAccess(String val) {
            String oldval = this.access;
            this.access = val;
            _pcs.firePropertyChange("access", oldval, val);
        }



        public String getName()
        {
            return "MemberGrant";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "member", getMember(), _indent+1);
            displayAttribute(_out, "access", getAccess(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("MemberGrant", new org.eigenbase.xom.XMLAttrVector()
                .add("member", getMember())
                .add("access", getAccess())
                );
            _out.endTag("MemberGrant");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            MemberGrant _cother = (MemberGrant)_other;
            _diff = _diff && displayAttributeDiff("member", getMember(), _cother.getMember(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("access", getAccess(), _cother.getAccess(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Body of a Role definition which defines a Role to be the union
     * of several Roles. The RoleUsage elements must refer to Roles that
     * have been declared earlier in this schema file.
     */
    public static class Union extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Union()
        {
        }

        public Union(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                org.eigenbase.xom.NodeDef[] _tempArray = null;
                
                _tempArray = _parser.getArray(RoleUsage.class, 0, 0);
                roleUsages = new ArrayList<RoleUsage>();
                for (int _i=0; _i<_tempArray.length; _i++) {
                    roleUsages.add((RoleUsage)_tempArray[_i]);
                }
                roleUsagesEventList =  GlazedLists.eventList(roleUsages);
                roleUsagesObservableList = new ObservableElementList<RoleUsage>(roleUsagesEventList, GlazedLists.beanConnector(RoleUsage.class));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }


        private List<RoleUsage> roleUsages;
        private EventList<RoleUsage> roleUsagesEventList;
        private ObservableElementList<RoleUsage> roleUsagesObservableList;

        public EventList<RoleUsage> getRoleUsagesEventList() {
            return roleUsagesEventList;
        }
        public ObservableElementList<RoleUsage> getRoleUsagesObservableList() {
            return roleUsagesObservableList;
        }


        public String getName()
        {
            return "Union";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayElementArray(_out, "roleUsages", (RoleUsage[])getRoleUsagesEventList().toArray(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Union", new org.eigenbase.xom.XMLAttrVector()
                );
            displayXMLElementArray(_out, (RoleUsage[])getRoleUsagesEventList().toArray());
            _out.endTag("Union");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Union _cother = (Union)_other;
            _diff = _diff && displayElementArrayDiff("roleUsages", (RoleUsage[])getRoleUsagesEventList().toArray(), (RoleUsage[])_cother.getRoleUsagesEventList().toArray(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * Usage of a Role in a union Role.
     */
    public static class RoleUsage extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public RoleUsage()
        {
        }

        public RoleUsage(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setRoleName((String)_parser.getAttribute("roleName", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String roleName;  // required attribute
        public String getRoleName() {
            return roleName;
        }
        public void setRoleName(String val) {
            String oldval = this.roleName;
            this.roleName = val;
            _pcs.firePropertyChange("roleName", oldval, val);
        }



        public String getName()
        {
            return "RoleUsage";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "roleName", getRoleName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("RoleUsage", new org.eigenbase.xom.XMLAttrVector()
                .add("roleName", getRoleName())
                );
            _out.endTag("RoleUsage");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            RoleUsage _cother = (RoleUsage)_other;
            _diff = _diff && displayAttributeDiff("roleName", getRoleName(), _cother.getRoleName(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A UserDefinedFunction is a function which
     * extends the MDX language. It must be implemented by a Java
     * class which implements the interface
     * mondrian.spi.UserDefinedFunction.
     */
    public static class UserDefinedFunction extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public UserDefinedFunction()
        {
        }

        public UserDefinedFunction(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setClassName((String)_parser.getAttribute("className", "String", null, null, true));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String className;  // required attribute
        public String getClassName() {
            return className;
        }
        public void setClassName(String val) {
            String oldval = this.className;
            this.className = val;
            _pcs.firePropertyChange("className", oldval, val);
        }



        public String getName()
        {
            return "UserDefinedFunction";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "className", getClassName(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("UserDefinedFunction", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("className", getClassName())
                );
            _out.endTag("UserDefinedFunction");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            UserDefinedFunction _cother = (UserDefinedFunction)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("className", getClassName(), _cother.getClassName(), _out, _indent+1);
            return _diff;
        }
    }

    /**
     * A Parameter defines a schema parameter.
     * It can be referenced from an MDX statement using the ParamRef
     * function and, if not final, its value can be overridden.
     */
    public static class Parameter extends org.eigenbase.xom.ElementDef
    {
        private final PropertyChangeSupport _pcs = new PropertyChangeSupport(this);
        public Parameter()
        {
        }

        public Parameter(org.eigenbase.xom.DOMWrapper _def)
            throws org.eigenbase.xom.XOMException
        {
            try {
                org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", MondrianDef.class);
                
                setInstanceName((String)_parser.getAttribute("name", "String", null, null, true));
                setDescription((String)_parser.getAttribute("description", "String", null, null, false));
                setInstanceType((String)_parser.getAttribute("type", "String", "String", _type_values, true));
                setModifiable((Boolean)_parser.getAttribute("modifiable", "Boolean", "true", null, false));
                setDefaultValue((String)_parser.getAttribute("defaultValue", "String", null, null, false));
            } catch(org.eigenbase.xom.XOMException _ex) {
                throw new org.eigenbase.xom.XOMException("In element '" + getName() + "': " + _ex.getMessage());
            }
        }

        private String name;  // required attribute
        public String getInstanceName() {
            return name;
        }
        public void setInstanceName(String val) {
            String oldval = this.name;
            this.name = val;
            _pcs.firePropertyChange("instanceName", oldval, val);
        }

        private String description;  // optional attribute
        public String getDescription() {
            return description;
        }
        public void setDescription(String val) {
            String oldval = this.description;
            this.description = val;
            _pcs.firePropertyChange("description", oldval, val);
        }

        /** Allowable values for {@link #type}. */
        public static final String[] _type_values = {"String", "Numeric", "Integer", "Boolean", "Date", "Time", "Timestamp", "Member"};
        private String type;  // attribute default: String
        public String getInstanceType() {
            return type;
        }
        public void setInstanceType(String val) {
            String oldval = this.type;
            this.type = val;
            _pcs.firePropertyChange("instanceType", oldval, val);
        }

        private Boolean modifiable;  // attribute default: true
        public Boolean getModifiable() {
            return modifiable;
        }
        public void setModifiable(Boolean val) {
            Boolean oldval = this.modifiable;
            this.modifiable = val;
            _pcs.firePropertyChange("modifiable", oldval, val);
        }

        private String defaultValue;  // optional attribute
        public String getDefaultValue() {
            return defaultValue;
        }
        public void setDefaultValue(String val) {
            String oldval = this.defaultValue;
            this.defaultValue = val;
            _pcs.firePropertyChange("defaultValue", oldval, val);
        }



        public String getName()
        {
            return "Parameter";
        }

        public void display(java.io.PrintWriter _out, int _indent)
        {
            _out.println(getName());
            displayAttribute(_out, "name", getInstanceName(), _indent+1);
            displayAttribute(_out, "description", getDescription(), _indent+1);
            displayAttribute(_out, "type", getInstanceType(), _indent+1);
            displayAttribute(_out, "modifiable", getModifiable(), _indent+1);
            displayAttribute(_out, "defaultValue", getDefaultValue(), _indent+1);
        }
        public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
        {
            _out.beginTag("Parameter", new org.eigenbase.xom.XMLAttrVector()
                .add("name", getInstanceName())
                .add("description", getDescription())
                .add("type", getInstanceType())
                .add("modifiable", getModifiable())
                .add("defaultValue", getDefaultValue())
                );
            _out.endTag("Parameter");
        }
        public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
        {
            boolean _diff = true;
            Parameter _cother = (Parameter)_other;
            _diff = _diff && displayAttributeDiff("name", getInstanceName(), _cother.getInstanceName(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("description", getDescription(), _cother.getDescription(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("type", getInstanceType(), _cother.getInstanceType(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("modifiable", getModifiable(), _cother.getModifiable(), _out, _indent+1);
            _diff = _diff && displayAttributeDiff("defaultValue", getDefaultValue(), _cother.getDefaultValue(), _out, _indent+1);
            return _diff;
        }
    }


}
