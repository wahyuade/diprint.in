package com.wahyuade.diprintin.model;

import android.support.v4.app.Fragment;

/**
 * Created by wahyu on 12/1/2017.
 */

public class FragmentTabModel {
    private Fragment fragment;
    private CharSequence title;

    public FragmentTabModel(Fragment fragment, CharSequence title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public CharSequence getTitle() {
        return title;
    }
}
