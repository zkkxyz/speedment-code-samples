/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.company.speedment.orm.test.impl;

import com.company.speedment.orm.test.Visit;
import com.company.speedment.orm.test.VisitBuilder;
import java.time.LocalDateTime;
import javax.annotation.Generated;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'Hello Speedment Project.db0.hellospeedment'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class VisitImpl implements VisitBuilder {
    
    private String image;
    private Integer user;
    private LocalDateTime time;
    private Integer id;
    
    public VisitImpl() {
        
    }
    
    public VisitImpl(final Visit visit) {
        setImage(visit.getImage());
        setUser(visit.getUser());
        setTime(visit.getTime());
        setId(visit.getId());
    }
    
    @Override
    public String getImage() {
        return image;
    }
    
    @Override
    public VisitImpl setImage(String image) {
        this.image = image;
        return this;
    }
    
    @Override
    public Integer getUser() {
        return user;
    }
    
    @Override
    public VisitImpl setUser(Integer user) {
        this.user = user;
        return this;
    }
    
    @Override
    public LocalDateTime getTime() {
        return time;
    }
    
    @Override
    public VisitImpl setTime(LocalDateTime time) {
        this.time = time;
        return this;
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public VisitImpl setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Visit build() {
        return new VisitImpl(this);
    }
}