package com.wahyuade.diprintin.my_order.success;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wahyuade.diprintin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuccessFragment extends Fragment {


    public SuccessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View success = inflater.inflate(R.layout.fragment_success, container, false);

        return success;
    }

}
