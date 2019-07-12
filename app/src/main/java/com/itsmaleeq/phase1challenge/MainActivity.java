package com.itsmaleeq.phase1challenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.openprofile);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }

    private void openProfile() {
        Intent profileintent = new Intent(this, Profile.class);
        startActivity(profileintent);
    }


    public void openWebpage(View view) {
        Intent alcintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
        startActivity(alcintent);

    }

}
