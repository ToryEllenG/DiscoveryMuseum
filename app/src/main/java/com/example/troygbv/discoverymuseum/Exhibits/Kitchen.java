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

import com.example.troygbv.discoverymuseum.Games.KitchenGame02;
import com.example.troygbv.discoverymuseum.Games.KitchenGame35;
import com.example.troygbv.discoverymuseum.Games.KitchenGame68;
import com.example.troygbv.discoverymuseum.R;

public class Kitchen extends AppCompatActivity {

    Button playBT;
    Spinner chooseAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
        setTitle("Kitchen & Farmers Market");

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        playBT = (Button)findViewById(R.id.playButton);
        playBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kitchen.this, "Please select your child's age range.", Toast.LENGTH_SHORT).show();
            }
        });

        chooseAge = (Spinner) findViewById(R.id.ageSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getApplicationContext(), R.array.age, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseAge.setAdapter(adapter);

        chooseAge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        playBT.setEnabled(false);
                        break;
                    case 1:
                        playBT.setEnabled(true);
                        Toast.makeText(Kitchen.this, "Your child is age 0 - 2.", Toast.LENGTH_SHORT).show();
                        playBT.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(Kitchen.this, KitchenGame02.class);
                                startActivity(play);
                            }
                        });
                        break;
                    case 2:
                        playBT.setEnabled(true);
                        Toast.makeText(Kitchen.this, "Your child is age 3 - 5.", Toast.LENGTH_SHORT).show();
                        playBT.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(Kitchen.this, KitchenGame35.class);
                                startActivity(play);
                            }
                        });
                        break;
                    case 3:
                        playBT.setEnabled(true);
                        Toast.makeText(Kitchen.this, "Your child is age 6 - 8+.", Toast.LENGTH_SHORT).show();
                        playBT.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent play = new Intent(Kitchen.this, KitchenGame68.class);
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
        return true;
    }

}
