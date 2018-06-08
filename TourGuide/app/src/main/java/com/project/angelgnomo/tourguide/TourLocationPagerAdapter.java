package com.project.angelgnomo.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Gnomo on 5/21/2018.
 */

public class TourLocationPagerAdapter extends FragmentPagerAdapter {

    public TourLocationPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Title";
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new RestaurantRecomendations();
            case 1:
                return new RestaurantRecomendations();
            case 2:
                return new RestaurantRecomendations();
            case 3:
                return new RestaurantRecomendations();
        }

        return new RestaurantRecomendations();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
