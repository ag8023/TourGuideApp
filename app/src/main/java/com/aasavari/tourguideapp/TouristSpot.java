package com.aasavari.tourguideapp;

/**
 * Created by Aasavari on 2/23/2017.
 */

public class TouristSpot {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mSpotName;
    private String mSpotLocation;
    private String mSpotDetails;

    public TouristSpot(String spotName, String spotLocation,String spotDetails)
    {
        mSpotName = spotName;
        mSpotLocation = spotLocation;
        mSpotDetails = spotDetails;
    }

    public TouristSpot(String spotName, String spotLocation,String spotDetails, int imageResourceId)
    {
        mSpotName = spotName;
        mSpotLocation = spotLocation;
        mSpotDetails = spotDetails;
        mImageResourceId = imageResourceId;
    }

    public TouristSpot(String spotName, String spotLocation, int imageResourceId){
        mSpotName = spotName;
        mSpotLocation = spotLocation;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getSpotName() {
        return mSpotName;
    }

    public void setSpotName(String mSpotName) {
        this.mSpotName = mSpotName;
    }

    public String getSpotLocation() {
        return mSpotLocation;
    }

    public void setSpotLocation(String mSpotLocation) {
        this.mSpotLocation = mSpotLocation;
    }

    public String getSpotDetails() {
        return mSpotDetails;
    }

    public void setSpotDetails(String mSpotDetails) {
        this.mSpotDetails = mSpotDetails;
    }

    public boolean hasImage(){
        if(mImageResourceId != NO_IMAGE_PROVIDED)
            return true;
        else
            return false;
    }

    public boolean hasDetails(){
        if(mSpotDetails != null && !mSpotDetails.isEmpty())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "TouristSpot{" +
                "mImageResourceId=" + mImageResourceId +
                ", mSpotName='" + mSpotName + '\'' +
                ", mSpotLocation='" + mSpotLocation + '\'' +
                ", mSpotDetails='" + mSpotDetails + '\'' +
                '}';
    }
}
