package com.jbrunton.daggerdemo;

import android.app.Application;

import com.jbrunton.daggerdemo.data.UserProvider;

/**
 * Created by John on 12/09/2013.
 */
public class DaggerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UserProvider.get().fetch();
    }
}
