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

public class ClubsFragment extends android.support.v4.app.Fragment {

    public ClubsFragment(){
    //constructor intentionally empty
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


    //List of Cycling clubs
    final ArrayList<Bike> bike = new ArrayList<>();
    bike.add(new Bike ("Metro Atlanta Cycling Club", "1256 Bayridge Drive, Riverdale, GA 30296", "http://www.maccattack.com/"));
    bike.add(new Bike("Sorella Cycling", "2451 Cumberland Pkwy #3510, Atlanta, GA 30339", "http://www.sorellacycling.com/"));
    bike.add(new Bike("Ladies on Spokes", "PO Box 1752 Senoia, GA 30276", "http://www.ladiesonspokes.com/"));
    bike.add(new Bike("Southern Bicycling League", "1401 Sanden Ferry Drive, Decatur, Georgia, 30033", "http://bikesbl.org/"));
    bike.add(new Bike("Dunwoody Cycling", "1832 Independence Sq, Suite C,  Dunwoody, GA 30338", "http://www.dunwoodycycling.com/"));

    //Create an{@link WordAdapter}, whose data source is a list of {@link Bike} entries
    BikeAdapter adapter = new BikeAdapter(getActivity(), bike);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
