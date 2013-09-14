package com.jbrunton.daggerdemo.data;

import android.content.Context;

import com.jbrunton.daggerdemo.DaggerApp;
import com.jbrunton.daggerdemo.ForApplication;
import com.jbrunton.daggerdemo.data.users.MemoryUserDataSource;
import com.jbrunton.daggerdemo.data.users.UserDataSource;
import com.jbrunton.daggerdemo.data.users.UserProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 14/09/2013.
 */
@Module(library = true)
public class MemoryDataSourceModule {
    @Provides @Singleton UserDataSource provideUserDataSource() {
        return new MemoryUserDataSource();
    }
}
