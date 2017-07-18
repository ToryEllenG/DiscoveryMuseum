package com.example.troygbv.discoverymuseum.Home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.troygbv.discoverymuseum.R;

public class FragmentPrograms extends AppCompatActivity {

    Spinner chooseDay;
    TextView programs, date, desc;
    ImageView program;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_programs);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        chooseDay = (Spinner)findViewById(R.id.spinner);

        programs = (TextView)findViewById(R.id.programsTV);
        date = (TextView)findViewById(R.id.dateTimeTV);
        desc = (TextView)findViewById(R.id.descTV);

        program = (ImageView)findViewById(R.id.programImage);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseDay.setAdapter(adapter);

        chooseDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        program.setImageResource(R.drawable.tuesday);
                        programs.setText("Tree House Explorers");
                        date.setText("Tuesdays at 4:00 PM");
                        desc.setText("Take an exciting journey with Jack and Annie from the Magic Tree House Series by Mary Pope Osborne. We'll meet in the Discovery Tree House.");
                        break;
                    case 1:
                        program.setImageResource(R.drawable.wednesday);
                        programs.setText("In the Lab");
                        date.setText("Wednesdays at 4:00 PM");
                        desc.setText("Young inventors and engineers will have a chance to integrate all STEM disciplines as they tackle a different design problem each week.");
                        break;
                    case 2:
                        program.setImageResource(R.drawable.thursday);
                        programs.setText("Making Masterpieces");
                        date.setText("Thursdays at 4:00 PM");
                        desc.setText("Elementary aged artists will create their own masterpiece and hone their art skills as they explore the techniques of a different famous artist each week.");
                        break;
                    case 3:
                        program.setImageResource(R.drawable.friday);
                        programs.setText("Young Explorers");
                        date.setText("Fridays at 10:30 AM");
                        desc.setText("It’s a feast for the senses in this class designed just for toddlers. Each week will feature hands-on (sometimes messy) fun for kids and their caregivers.");
                        break;
                    case 4:
                        program.setImageResource(R.drawable.saturday);
                        programs.setText("Discovery Cart");
                        date.setText("Saturdays 11:00 AM - 2:00 PM");
                        desc.setText("Keep an eye out for the new_box Discovery Cart where you'll explore science, world culture, engineering and more...perfect for curious kids of all ages.");
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
