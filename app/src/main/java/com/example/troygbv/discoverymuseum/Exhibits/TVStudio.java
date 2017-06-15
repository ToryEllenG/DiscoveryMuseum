package com.example.troygbv.discoverymuseum.Exhibits;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.troygbv.discoverymuseum.Games.TVStudioGame;
import com.example.troygbv.discoverymuseum.Home.FragmentExhibits;
import com.example.troygbv.discoverymuseum.Home.MainActivity;
import com.example.troygbv.discoverymuseum.R;

public class TVStudio extends AppCompatActivity {

    Button game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvstudio);
        setTitle("TV Studio");
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        game = (Button)findViewById(R.id.tvGameButton);

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TVStudio.this, TVStudioGame.class);
                startActivity(i);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        finish();
        Intent i = new Intent(TVStudio.this, MainActivity.class);
        startActivity(i);
        return true;
    }
}
