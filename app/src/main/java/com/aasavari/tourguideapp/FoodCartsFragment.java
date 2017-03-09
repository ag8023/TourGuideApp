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
public class FoodCartsFragment extends Fragment {

    private ListView mListView;
    public FoodCartsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.tourist_list, container, false);

        //create an ArrayList of food cart tourist spot objects

        final List<TouristSpot> foodSpots = new ArrayList<>();
        foodSpots.add(new TouristSpot(getString(R.string.zombie), getString(R.string.zombie_loc),
                getString(R.string.zombie_desc), R.drawable.pastrami));
        foodSpots.add(new TouristSpot(getString(R.string.pyro), getString(R.string.pyro_loc),
                getString(R.string.pyro_desc), R.drawable.pyro));
        foodSpots.add(new TouristSpot(getString(R.string.chkguns), getString(R.string.chkguns_loc),
                getString(R.string.chkguns_desc), R.drawable.chkguns));

        TouristSpotAdapter foodAdapter = new TouristSpotAdapter(getActivity(), foodSpots);
        mListView = (ListView)rootView.findViewById(R.id.tourist_list);
        mListView.setAdapter(foodAdapter);
        return rootView;
    }

}
