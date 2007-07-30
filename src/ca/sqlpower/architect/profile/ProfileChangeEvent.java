/*
 * Copyright (c) 2007, SQL Power Group Inc.
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *     * Neither the name of SQL Power Group Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ca.sqlpower.architect.profile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;

import ca.sqlpower.architect.SQLObject;

/**
 * The ProfileChangeEvent represents a change in the contents of a
 * particular ProfileManager.  The profile manager that underwent
 * the change is the source of this event.
 */
public class ProfileChangeEvent extends EventObject {

    /**
     * The list of profile results that has been added or removed from
     * the source manager.
     */
    final List<ProfileResult> profileResultList;
    
    /**
     * Creates a profile change event for the given single profile object.
     * 
     * @param source The profile manager that gained or lost a profile.
     * @param pr The profile gained or lost.
     */
    public ProfileChangeEvent(ProfileManager source, ProfileResult pr) {
        super(source);
        this.profileResultList = Collections.singletonList(pr);
    }
    
    /**
     * Creates a profile change event for the given list of profile objects.
     * The given list is copied, so it is safe to modify the list you pass
     * in after creating this event.
     * 
     * @param source The profile manager that gained or lost a profile.
     * @param prList The list of profiles gained or lost.  This list will be
     * copied, not referenced directly.
     */
    public ProfileChangeEvent(ProfileManager source, List<? extends ProfileResult> prList) {
        super(source);
        this.profileResultList = Collections.unmodifiableList(new ArrayList<ProfileResult>(prList));
    }

    /**
     * Returns the list of profile results that were either added or removed.
     * The list is not modifiable.
     */
    public List<ProfileResult> getProfileResults() {
        return profileResultList;
    }

    /**
     * Returns the ProfileManager that this event was generated by.
     */
    @Override
    public ProfileManager getSource() {
        return (ProfileManager) super.getSource();
    }
    
    /**
     * Returns a string representation of each profile result in this event.
     */
    @Override
    public String toString() { 
        StringBuffer buf = new StringBuffer();
        buf.append("ProfileChangeEvent(source = ").append(source);
        for (ProfileResult<SQLObject> pr: profileResultList) {
            String name;
            SQLObject profiledObject = pr.getProfiledObject();        
            name = profiledObject !=null? profiledObject.getName()
                :"unknown profiled object";
            
            buf.append(String.format(" [%s, %s]", name, pr));
        }
        buf.append(" )");
        return buf.toString();
    }
    
}
