package com.jbrunton.daggerdemo;

import com.squareup.otto.Bus;

/**
 * Created by John on 12/09/2013.
 */
public class BusProvider {
    private static Bus instance;

    public static Bus get() {
        if (instance == null) {
            instance = new Bus();
        }
        return instance;
    }
}
