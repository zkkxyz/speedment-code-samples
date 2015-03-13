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
import com.company.speedment.orm.test.VisitManager;
import com.speedment.orm.core.manager.AbstractManager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ProjectComponent;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'Hello Speedment Project.db0.hellospeedment'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class VisitManagerImpl extends AbstractManager<Integer, Visit, VisitBuilder> implements VisitManager {
    
    @Override
    public VisitBuilder builder() {
        return new VisitImpl();
    }
    
    @Override
    public VisitBuilder toBuilder(Visit prototype) {
        return new VisitImpl(prototype);
    }
    
    @Override
    public Stream<Visit> stream() {
        return Stream.empty();
    }
    
    @Override
    public Visit persist(Visit entity) {
        return entity;
    }
    
    @Override
    public Visit remove(Visit entity) {
        return entity;
    }
}