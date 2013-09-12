package com.jbrunton.daggerdemo;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by John on 12/09/2013.
 */
public class DaggerApp extends Application {
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        bus = new Bus();
    }
}
