package com.example.troygbv.discoverymuseum;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class FragmentExhibits extends ListFragment {

    String[] itemname ={
            "CK's Kitchen & Farmer's Market",
            "Construction Zone",
            "Friendly City Medical Center",
            "TV Studio",
            "Science Lab",
            "Super Service Center",
            "Virginia Theater",
            "Down on the Farm",
            "Art Smart",
            "Over in the Meadow",
            "Great Outdoors",
            "Friendly City Dental Exhibit"
    };

    String[] descriptions ={
            "CK's Kitchen & Farmer's Market",
            "Construction Zone",
            "Friendly City Medical Center",
            "TV Studio",
            "Science Lab",
            "Super Service Center",
            "Virginia Theater",
            "Down on the Farm",
            "Art Smart",
            "Over in the Meadow",
            "Great Outdoors",
            "Friendly City Dental Exhibit"
    };
    Integer[] imgid={
            R.drawable.kitchen,
            R.drawable.construct,
            R.drawable.city,
            R.drawable.tv,
            R.drawable.science,
            R.drawable.car,
            R.drawable.theater,
            R.drawable.farm,
            R.drawable.art,
            R.drawable.meadow,
            R.drawable.camp,
            R.drawable.dentist,
    };


   public FragmentExhibits(){
        //required empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_exhibits, container, false);

        //set the listAdapter to the Strings
      this.setListAdapter(new ArrayAdapter<>(this.getActivity(), R.layout.list, R.id.ItemName, itemname));



    return view;
    }
}
