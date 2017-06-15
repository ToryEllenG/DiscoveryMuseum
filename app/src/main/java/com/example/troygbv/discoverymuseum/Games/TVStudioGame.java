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
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.Exhibits.TVStudio;
import com.example.troygbv.discoverymuseum.R;

public class TVStudioGame extends AppCompatActivity {

    EditText word1, word2, word3, word4, word5, word6, word7, word8, word9, word10, word11, word12, word13, word14, word15;

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

        word5 = (EditText)findViewById(R.id.wordFive);
        word5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                                           @Override
                                           public void onFocusChange(View view, boolean hasFocus) {
                                               if (!hasFocus) {
                                                   hideKeyboard(view);
                                               }
                                           }
                                       });

        word6 = (EditText)findViewById(R.id.wordSix);
        word6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word7 = (EditText)findViewById(R.id.wordSeven);
        word7.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word8 = (EditText)findViewById(R.id.wordEight);
        word8.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word9 = (EditText)findViewById(R.id.wordNine);
        word9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word10= (EditText)findViewById(R.id.wordTen);
        word10.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word11= (EditText)findViewById(R.id.wordEleven);
        word11.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word12= (EditText)findViewById(R.id.wordTwelve);
        word12.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word13= (EditText)findViewById(R.id.wordThirteen);
        word13.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word14= (EditText)findViewById(R.id.wordFourteen);
        word14.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        word15= (EditText)findViewById(R.id.wordFifteen);
        word15.setOnFocusChangeListener(new View.OnFocusChangeListener() {
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

                final String word1string = word1.getText().toString();
                final String word2string = word2.getText().toString();
                final String word3string = word3.getText().toString();
                final String word4string = word4.getText().toString();
                final String word5string = word5.getText().toString();
                final String word6string = word6.getText().toString();
                final String word7string = word7.getText().toString();
                final String word8string = word8.getText().toString();
                final String word9string = word9.getText().toString();
                final String word10string = word10.getText().toString();
                final String word11string = word11.getText().toString();
                final String word12string = word12.getText().toString();
                final String word13string = word13.getText().toString();
                final String word14string = word14.getText().toString();
                final String word15string = word15.getText().toString();

                wordChoices.putString("firstWord", word1string);
                wordChoices.putString("secondWord", word2string);
                wordChoices.putString("thirdWord", word3string);
                wordChoices.putString("fourthWord", word4string);
                wordChoices.putString("fifthWord", word5string);
                wordChoices.putString("sixthWord", word6string);
                wordChoices.putString("seventhWord", word7string);
                wordChoices.putString("eighthWord", word8string);
                wordChoices.putString("ninthWord", word9string);
                wordChoices.putString("tenthWord", word10string);
                wordChoices.putString("eleventhWord", word11string);
                wordChoices.putString("twelfthWord", word12string);
                wordChoices.putString("thirteenthWord", word13string);
                wordChoices.putString("fourteenthWord", word14string);
                wordChoices.putString("fifteenthWord", word15string);
                i.putExtras(wordChoices);

                if(word1string.isEmpty() || word2string.isEmpty() || word3string.isEmpty() || word4string.isEmpty() || word5string.isEmpty() || word6string.isEmpty() || word7string.isEmpty() || word8string.isEmpty() || word9string.isEmpty() || word10string.isEmpty() || word11string.isEmpty() || word12string.isEmpty() || word13string.isEmpty() || word14string.isEmpty() || word15string.isEmpty()) {
                    Toast.makeText(TVStudioGame.this, "You didn't fill in all of the words!", Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(i);
                }
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

    @Override
    protected void onResume() {
        super.onResume();
        word1.setText("");
        word2.setText("");
        word3.setText("");
        word4.setText("");
        word5.setText("");
        word6.setText("");
        word7.setText("");
        word8.setText("");
        word9.setText("");
        word10.setText("");
        word11.setText("");
        word12.setText("");
        word13.setText("");
        word14.setText("");
        word15.setText("");
    }
}
