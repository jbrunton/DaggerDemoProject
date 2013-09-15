package com.jbrunton.daggerdemo.data;

import com.jbrunton.daggerdemo.data.users.MemoryUserDataSource;
import com.jbrunton.daggerdemo.data.users.UserDataSource;

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
