package com.example.troygbv.discoverymuseum.Games;

import android.graphics.PorterDuff;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.Exhibits.SuperService;
import com.example.troygbv.discoverymuseum.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuperServiceGame extends AppCompatActivity {

    TextView tv_info, tv_word;

    EditText et_guess;

    Button b_check, b_new;

    Random r;

    String currentWord;

    String[] dictionary = {
            "hood",
            "mirror",
            "headlight",
            "radiator",
            "door",
            "bumper",
            "window",
            "windshield",
            "trunk",
            "wheel",
            "gas",
            "tire"
    };

    //Edit this to show picture when scrambled word pops up

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_service_game);
        setTitle("Car Part Scramble");

        tv_info = (TextView) findViewById(R.id.tv_info);
        tv_word = (TextView) findViewById(R.id.tv_word);

        et_guess = (EditText) findViewById(R.id.et_guess);

        b_check = (Button) findViewById(R.id.b_check);
        b_new = (Button) findViewById(R.id.b_new);

        r = new Random();

        newGame();

        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(et_guess.getText().toString().equalsIgnoreCase(currentWord)) {
                  tv_info.setText("Correct!");

                  Toast correct = Toast.makeText(SuperServiceGame.this, "Correct!", Toast.LENGTH_SHORT);
                  correct.show();

                  b_check.setEnabled(false);
                  b_new.setEnabled(true);
              } else {
                  Toast tryAgain = Toast.makeText(SuperServiceGame.this, "Try Again!", Toast.LENGTH_SHORT);
                  tryAgain.show();
                  tv_info.setText("Try Again!");
              }


            }
        });

        b_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    //shuffle word
    private String shuffleWord(String word){
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }

    private void newGame(){
        currentWord = dictionary[r.nextInt(dictionary.length)];

        tv_word.setText(shuffleWord(currentWord));

        //clear field
        et_guess.setText("");

        //switch buttons
        b_new.setEnabled(false);
        b_check.setEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
