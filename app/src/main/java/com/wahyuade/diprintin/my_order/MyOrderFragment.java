package com.wahyuade.diprintin.my_order;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wahyuade.diprintin.R;
import com.wahyuade.diprintin.model.FragmentTabModel;
import com.wahyuade.diprintin.my_order.on_going.OnGoingFragment;
import com.wahyuade.diprintin.my_order.success.SuccessFragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrderFragment extends Fragment {
    private ViewPager order_tab;
    private MyOrderAdapter adapter;
    private ArrayList<FragmentTabModel> tab;
    private FloatingActionButton order_baru;

    public MyOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View my_order = inflater.inflate(R.layout.fragment_my_order, container, false);
        final ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        order_tab = (ViewPager)my_order.findViewById(R.id.order_tab);
        order_baru = (FloatingActionButton)my_order.findViewById(R.id.order_baru);

        tab = new ArrayList<>();
        tab.add(new FragmentTabModel(new OnGoingFragment(), "On Going"));
        tab.add(new FragmentTabModel(new SuccessFragment(), "Success"));
        adapter = new MyOrderAdapter(getActivity().getSupportFragmentManager(), tab);
        order_tab.setAdapter(adapter);

        ActionBar.TabListener listener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                order_tab.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 1){
                    order_baru.hide();
                }else{
                    order_baru.show();
                }
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };

        for (int i = 0; i < tab.size(); i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            actionBar.addTab(actionBar.newTab().setText(tab.get(i).getTitle()).setTabListener(listener));
        }

        order_tab.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
                if(position == 1){
                    order_baru.hide();
                }else{
                    order_baru.show();
                }
            }
        });

        return my_order;
    }

}
