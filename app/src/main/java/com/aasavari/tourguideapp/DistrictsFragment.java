package com.aasavari.tourguideapp;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DistrictsFragment extends Fragment {

    private ListView mListView;

    public DistrictsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tourist_list, container, false);

        //create an ArrayList of District tourist spots

        final List<TouristSpot> districtSpots = new ArrayList<>();
        districtSpots.add(new TouristSpot(getString(R.string.downtown_name), getString(R.string.location),
                getString(R.string.downtown_desc), R.drawable.pdx));
        districtSpots.add(new TouristSpot(getString(R.string.china_name), getString(R.string.location),
                getString(R.string.china_desc), R.drawable.oldtown));
        districtSpots.add(new TouristSpot(getString(R.string.pearl_name), getString(R.string.location),
                getString(R.string.pearl_desc), R.drawable.pearl));
        districtSpots.add(new TouristSpot(getString(R.string.lloyd_name), getString(R.string.location),
                getString(R.string.lloyd_desc), R.drawable.lloyd));
        districtSpots.add(new TouristSpot(getString(R.string.nob_name), getString(R.string.location),
                getString(R.string.nob_desc), R.drawable.nobhill));
        districtSpots.add(new TouristSpot(getString(R.string.alberta_name), getString(R.string.location),
                getString(R.string.alberta_desc), R.drawable.alberta));
        districtSpots.add(new TouristSpot(getString(R.string.hawt_name), getString(R.string.location),
                getString(R.string.hawt_desc), R.drawable.hawt));
        districtSpots.add(new TouristSpot(getString(R.string.belmont_name), getString(R.string.location),
                getString(R.string.belmont_desc), R.drawable.belmont));

        TouristSpotAdapter districtAdapter = new TouristSpotAdapter(getActivity(),districtSpots);
        mListView = (ListView)rootView.findViewById(R.id.tourist_list);

        mListView.setAdapter(districtAdapter);

        return rootView;
    }

}
