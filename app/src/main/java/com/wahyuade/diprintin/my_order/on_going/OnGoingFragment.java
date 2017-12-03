package com.wahyuade.diprintin.my_order.on_going;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wahyuade.diprintin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnGoingFragment extends Fragment {
    private RecyclerView list_ongoing;

    public OnGoingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View on_going = inflater.inflate(R.layout.fragment_on_going, container, false);
        list_ongoing = (RecyclerView)on_going.findViewById(R.id.list_ongoing);
        list_ongoing.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        list_ongoing.setAdapter(new OnGoingAdapter(getActivity()));
        return on_going;
    }

}
