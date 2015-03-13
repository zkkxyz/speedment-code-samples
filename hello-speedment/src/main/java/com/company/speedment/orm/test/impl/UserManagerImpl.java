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

import com.company.speedment.orm.test.User;
import com.company.speedment.orm.test.UserBuilder;
import com.company.speedment.orm.test.UserManager;
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
public class UserManagerImpl extends AbstractManager<Integer, User, UserBuilder> implements UserManager {
    
    @Override
    public UserBuilder builder() {
        return new UserImpl();
    }
    
    @Override
    public UserBuilder toBuilder(User prototype) {
        return new UserImpl(prototype);
    }
    
    @Override
    public Stream<User> stream() {
        return Stream.empty();
    }
    
    @Override
    public User persist(User entity) {
        return entity;
    }
    
    @Override
    public User remove(User entity) {
        return entity;
    }
}