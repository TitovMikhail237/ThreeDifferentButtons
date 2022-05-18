package com.example.threedifferentbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentSomeSites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_some_sites);


        Button buttonMLB = findViewById(R.id.buttonMLB);
        buttonMLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addresMLB = Uri.parse("https://www.mlb.com");
                Intent openMLB = new Intent(Intent.ACTION_VIEW, addresMLB);
                startActivity(openMLB);
            }
        });

        Button buttonNBA = findViewById(R.id.buttonNBA);
        buttonNBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addresNBA = Uri.parse("https://www.nba.com");
                Intent openNBA = new Intent(Intent.ACTION_VIEW, addresNBA);
                startActivity(openNBA);
            }
        });

        Button buttonNFL = findViewById(R.id.buttonNFL);
        buttonNFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addresNFL = Uri.parse("https://www.nfl.com");
                Intent openNFL = new Intent(Intent.ACTION_VIEW, addresNFL);
                startActivity(openNFL);
            }
        });

        Button buttonNHL = findViewById(R.id.buttonNHL);
        buttonNHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addresNHL = Uri.parse("https://www.nhl.com ");
                Intent openNHL = new Intent(Intent.ACTION_VIEW, addresNHL);
                startActivity(openNHL);
            }
        });
    }
}