package com.jbrunton.daggerdemo.events;

import com.jbrunton.daggerdemo.models.User;

import java.util.Collection;

/**
 * Created by John on 12/09/2013.
 */
public class UsersAvailableEvent {
    private Collection<User> users;

    public UsersAvailableEvent(Collection<User> users) {
        this.users = users;
    }

    public Collection<User> getUsers() {
        return users;
    }
}
