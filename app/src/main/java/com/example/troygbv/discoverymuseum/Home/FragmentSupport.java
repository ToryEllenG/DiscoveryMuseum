package com.example.troygbv.discoverymuseum.Home;

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

public class FragmentSupport extends Fragment {

    ImageButton donate;
    Button support;

    public FragmentSupport(){
        //required empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_support, container, false);

        donate = (ImageButton)view.findViewById(R.id.donateButton);

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iexploremore.wufoo.com/forms/qqhpinm1rhznek/"));
                startActivity(browserIntent);
            }
        });

        support = (Button)view.findViewById(R.id.supportBT);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iexploremore.com/sponsor-donate/"));
                startActivity(browserIntent);
            }
        });


        return view;
    }
}
