package com.jbrunton.daggerdemo;

import android.support.v4.app.FragmentActivity;

/**
 * Created by John on 12/09/2013.
 */
public abstract class BaseActivity extends FragmentActivity {
    private final ScopedBus scopedBus = new ScopedBus();

    protected ScopedBus getBus() {
        return scopedBus;
    }

    @Override public void onPause() {
        super.onPause();
        scopedBus.paused();
    }

    @Override public void onResume() {
        super.onResume();
        scopedBus.resumed();
    }
}
