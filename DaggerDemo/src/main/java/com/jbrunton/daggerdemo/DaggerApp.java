package com.jbrunton.daggerdemo;

import android.app.Application;

import com.jbrunton.daggerdemo.data.users.MemoryUserManager;
import com.jbrunton.daggerdemo.data.users.UserProvider;
import com.jbrunton.daggerdemo.models.User;

import java.util.Arrays;

/**
 * Created by John on 12/09/2013.
 */
public class DaggerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UserProvider.get(new MemoryUserManager(
            Arrays.asList(new User[]{
                new User.Builder()
                        .setFirstName("John")
                        .setLastName("Brunton")
                        .getInstance()})
        )).fetch();
    }
}
