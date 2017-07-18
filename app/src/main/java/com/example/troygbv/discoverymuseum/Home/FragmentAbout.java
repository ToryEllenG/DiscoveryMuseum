package com.example.troygbv.discoverymuseum.Home;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.troygbv.discoverymuseum.R;

public class FragmentAbout extends Fragment {

    ImageButton instagram, facebook, twitter;
    Button website;

    public FragmentAbout(){
        //required empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_about, container, false);

        instagram = (ImageButton)view.findViewById(R.id.instagram);
        facebook = (ImageButton)view.findViewById(R.id.facebook);
        twitter = (ImageButton)view.findViewById(R.id.twitter);
        website = (Button)view.findViewById(R.id.websiteButton);


        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iexploremore.com/"));
                startActivity(browserIntent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if instagram app is installed
                Uri uri = Uri.parse("https://www.instagram.com/_u/iexploremore");
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, uri);
                browserIntent.setPackage("com.instagram.android");
                try {
                    startActivity(browserIntent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/iexploremore/")));
                }
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent;
                try {
                    //check if phone has facebook app installed
                    getContext().getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/306198892738391"));
                    browserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } catch (Exception e){
                    browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/ExploreMoreDiscoveryMuseum"));
                }
                getContext().startActivity(browserIntent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //check if twitter is installed
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=iexploremore"));
                    startActivity(browserIntent);
                } catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/iexploremore")));
                }
            }
        });

        return view;
    }



}
