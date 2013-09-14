package com.jbrunton.daggerdemo.data;

import com.jbrunton.daggerdemo.DaggerApp;
import com.jbrunton.daggerdemo.data.users.UserDataSource;
import com.jbrunton.daggerdemo.data.users.UserProvider;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 14/09/2013.
 */
@Module(
        library = true,
        complete = false,
        injects = DaggerApp.class
)
public class DataProviderModule {
    @Provides @Singleton UserProvider provideUserProvider(Bus bus, UserDataSource userDataSource) {
        return new UserProvider(bus, userDataSource);
    }
}
