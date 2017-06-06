package com.example.troygbv.discoverymuseum.Games;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.troygbv.discoverymuseum.R;

public class ArtSmartGame extends AppCompatActivity {

    private CanvasView canvasView;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_smart_game);
        setTitle("Let's Draw!");

        clear = (Button) findViewById(R.id.clearBT);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearCanvas(v);
            }
        });

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        canvasView = (CanvasView)findViewById(R.id.canvas);
    }

    public void clearCanvas(View v) {
        canvasView.clearCanvas();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
