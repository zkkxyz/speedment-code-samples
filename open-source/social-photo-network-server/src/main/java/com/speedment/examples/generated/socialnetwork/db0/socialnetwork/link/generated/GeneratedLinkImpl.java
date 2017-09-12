package com.speedment.examples.generated.socialnetwork.db0.socialnetwork.link.generated;

import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.link.Link;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.User;
import com.speedment.runtime.core.manager.Manager;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation of the {@link
 * com.speedment.examples.generated.socialnetwork.db0.socialnetwork.link.Link}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedLinkImpl implements Link {
    
    private long follower;
    private long follows;
    
    protected GeneratedLinkImpl() {
        
    }
    
    @Override
    public long getFollower() {
        return follower;
    }
    
    @Override
    public long getFollows() {
        return follows;
    }
    
    @Override
    public Link setFollower(long follower) {
        this.follower = follower;
        return this;
    }
    
    @Override
    public Link setFollows(long follows) {
        this.follows = follows;
        return this;
    }
    
    @Override
    public User findFollower(Manager<User> foreignManager) {
        return foreignManager.stream().filter(User.ID.equal(getFollower())).findAny().orElse(null);
    }
    
    @Override
    public User findFollows(Manager<User> foreignManager) {
        return foreignManager.stream().filter(User.ID.equal(getFollows())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("follower = " + Objects.toString(getFollower()));
        sj.add("follows = "  + Objects.toString(getFollows()));
        return "LinkImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Link)) { return false; }
        final Link thatLink = (Link)that;
        if (this.getFollower() != thatLink.getFollower()) {return false; }
        if (this.getFollows() != thatLink.getFollows()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getFollower());
        hash = 31 * hash + Long.hashCode(getFollows());
        return hash;
    }
}