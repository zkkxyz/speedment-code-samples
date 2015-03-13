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
package com.company.speedment.orm.test;

import com.speedment.orm.config.model.Column;
import com.speedment.orm.config.model.Table;
import com.speedment.orm.core.manager.Manager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;
import com.speedment.orm.platform.component.ProjectComponent;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

/**
 * A manager representing an entity (for example, a row) in the Table 'Hello Speedment Project.db0.hellospeedment'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface TransitionManager extends Manager<List<Integer>, Transition, TransitionBuilder> {
    
    @Override
    default List<Integer> primaryKeyFor(Transition entity) {
        return Arrays.asList(entity.getTo(), entity.getFrom());
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("Hello Speedment Project.db0.hellospeedment");
    }
    
    @Override
    default Class<TransitionManager> getManagerClass() {
        return TransitionManager.class;
    }
    
    @Override
    default Class<Transition> getEntityClass() {
        return Transition.class;
    }
    
    @Override
    default Class<TransitionBuilder> getBuilderClass() {
        return TransitionBuilder.class;
    }
    
    @Override
    default Object get(Transition entity, Column column) {
        switch (column.getName()) {
            case "to" : return entity.getTo();
            case "from" : return entity.getFrom();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static TransitionManager get() {
        return (TransitionManager) Platform.get().get(ManagerComponent.class).manager(TransitionManager.class);
    }
}