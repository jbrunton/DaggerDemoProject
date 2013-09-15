package com.jbrunton.daggerdemo.common;

import android.content.Context;

import com.jbrunton.daggerdemo.DaggerApp;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 14/09/2013.
 */
@Module(library = true)
public class AndroidModule {
    private final DaggerApp application;

    public AndroidModule(DaggerApp application) {
        this.application = application;
    }

    /**
     * Allow the application context to be injected but require that it be annotated with
     * {@link ForApplication @ForApplication} to explicitly differentiate it from an activity context.
     */
    @Provides @Singleton @ForApplication
    Context provideApplicationContext() {
        return application;
    }

    @Provides @Singleton Bus provideBus() {
        return new Bus();
    }
}
