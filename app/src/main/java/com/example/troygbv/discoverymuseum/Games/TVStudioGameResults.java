package com.example.troygbv.discoverymuseum.Games;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.troygbv.discoverymuseum.R;

public class TVStudioGameResults extends AppCompatActivity {

    TextView wordOneResult, wordTwoResult, wordThreeResult, wordFourResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvstudio_game_results);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        wordOneResult = (TextView) findViewById(R.id.wordOneResult);
        wordTwoResult = (TextView) findViewById(R.id.wordTwoResult);
        wordThreeResult = (TextView) findViewById(R.id.wordThreeResult);
        wordFourResult = (TextView) findViewById(R.id.wordFourResult);

        wordOneResult.setText(getIntent().getExtras().getString("firstWord"));
        wordTwoResult.setText(getIntent().getExtras().getString("secondWord"));
        wordThreeResult.setText(getIntent().getExtras().getString("thirdWord"));
        wordFourResult.setText(getIntent().getExtras().getString("fourthWord"));

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
