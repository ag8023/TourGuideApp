package com.aasavari.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aasavari on 2/23/2017.
 */

/* Provides the appropriate {@link Fragment} for a view pager.
        */

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new DistrictsFragment();
        else if (position == 1)
            return new FoodCartsFragment();
        else if (position == 2)
            return new ParksFragment();
        else
            return new BreweriesFragment();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //generate the title of each page, based on the item position
        switch(position){
            case 0:
                return mContext.getString(R.string.category_districts);
            case 1:
                return mContext.getString(R.string.category_carts);
            case 2:
                return mContext.getString(R.string.category_parks);
            default:
                return mContext.getString(R.string.category_breweries);
        }
    }
}
