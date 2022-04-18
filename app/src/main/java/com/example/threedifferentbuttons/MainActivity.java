package com.example.threedifferentbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToast = findViewById(R.id.buttonToastActivityMain);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });

        Button buttonRecyclerView = findViewById(R.id.buttonRecyclerViewActivityMain);
        buttonRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThreeDifferentButtonsRecyclerView.class);
                startActivity(intent);
            }
        });

        Button buttonRegistration = findViewById(R.id.buttonRegistration);
        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddInformation.class);
                startActivity(intent);
            }
        });

        Button buttonIntent = findViewById(R.id.buttonIntent);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(intent);
            }
        });


    }
}