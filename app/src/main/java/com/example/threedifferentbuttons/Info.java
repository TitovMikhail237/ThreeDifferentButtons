package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Info extends AppCompatActivity {

    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        TextView textViewName = findViewById(R.id.textViewNameInfo);
        TextView textViewSurname = findViewById(R.id.textViewSurnameInfo);
        TextView textViewAge = findViewById(R.id.textViewAgeInfo);


        Intent intent = getIntent();
        User user = (User)intent.getSerializableExtra("newUser");
        textViewName.setText(user.getName());
        textViewSurname.setText(user.getSurname());
        textViewAge.setText(Integer.toString(user.getAge()));


    }
}