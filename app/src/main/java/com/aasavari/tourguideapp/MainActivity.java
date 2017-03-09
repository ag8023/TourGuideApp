package com.aasavari.tourguideapp;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        //Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        //set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //give the tab layout to the viewpager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
