package com.example.threedifferentbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        EditText editText = findViewById(R.id.editTextInfo);
        EditText editText2 = findViewById(R.id.editTextInfo2);
        Button buttonInfo = findViewById(R.id.buttonInfoActivityMain);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Info.class);
                intent.putExtra("name",editText.getText().toString());
                intent.putExtra("surname", editText2.getText().toString());
                startActivity(intent);
            }
        });
    }
}