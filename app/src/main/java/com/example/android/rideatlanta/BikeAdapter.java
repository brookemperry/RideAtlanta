package com.example.android.rideatlanta;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BikeAdapter extends ArrayAdapter {
    public BikeAdapter(Activity context, ArrayList<Bike> bike){
        super(context, 0, bike);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused if not inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }
        //Get the Bike object located at this position
        Bike currentBike = (Bike) getItem(position);

        //Find the TextView in list.xml layout for name
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        //Find the TextView in list.xml for address
        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);

        //Find the TextView in list.xml for the website
        TextView websiteTextView = listItemView.findViewById(R.id.website_text_view);

        //Find the ImageView in list.xml
        ImageView imageView = listItemView.findViewById(R.id.image_view);

        //make ImageView visible if currentBike has an image id associated with it
        if (currentBike.hasImage()){
            imageView.setImageResource(currentBike.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else imageView.setVisibility(View.GONE);
        return listItemView;
    }
}
