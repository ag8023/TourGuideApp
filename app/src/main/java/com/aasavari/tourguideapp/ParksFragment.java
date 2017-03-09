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
public class ParksFragment extends Fragment {

    private ListView mListView;

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tourist_list, container, false);

        //create an ArrayList of parks tourist spot objects

        final List<TouristSpot> parkSpots = new ArrayList<>();

        parkSpots.add(new TouristSpot(getString(R.string.tmp), getString(R.string.tmp_loc), R.drawable.tom));
        parkSpots.add(new TouristSpot(getString(R.string.jpn), getString(R.string.jpn_loc), R.drawable.japan));
        parkSpots.add(new TouristSpot(getString(R.string.tabor), getString(R.string.tabor_loc), R.drawable.tabor));
        parkSpots.add(new TouristSpot(getString(R.string.fp), getString(R.string.fp_loc), R.drawable.fp));
        parkSpots.add(new TouristSpot(getString(R.string.chn), getString(R.string.chn_loc), R.drawable.lansu));

        TouristSpotAdapter parkAdapter = new TouristSpotAdapter(getActivity(), parkSpots);
        mListView = (ListView)rootView.findViewById(R.id.tourist_list);
        mListView.setAdapter(parkAdapter);

        return rootView;

    }

}
