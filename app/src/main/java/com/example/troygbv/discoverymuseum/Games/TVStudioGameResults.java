package com.example.troygbv.discoverymuseum.Games;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.troygbv.discoverymuseum.R;

public class TVStudioGameResults extends AppCompatActivity {

    TextView wordOneResult,
            wordTwoResult,
            wordThreeResult,
            wordFourResult,
            wordFiveResult,
            wordSixResult,
            wordSevenResult,
            wordEightResult,
            wordNineResult,
            wordTenResult,
            wordElevenResult,
            wordTwelveResult,
            wordThirteenResult,
            wordFourteenResult,
            wordFifteenResult,
            weatherTitle;

    Button playAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvstudio_game_results);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        weatherTitle = (TextView) findViewById(R.id.weatherTitle);
        weatherTitle.setPaintFlags(weatherTitle.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        wordOneResult = (TextView) findViewById(R.id.wordOneResult);
        wordTwoResult = (TextView) findViewById(R.id.wordTwoResult);
        wordThreeResult = (TextView) findViewById(R.id.wordThreeResult);
        wordFourResult = (TextView) findViewById(R.id.wordFourResult);
        wordFiveResult = (TextView) findViewById(R.id.wordFiveResult);
        wordSixResult = (TextView) findViewById(R.id.wordSixResult);
        wordSevenResult = (TextView) findViewById(R.id.wordSevenResult);
        wordEightResult = (TextView) findViewById(R.id.wordEightResult);
        wordNineResult = (TextView) findViewById(R.id.wordNineResult);
        wordTenResult = (TextView) findViewById(R.id.wordTenResult);
        wordElevenResult = (TextView) findViewById(R.id.wordElevenResult);
        wordTwelveResult = (TextView) findViewById(R.id.wordTwelveResult);
        wordThirteenResult = (TextView) findViewById(R.id.wordThirteenResult);
        wordFourteenResult = (TextView) findViewById(R.id.wordFourteenResult);
        wordFifteenResult = (TextView) findViewById(R.id.wordFifteenResult);

        wordOneResult.setText(getIntent().getExtras().getString("firstWord") + "!");
        wordTwoResult.setText(getIntent().getExtras().getString("secondWord"));
        wordThreeResult.setText(getIntent().getExtras().getString("thirdWord"));
        wordFourResult.setText(getIntent().getExtras().getString("fourthWord"));
        wordFiveResult.setText(getIntent().getExtras().getString("fifthWord"));
        wordSixResult.setText(getIntent().getExtras().getString("sixthWord"));
        wordSevenResult.setText(getIntent().getExtras().getString("seventhWord"));
        wordEightResult.setText(getIntent().getExtras().getString("eighthWord"));
        wordNineResult.setText(getIntent().getExtras().getString("ninthWord"));
        wordTenResult.setText(getIntent().getExtras().getString("tenthWord"));
        wordElevenResult.setText(getIntent().getExtras().getString("eleventhWord"));
        wordTwelveResult.setText(getIntent().getExtras().getString("twelfthWord"));
        wordThirteenResult.setText(getIntent().getExtras().getString("thirteenthWord"));
        wordFourteenResult.setText(getIntent().getExtras().getString("fourteenthWord"));
        wordFifteenResult.setText(getIntent().getExtras().getString("fifteenthWord"));

        playAgain = (Button)findViewById(R.id.playAgain);
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(TVStudioGameResults.this, TVStudioGame.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
