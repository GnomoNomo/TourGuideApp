package com.project.angelgnomo.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Gnomo on 5/24/2018.
 */

public class TourLocationAdapter extends ArrayAdapter<TourLocation> {

    public TourLocationAdapter(Context context, int resource, List<TourLocation> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_item, parent, false);
        }

        final TourLocation location = getItem(position);





        return super.getView(position, convertView, parent);
    }
}
