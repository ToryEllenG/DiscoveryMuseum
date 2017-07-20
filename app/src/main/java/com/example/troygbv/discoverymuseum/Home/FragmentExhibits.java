package com.example.troygbv.discoverymuseum.Home;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.troygbv.discoverymuseum.Exhibits.ArtSmart;
import com.example.troygbv.discoverymuseum.Exhibits.Construct;
import com.example.troygbv.discoverymuseum.Exhibits.Dentist;
import com.example.troygbv.discoverymuseum.Exhibits.DiscoveryTree;
import com.example.troygbv.discoverymuseum.Exhibits.Farm;
import com.example.troygbv.discoverymuseum.Exhibits.GamesGalore;
import com.example.troygbv.discoverymuseum.Exhibits.ImaginationPlayground;
import com.example.troygbv.discoverymuseum.Exhibits.Kitchen;
import com.example.troygbv.discoverymuseum.Exhibits.MakerCity;
import com.example.troygbv.discoverymuseum.Exhibits.Meadow;
import com.example.troygbv.discoverymuseum.Exhibits.MedicalCenter;
import com.example.troygbv.discoverymuseum.Exhibits.Outdoors;
import com.example.troygbv.discoverymuseum.Exhibits.Science;
import com.example.troygbv.discoverymuseum.Exhibits.SuperService;
import com.example.troygbv.discoverymuseum.Exhibits.TVStudio;
import com.example.troygbv.discoverymuseum.Exhibits.Theater;
import com.example.troygbv.discoverymuseum.R;

import java.util.ArrayList;

public class FragmentExhibits extends AppCompatActivity {

    GridView lv;
    ItemAdapter adapter;
    ArrayList<Integer> idImages;
    ArrayList<Integer> textImages;
    ArrayList<String> nameList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_exhibits);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        lv = (GridView) findViewById(android.R.id.list);
        idImages = new ArrayList<>();
        idImages = getList();
        nameList = new ArrayList<>();
        nameList = getNameList();
        textImages = new ArrayList<>();
        textImages = getTextImages();
        adapter = new ItemAdapter(FragmentExhibits.this, idImages, textImages, nameList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent kitchen = new Intent(FragmentExhibits.this, Kitchen.class);
                        startActivity(kitchen);
                        break;

                    case 1:
                        Intent construct = new Intent(FragmentExhibits.this, Construct.class);
                        startActivity(construct);
                        break;

                    case 2:
                        Intent medicalCenter = new Intent(FragmentExhibits.this, MedicalCenter.class);
                        startActivity(medicalCenter);
                        break;

                    case 3:
                        Intent tvStudio = new Intent(FragmentExhibits.this, TVStudio.class);
                        startActivity(tvStudio);
                        break;

                    case 4:
                        Intent science = new Intent(FragmentExhibits.this, Science.class);
                        startActivity(science);
                        break;

                    case 5:
                        Intent superService = new Intent(FragmentExhibits.this, SuperService.class);
                        startActivity(superService);
                        break;

                    case 6:
                        Intent theater = new Intent(FragmentExhibits.this, Theater.class);
                        startActivity(theater);
                        break;

                    case 7:
                        Intent farm = new Intent(FragmentExhibits.this, Farm.class);
                        startActivity(farm);
                        break;

                    case 8:
                        Intent artSmart = new Intent(FragmentExhibits.this, ArtSmart.class);
                        startActivity(artSmart);
                        break;

                    case 9:
                        Intent meadow = new Intent(FragmentExhibits.this, Meadow.class);
                        startActivity(meadow);
                        break;

                    case 10:
                        Intent outdoors = new Intent(FragmentExhibits.this, Outdoors.class);
                        startActivity(outdoors);
                        break;

                    case 11:
                        Intent dentist = new Intent(FragmentExhibits.this, Dentist.class);
                        startActivity(dentist);
                        break;

                    case 12:
                        Intent tree = new Intent(FragmentExhibits.this, DiscoveryTree.class);
                        startActivity(tree);
                        break;

                    case 13:
                        Intent playground = new Intent(FragmentExhibits.this, ImaginationPlayground.class);
                        startActivity(playground);
                        break;

                    case 14:
                        Intent games = new Intent(FragmentExhibits.this, GamesGalore.class);
                        startActivity(games);
                        break;

                    case 15:
                        Intent maker = new Intent(FragmentExhibits.this, MakerCity.class);
                        startActivity(maker);
                        break;
                }
            }
        });
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
        idImages.add(R.drawable.discoverytree);
        idImages.add(R.drawable.imaginationplayground);
        idImages.add(R.drawable.gamesgalore);
        idImages.add(R.drawable.makercity);
        return idImages;
    }

    public ArrayList<Integer> getTextImages(){
        textImages = new ArrayList<>();
        textImages.add(R.drawable.gamepad_variant);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.gamepad_variant);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.gamepad_variant);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.gamepad_variant);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.transparent);
        textImages.add(R.drawable.box_new);
        textImages.add(R.drawable.box_new);
        textImages.add(R.drawable.box_new);
        textImages.add(R.drawable.box_new);
        return textImages;
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
        nameList.add("Discovery Tree");
        nameList.add("Imagination Playground");
        nameList.add("Games Galore");
        nameList.add("Maker City Makerspace");
        return nameList;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        Intent i = new Intent(FragmentExhibits.this, NewLandingPage.class);
        startActivity(i);
        return true;
    }
}
