package com.example.android.rideatlanta;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends android.support.v4.app.Fragment {
    public ShopsFragment(){
        //constructor intentionally empty
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //List of Bike shops
        final ArrayList<Bike> bike = new ArrayList<>();
        bike.add(new Bike ("Atlanta Cycling – Vinings", "4335 Cobb Pkwy SE, Smyrna, GA 30339", "http://www.atlantacycling.com/\n"));
        bike.add(new Bike("Atlanta Bicycle Barn", "151 Sampson St NE, Atlanta, GA 30312", "http://atlbikebarn.com/"));
        bike.add(new Bike("Intown Bicycles", "1035 Monroe Dr NE, Atlanta, GA 30306", "http://www.intownbicycles.com/"));
        bike.add(new Bike("Atlanta Pro Bikes", "1039 North Highland Avenue Northeast, Atlanta, GA 30306", "https://www.atlantaprobikes.com/"));
        bike.add(new Bike("Outback Bikes", "1125 Euclid Ave NE, Atlanta, GA 30307", "https://www.outback-bikes.com/"));
        bike.add(new Bike("Performance Bicycle", "1471 Northeast Expy NE, Atlanta, GA 30329", "https://www.performancebike.com/shop/retail/ga/atlanta"));
        bike.add(new Bike("Peachtree Bikes", "310, 1000 Marietta St NW, Atlanta, GA 30318", "http://www.peachtreebikes.com/"));

        //Create an{@link WordAdapter}, whose data source is a list of {@link Bike} entries
        BikeAdapter adapter = new BikeAdapter(getActivity(), bike);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}


