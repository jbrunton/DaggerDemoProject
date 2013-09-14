package com.jbrunton.daggerdemo;

import android.app.Application;

import com.jbrunton.daggerdemo.data.DataProviderModule;
import com.jbrunton.daggerdemo.data.MemoryDataSourceModule;
import com.jbrunton.daggerdemo.data.users.MemoryUserDataSource;
import com.jbrunton.daggerdemo.data.users.UserProvider;
import com.jbrunton.daggerdemo.models.User;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import dagger.ObjectGraph;

/**
 * Created by John on 12/09/2013.
 */
public class DaggerApp extends Application {
    private ObjectGraph applicationGraph;

    protected  @Inject UserProvider userProvider;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationGraph = ObjectGraph.create(getModules().toArray());

        applicationGraph.inject(this);

        userProvider.fetch();

        /*UserProvider.get(new MemoryUserDataSource(
            Arrays.asList(new User[]{
                new User.Builder()
                        .setFirstName("John")
                        .setLastName("Brunton")
                        .getInstance()})
        )).fetch();*/
    }

    /**
     * A list of modules to use for the application graph. Subclasses can override this method to
     * provide additional modules provided they call {@code super.getModules()}.
     */
    protected List<Object> getModules() {
        return Arrays.<Object>asList(
                new AndroidModule(this),
                new DataProviderModule(),
                new MemoryDataSourceModule());
    }

    public ObjectGraph getApplicationGraph() {
        return applicationGraph;
    }
}
