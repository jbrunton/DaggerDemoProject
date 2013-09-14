package com.jbrunton.daggerdemo;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshAttacher;

/**
 * Created by John on 14/09/2013.
 */
@Module(library = true)
public class PullToRefreshModule {
    private Activity activity;

    public PullToRefreshModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @Singleton PullToRefreshAttacher providePullToRefreshAttacher() {
        return PullToRefreshAttacher.get(activity);
    }
}
