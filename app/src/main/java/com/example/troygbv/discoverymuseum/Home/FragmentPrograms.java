package com.example.troygbv.discoverymuseum;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FragmentPrograms extends Fragment {

    Spinner chooseDay;
    TextView programs;

    public FragmentPrograms(){
        //required empty fragment
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_programs, container, false);

        chooseDay = (Spinner)view.findViewById(R.id.spinner);
        programs = (TextView)view.findViewById(R.id.textView6);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseDay.setAdapter(adapter);

        chooseDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //set power TextView based on spinner. Edit this later to  also include alternative results
                switch (position) {
                    case 0:
                        //set TextView based on user input
                        programs.setText("Tuesday Programs");
                        break;
                    case 1:
                        programs.setText("Wednesday Programs");
                        break;
                    case 2:
                        programs.setText("Thursday Programs");
                        break;
                    case 3:
                        programs.setText("Friday Programs");
                        break;
                    case 4:
                        programs.setText("Saturday Programs");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    return view;
    }
}
