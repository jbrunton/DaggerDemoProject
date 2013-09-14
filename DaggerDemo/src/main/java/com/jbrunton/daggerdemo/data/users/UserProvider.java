package com.jbrunton.daggerdemo.data.users;

import android.os.AsyncTask;

import com.jbrunton.daggerdemo.events.RefreshUsersEvent;
import com.jbrunton.daggerdemo.events.UsersAvailableEvent;
import com.jbrunton.daggerdemo.models.User;
import com.squareup.otto.Bus;
import com.squareup.otto.Produce;
import com.squareup.otto.Subscribe;

import java.util.Collection;

/**
 * Created by John on 12/09/2013.
 */
public class UserProvider {
    private Collection<User> users;
    private Bus bus;
    private UserDataSource userDataSource;

    @Produce public UsersAvailableEvent produceUsers() {
        return new UsersAvailableEvent(this.users);
    }

    @Subscribe public void refreshUsers(RefreshUsersEvent event) {
        refresh();
    }

    public void refresh() {
        new UsersTask().execute();
    }

    public void fetch() {
        if (users == null) {
            refresh();
        }
    }

    protected void post(Collection<User> users) {
        this.users = users;
        bus.post(produceUsers());
    }

    public UserProvider(Bus bus, UserDataSource userDataSource) {
        this.bus = bus;
        this.userDataSource = userDataSource;
        bus.register(this);
    }

    public class UsersTask extends AsyncTask<Void, Void, Collection<User>> {
        @Override
        protected Collection<User> doInBackground(Void... params) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return userDataSource.loadUsers();
        }

        @Override
        protected void onPostExecute(Collection<User> users) {
            UserProvider.this.post(users);
        }
    }
}
