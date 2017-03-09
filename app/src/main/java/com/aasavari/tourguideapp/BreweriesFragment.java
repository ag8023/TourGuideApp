package com.aasavari.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BreweriesFragment extends Fragment {

    private ListView mListView;
    public BreweriesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View rootView =  inflater.inflate(R.layout.tourist_list, container, false);

        //create an ArrayList of brewery tourist spot objects

        final List<TouristSpot> brewSpots = new ArrayList<>();

        brewSpots.add(new TouristSpot(getString(R.string.deschutes), getString(R.string.des_loc), R.drawable.deschute));
        brewSpots.add(new TouristSpot(getString(R.string.cascade), getString(R.string.casc_loc), R.drawable.cascade));
        brewSpots.add(new TouristSpot(getString(R.string.hopworks), getString(R.string.hw_loc), R.drawable.hopworks));
        brewSpots.add(new TouristSpot(getString(R.string.fatheads), getString(R.string.fh_loc), R.drawable.fathead));

        TouristSpotAdapter brewAdapter = new TouristSpotAdapter(getActivity(), brewSpots);
        mListView = (ListView)rootView.findViewById(R.id.tourist_list);
        mListView.setAdapter(brewAdapter);
        return rootView;
    }

}
