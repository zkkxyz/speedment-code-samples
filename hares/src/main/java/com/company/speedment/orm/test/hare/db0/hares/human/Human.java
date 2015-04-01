package com.company.speedment.orm.test.hare.db0.hares.human;

import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table 'hare.db0.hares.human'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface Human {
    
    Integer getId();
    
    String getName();
    
    static HumanBuilder builder() {
        return HumanManager.get().builder();
    }
    
    default HumanBuilder toBuilder() {
        return HumanManager.get().toBuilder(this);
    }
    
    default String toJson() {
        return HumanManager.get().toJson(this);
    }
    
    static Stream<Human> stream() {
        return HumanManager.get().stream();
    }
    
    default Optional<Human> persist() {
        return HumanManager.get().persist(this);
    }
    
    default Optional<Human> update() {
        return HumanManager.get().update(this);
    }
    
    default Optional<Human> remove() {
        return HumanManager.get().remove(this);
    }
}