package com.jbrunton.daggerdemo.data.users;

import com.jbrunton.daggerdemo.models.User;

import java.util.Collection;

/**
 * Created by John on 14/09/2013.
 */
public interface UserDataSource {
    Collection<User> loadUsers();
}
