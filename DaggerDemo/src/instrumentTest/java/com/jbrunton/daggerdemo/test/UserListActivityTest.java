package com.jbrunton.daggerdemo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jbrunton.daggerdemo.R;
import com.jbrunton.daggerdemo.UserListActivity;

import static android.test.ViewAsserts.assertOnScreen;

/**
 * Created by John on 14/09/2013.
 */
public class UserListActivityTest extends ActivityInstrumentationTestCase2 {
    public UserListActivityTest() {
        super(UserListActivity.class);
    }

    private UserListActivity activity;

    protected void setUp() throws Exception {
        super.setUp();
        activity = (UserListActivity) getActivity();
    }

    // Methods whose names are prefixed with test will automatically be run
    public void testContainer() {
        assertOnScreen(activity.getWindow().getDecorView(),
                activity.findViewById(R.id.user_list));
    }
}
