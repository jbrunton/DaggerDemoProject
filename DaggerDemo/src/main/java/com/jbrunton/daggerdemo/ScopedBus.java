package com.jbrunton.daggerdemo;

import com.squareup.otto.Bus;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by John on 12/09/2013.
 */
public class ScopedBus {
    // See Otto's sample application for how BusProvider works. Any mechanism
    // for getting a singleton instance will work.
    private final Bus bus = BusProvider.get();
    private final Set<Object> objects = new HashSet<Object>();
    private boolean active;

    public void register(Object obj) {
        objects.add(obj);
        if (active) {
            bus.register(obj);
        }
    }

    public void unregister(Object obj) {
        objects.remove(obj);
        if (active) {
            bus.unregister(obj);
        }
    }

    public void post(Object event) {
        bus.post(event);
    }

    void paused() {
        active = false;
        for (Object obj : objects) {
            bus.unregister(obj);
        }
    }

    void resumed() {
        active = true;
        for (Object obj : objects) {
            bus.register(obj);
        }
    }
}
