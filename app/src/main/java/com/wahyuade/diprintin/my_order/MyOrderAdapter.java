package com.wahyuade.diprintin.my_order;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.wahyuade.diprintin.model.FragmentTabModel;

import java.util.ArrayList;

/**
 * Created by wahyu on 12/3/2017.
 */

public class MyOrderAdapter extends FragmentStatePagerAdapter {
    private ArrayList<FragmentTabModel> data_fragment;

    public MyOrderAdapter(FragmentManager fm, ArrayList<FragmentTabModel> data_fragment) {
        super(fm);
        this.data_fragment = data_fragment;
    }

    @Override
    public Fragment getItem(int position) {
        return data_fragment.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return data_fragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return data_fragment.get(position).getTitle();
    }
}
