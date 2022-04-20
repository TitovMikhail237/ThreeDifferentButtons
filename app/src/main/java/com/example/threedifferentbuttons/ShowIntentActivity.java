package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class ShowIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_intent2);

        TextView intView = findViewById(R.id.textViewIntShow);
        TextView doubleView = findViewById(R.id.textViewDoubleShow);
        TextView booleanView = findViewById(R.id.textViewBooleanShow);


        Intent intent = getIntent();
        int intValue = intent.getIntExtra("int", 0);
        intView.setText(Integer.toString(intValue));

        double doubleValue = intent.getDoubleExtra("double", 0);
        doubleView.setText(Double.toString(doubleValue));

        boolean booleanValue = intent.getBooleanExtra("boolean", false);
        booleanView.setText(Boolean.toString(booleanValue));

    }
}