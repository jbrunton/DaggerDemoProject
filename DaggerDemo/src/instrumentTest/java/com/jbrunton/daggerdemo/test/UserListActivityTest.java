package com.jbrunton.daggerdemo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;
import com.jbrunton.daggerdemo.R;
import com.jbrunton.daggerdemo.UserListActivity;

import junit.framework.Assert;

import static android.test.ViewAsserts.assertOnScreen;

/**
 * Created by John on 14/09/2013.
 */
public class UserListActivityTest extends ActivityInstrumentationTestCase2 {
    public UserListActivityTest() {
        super(UserListActivity.class);
    }

    private UserListActivity activity;
    private Solo solo;

    protected void setUp() throws Exception {
        super.setUp();
        activity = (UserListActivity) getActivity();
        solo = new Solo(getInstrumentation(), activity);
    }

    // Methods whose names are prefixed with test will automatically be run
    public void testContainer() {
        assertOnScreen(activity.getWindow().getDecorView(),
                activity.findViewById(R.id.user_list));
    }

    public void testDisplayUsers() {
        // Given a list of users
        

        // When I view the UserListActivity
        getInstrumentation().waitForIdleSync();

        // Then I should see a list of the names of the users
        Assert.assertTrue(solo.searchText("John Brunton"));
    }
}
