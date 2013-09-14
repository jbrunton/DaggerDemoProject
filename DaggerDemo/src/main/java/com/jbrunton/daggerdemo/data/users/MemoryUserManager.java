package com.jbrunton.daggerdemo.data.users;

import com.jbrunton.daggerdemo.models.User;

import java.util.Collection;

/**
 * Created by John on 14/09/2013.
 */
public class MemoryUserManager implements UserManager {
    private Collection<User> users;

    public MemoryUserManager(Collection<User> users) {
        this.users = users;
    }

    @Override
    public Collection<User> loadUsers() {
        return users;
    }
}
