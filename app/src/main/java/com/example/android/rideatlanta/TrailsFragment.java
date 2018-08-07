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

public class TrailsFragment extends android.support.v4.app.Fragment {
    public TrailsFragment(){
        //constructor intentionally empty
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //List of Cycling trails
        final ArrayList<Bike> bike = new ArrayList<>();
        bike.add(new Bike ("Northside Trail", "Northside Beltline Trail, Atlanta, GA 30318", "https://beltline.org/trails/northside-trail/", R.drawable.alvan_nee_unsplash));
        bike.add(new Bike("Freedom Park", "Moreland Ave NE & North Avenue NE, Atlanta, GA 30308", "http://www.freedompark.org/fpc/", R.drawable.flo_karr_unsplash));
        bike.add(new Bike("Silver Comet Trail", "Silver Comet Trail, Smyrna, GA 30082", "http://www.silvercometga.com", R.drawable.rikki_chan_unsplash));
        bike.add(new Bike("Piedmont Park At Eastside BeltLine Trail Hub", "10th St NE, Atlanta, GA 30306", "https://beltline.org/explore-atlanta-beltline-trails/eastside-trail/", R.drawable.riley_harrison_unsplash));
        bike.add(new Bike("Palisades West Trail", "932 Akers Ridge Dr SE, Atlanta, GA 30339", "https://www.nps.gov/chat/planyourvisit/cycling.htm", R.drawable.simon_mumenthaler_unsplash));
        bike.add(new Bike("Arabia Mountain National Heritage Area", "3350 Klondike Rd, Lithonia, GA 30038", "3350 Klondike Rd, Lithonia, GA 30038", R.drawable.eddy_lackman_unsplash));

        //Create an{@link WordAdapter}, whose data source is a list of {@link Bike} entries
        BikeAdapter adapter = new BikeAdapter(getActivity(), bike);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

