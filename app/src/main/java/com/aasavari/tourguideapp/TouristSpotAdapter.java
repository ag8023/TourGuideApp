package com.aasavari.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by Aasavari on 2/23/2017.
 */

public class TouristSpotAdapter extends ArrayAdapter<TouristSpot> {

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        // get the touristspot object at the position in the arraylist, passed to the adapter
        TouristSpot currentSpot = getItem(position);
        View listItemView = convertView; // this is the view to be used/recycled
        //if it is a fresh view(not being recycled, then inflate a new view from the list_item.xml layout
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        ImageView imgView = (ImageView)listItemView.findViewById(R.id.loc_image);
        if(currentSpot.hasImage()) {
            imgView.setImageResource(currentSpot.getImageResourceId());
            imgView.setVisibility(View.VISIBLE);
        }
        else imgView.setVisibility(View.GONE);
        TextView txtName = (TextView)listItemView.findViewById(R.id.txt_spotName);
        String nameLoc = currentSpot.getSpotName()+"\n\n"+ currentSpot.getSpotLocation();
        txtName.setText(nameLoc.trim());
        TextView txtDetails = (TextView)listItemView.findViewById(R.id.txt_details);
        if(currentSpot.hasDetails()) {
            txtDetails.setText(currentSpot.getSpotDetails());
            txtDetails.setVisibility(View.VISIBLE);

        }
        else
        {
            txtDetails.setVisibility(View.GONE);

        }
        return listItemView;
    }

    public TouristSpotAdapter(Activity context,List<TouristSpot> touristSpots) {
        super(context, 0, touristSpots);


    }
}
