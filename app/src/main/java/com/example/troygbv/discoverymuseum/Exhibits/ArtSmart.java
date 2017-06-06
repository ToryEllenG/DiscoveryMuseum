package com.example.troygbv.discoverymuseum.Exhibits;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.troygbv.discoverymuseum.Games.ArtSmartGame;
import com.example.troygbv.discoverymuseum.R;

public class ArtSmart extends AppCompatActivity {


    Button game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_smart);
        setTitle("Art Smart");


        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        game = (Button) findViewById(R.id.artGame);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ArtSmart.this, ArtSmartGame.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
