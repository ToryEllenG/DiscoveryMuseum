package com.example.troygbv.discoverymuseum.Home;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.troygbv.discoverymuseum.R;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = (ProgressBar)findViewById(R.id.pBar);
        //Set color manually
        progressBar.setProgressTintList(ColorStateList.valueOf(Color.BLACK));
        progressBar.setVisibility(progressBar.VISIBLE);

        try {
            InputStream inputStream = getAssets().open("splash.gif"); //put splash gif here later
            byte[] bytes = IOUtils.toByteArray(inputStream);
 //           gifImageView.setBytes(bytes);
   //         gifImageView.startAnimation();
        }
        catch (IOException ex) {

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        },1500); //2 second delay
    }
}
