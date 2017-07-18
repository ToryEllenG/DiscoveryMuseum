package com.example.troygbv.discoverymuseum.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.R;

public class NewLandingPage extends AppCompatActivity {

    Button greenButton, blueButton, redButton, yellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_landing_page);

        greenButton = (Button)findViewById(R.id.greenButton);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewLandingPage.this, MainActivity.class);
                startActivity(i);
            }
        });

        blueButton = (Button)findViewById(R.id.blueButton);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewLandingPage.this, FragmentExhibits.class);
                startActivity(i);
            }
        });

        redButton = (Button)findViewById(R.id.redButton);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewLandingPage.this, FragmentPrograms.class);
                startActivity(i);
            }
        });

        yellowButton = (Button)findViewById(R.id.yellowButton);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewLandingPage.this, FragmentSupport.class);
                startActivity(i);
            }
        });
    }
}
