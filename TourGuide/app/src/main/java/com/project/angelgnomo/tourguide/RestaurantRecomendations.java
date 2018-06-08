package com.project.angelgnomo.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RestaurantRecomendations extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<TourLocation> locations = new ArrayList<>();



        return inflater.inflate(R.layout.fragment_restaurant_recomendations, container, false);
    }

}
