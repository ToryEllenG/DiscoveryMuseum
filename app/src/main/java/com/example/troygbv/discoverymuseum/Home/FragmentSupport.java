package com.example.troygbv.discoverymuseum.Home;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.troygbv.discoverymuseum.R;

public class FragmentSupport extends AppCompatActivity {

    ImageButton donate, mail;
    Button support;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_support);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        donate = (ImageButton)findViewById(R.id.donateButton);
        mail = (ImageButton)findViewById(R.id.mailingList);

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iexploremore.wufoo.com/forms/qqhpinm1rhznek/"));
                startActivity(browserIntent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://visitor.r20.constantcontact.com/manage/optin?v=001j9jAEm-uzFgNvBCePEqs4-Hn6UK8gkPTuue_9rfIPU84CmsE0QYRCqm1uUUkrSj4UWS_UcqehcryCxxzx6gN1SK9OlV3HDvpQL2YMwPnXib6JvljevJkDGLzFOkcTo6yfXCfZLrwTJbNflxZQz4eC-qaPXiaO-18TJ4Z4zvD2gHouP-IX7vshA%3D%3D"));
                startActivity(browserIntent);
            }
        });
        support = (Button)findViewById(R.id.supportBT);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iexploremore.com/sponsor-donate/"));
                startActivity(browserIntent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
