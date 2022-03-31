package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView textViewName = findViewById(R.id.textViewNameInfo);
        TextView textViewSurname = findViewById(R.id.textViewSurnameInfo);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");
        textViewName.setText(name);
        textViewSurname.setText(surname);
    }
}