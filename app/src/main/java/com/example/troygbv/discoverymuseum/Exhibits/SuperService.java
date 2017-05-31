package com.example.troygbv.discoverymuseum.Exhibits;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.troygbv.discoverymuseum.Games.SuperServiceGame;
import com.example.troygbv.discoverymuseum.R;

public class SuperService extends AppCompatActivity {

    Button playBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_service);
        setTitle("Super Service Center");

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        playBT = (Button)findViewById(R.id.playButton);
        playBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(SuperService.this, SuperServiceGame.class);
                startActivity(play);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
