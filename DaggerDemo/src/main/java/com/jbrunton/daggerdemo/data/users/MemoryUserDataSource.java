package com.jbrunton.daggerdemo.data.users;

import android.app.ListFragment;

import com.jbrunton.daggerdemo.models.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by John on 14/09/2013.
 */
public class MemoryUserDataSource implements UserDataSource {
    private List<User> users = new LinkedList<User>();

    public void addUsers(Collection<User> users) {
        this.users.addAll(users);
    }

    @Override
    public Collection<User> loadUsers() {
        return users;
    }
}
