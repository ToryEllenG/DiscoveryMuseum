package com.example.troygbv.discoverymuseum.Exhibits;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.Games.TVStudioGame02;
import com.example.troygbv.discoverymuseum.Games.TVStudioGame35;
import com.example.troygbv.discoverymuseum.Games.TVStudioGame;
import com.example.troygbv.discoverymuseum.Home.MainActivity;
import com.example.troygbv.discoverymuseum.R;

public class TVStudio extends AppCompatActivity {

    Button game;
    Spinner chooseAge;
    
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

        chooseAge = (Spinner) findViewById(R.id.ageSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getApplicationContext(), R.array.age, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseAge.setAdapter(adapter);

        chooseAge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        game.setEnabled(false);
                        break;
                    case 1:
                        game.setEnabled(true);
                        Toast.makeText(TVStudio.this, "Your child is age 0 - 2.", Toast.LENGTH_SHORT).show();
                        game.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(TVStudio.this, TVStudioGame02.class);
                                startActivity(play);
                            }
                        });
                        break;
                    case 2:
                        game.setEnabled(true);
                        Toast.makeText(TVStudio.this, "Your child is age 3 - 5.", Toast.LENGTH_SHORT).show();
                        game.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(TVStudio.this, TVStudioGame35.class);
                                startActivity(play);
                            }
                        });
                        break;
                    case 3:
                        game.setEnabled(true);
                        Toast.makeText(TVStudio.this, "Your child is age 6 - 8+.", Toast.LENGTH_SHORT).show();
                        game.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(TVStudio.this, TVStudioGame.class);
                                startActivity(play);
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
