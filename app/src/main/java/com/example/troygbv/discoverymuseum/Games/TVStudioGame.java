package com.example.troygbv.discoverymuseum.Games;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.troygbv.discoverymuseum.Exhibits.TVStudio;
import com.example.troygbv.discoverymuseum.R;

public class TVStudioGame extends AppCompatActivity {

    EditText word1, word2, word3, word4;

    Button results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvstudio_game);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        results = (Button) findViewById(R.id.results);

        word1 = (EditText)findViewById(R.id.wordOne);
        word1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word2 = (EditText)findViewById(R.id.wordTwo);
        word2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });
        word3 = (EditText)findViewById(R.id.wordThree);
        word3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });
        word4 = (EditText)findViewById(R.id.wordFour);
        word4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TVStudioGame.this, TVStudioGameResults.class);
                Bundle wordChoices = new Bundle();
                wordChoices.putString("firstWord", word1.getText().toString());
                wordChoices.putString("secondWord", word2.getText().toString());
                wordChoices.putString("thirdWord", word3.getText().toString());
                wordChoices.putString("fourthWord", word4.getText().toString());
                i.putExtras(wordChoices);
                startActivity(i);
            }
        });
    }

    //method to hide keyboard
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
