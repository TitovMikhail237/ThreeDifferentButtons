package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView textViewName = findViewById(R.id.textViewNameInfo);
        TextView textViewSurname = findViewById(R.id.textViewSurnameInfo);
        Intent intent = getIntent();
        String name = intent.getStringExtra(NAME);
        String surname = intent.getStringExtra(SURNAME);
        textViewName.setText(name);
        textViewSurname.setText(surname);
    }
}