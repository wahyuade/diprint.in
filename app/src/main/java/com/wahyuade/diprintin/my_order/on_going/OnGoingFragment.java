package com.wahyuade.diprintin.my_order.on_going;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wahyuade.diprintin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnGoingFragment extends Fragment {


    public OnGoingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_going, container, false);
    }

}
