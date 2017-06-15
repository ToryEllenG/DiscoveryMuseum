package com.example.troygbv.discoverymuseum.Games;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.Exhibits.SuperService;
import com.example.troygbv.discoverymuseum.R;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuperServiceGame extends AppCompatActivity {

    TextView tv_info, tv_word;

    ImageView picture;

    EditText et_guess;

    Button b_check, b_new;

    Random r;

    String currentWord;

    int currentPic;

    int counter = 0;

    String[] dictionary = {
            "hood",
            "muffler",
            "mirror",
            "headlight",
            "radiator",
            "door",
            "bumper",
            "window",
            "trunk",
            "wheel",
            "tire"
    };

    int[] images = {
            R.drawable.hood,
            R.drawable.muffler,
            R.drawable.mirror,
            R.drawable.headlight,
            R.drawable.radiator,
            R.drawable.door,
            R.drawable.bumper,
            R.drawable.window,
            R.drawable.trunk,
            R.drawable.wheel,
            R.drawable.tire
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_service_game);
        setTitle("Car Part Scramble");

        tv_info = (TextView) findViewById(R.id.tv_info);
        tv_word = (TextView) findViewById(R.id.tv_word);

        et_guess = (EditText) findViewById(R.id.et_guess);

        et_guess.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        picture = (ImageView) findViewById(R.id.picture);

        b_check = (Button) findViewById(R.id.b_check);
        b_new = (Button) findViewById(R.id.b_new);

        r = new Random();

       /** Resources res = getResources();
        dictionary = res.getStringArray(R.array.carParts);
        ((TextView) findViewById(R.id.tv_word)).setText(dictionary[counter]);
*/

        newGame();

        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(et_guess.getText().toString().equalsIgnoreCase(dictionary[counter])) {
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

    //method to hide keyboard
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }


    //shuffle word method
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

    //    currentWord = dictionary[r.nextInt(dictionary.length)];

       // currentPic = images[r.nextInt(images.length)];



        counter++;
        if (counter >= dictionary.length)
            counter = 0;
        tv_word.setText(shuffleWord(dictionary [counter]));

        if (counter >= images.length)
            counter =0;
        picture.setImageResource(images[counter]);

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
