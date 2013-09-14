package com.jbrunton.daggerdemo;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * Created by John on 14/09/2013.
 */
public class BaseListFragment extends ListFragment {
    @Override public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((BaseActivity) getActivity()).inject(this);
    }
}
