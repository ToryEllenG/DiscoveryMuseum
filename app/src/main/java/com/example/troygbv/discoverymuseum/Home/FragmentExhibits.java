package com.example.troygbv.discoverymuseum;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.troygbv.discoverymuseum.Exhibits.ArtSmart;
import com.example.troygbv.discoverymuseum.Exhibits.Construct;
import com.example.troygbv.discoverymuseum.Exhibits.Dentist;
import com.example.troygbv.discoverymuseum.Exhibits.Farm;
import com.example.troygbv.discoverymuseum.Exhibits.Kitchen;
import com.example.troygbv.discoverymuseum.Exhibits.Meadow;
import com.example.troygbv.discoverymuseum.Exhibits.MedicalCenter;
import com.example.troygbv.discoverymuseum.Exhibits.Outdoors;
import com.example.troygbv.discoverymuseum.Exhibits.Science;
import com.example.troygbv.discoverymuseum.Exhibits.SuperService;
import com.example.troygbv.discoverymuseum.Exhibits.TVStudio;
import com.example.troygbv.discoverymuseum.Exhibits.Theater;

import java.util.ArrayList;


public class FragmentExhibits extends ListFragment {

    ListView lv;
    ItemAdapter adapter;
    ArrayList<Integer> idImages;
    ArrayList<String> nameList;

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

        lv = (ListView) view.findViewById(android.R.id.list);
        idImages = new ArrayList<>();
        idImages = getList();
        nameList = new ArrayList<>();
        nameList = getNameList();
        adapter = new ItemAdapter(getActivity(), idImages, nameList);
        lv.setAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        switch ( position )
        {
            case 0: Intent kitchen = new Intent(getActivity(), Kitchen.class);
                startActivity(kitchen);
                break;

            case 1: Intent construct = new Intent(getActivity(), Construct.class);
                startActivity(construct);
                break;

            case 2: Intent medicalCenter = new Intent(getActivity(), MedicalCenter.class);
                startActivity(medicalCenter);
                break;

            case 3: Intent tvStudio = new Intent(getActivity(), TVStudio.class);
                startActivity(tvStudio);
                break;

            case 4: Intent science = new Intent(getActivity(), Science.class);
                startActivity(science);
                break;

            case 5: Intent superService = new Intent(getActivity(), SuperService.class);
                startActivity(superService);
                break;

            case 6: Intent theater = new Intent(getActivity(), Theater.class);
                startActivity(theater);
                break;

            case 7: Intent farm = new Intent(getActivity(), Farm.class);
                startActivity(farm);
                break;

            case 8: Intent artSmart = new Intent(getActivity(), ArtSmart.class);
                startActivity(artSmart);
                break;

            case 9: Intent meadow = new Intent(getActivity(), Meadow.class);
                startActivity(meadow);
                break;

            case 10: Intent outdoors = new Intent(getActivity(), Outdoors.class);
                startActivity(outdoors);
                break;

            case 11: Intent dentist = new Intent(getActivity(), Dentist.class);
                startActivity(dentist);
                break;
        }
    }

    public ArrayList<Integer> getList(){
        idImages = new ArrayList<>();
        idImages.add(R.drawable.kitchen);
        idImages.add(R.drawable.construct);
        idImages.add(R.drawable.city);
        idImages.add(R.drawable.tv);
        idImages.add(R.drawable.science);
        idImages.add(R.drawable.car);
        idImages.add(R.drawable.theater);
        idImages.add(R.drawable.farm);
        idImages.add(R.drawable.art);
        idImages.add(R.drawable.meadow);
        idImages.add(R.drawable.camp);
        idImages.add(R.drawable.dentist);
        return idImages;
    }

    public ArrayList<String> getNameList(){
        nameList = new ArrayList<>();
        nameList.add("CK's Kitchen & Farmer's Market");
        nameList.add("Construction Zone");
        nameList.add("Friendly City Medical Center");
        nameList.add("TV Studio");
        nameList.add("Science Lab");
        nameList.add("Super Service Center");
        nameList.add("Virginia Theater");
        nameList.add("Down on the Farm");
        nameList.add("Art Smart");
        nameList.add("Over in the Meadow");
        nameList.add("Great Outdoors");
        nameList.add("Friendly City Dental Exhibit");
        return nameList;
    }

}