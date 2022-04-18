package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class AddInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_information);


        EditText nameText = findViewById(R.id.editTextInfo);
        EditText surnameText = findViewById(R.id.editTextInfo2);
        EditText ageText = findViewById(R.id.editTextInfo3);

        Button buttonAddActivity = findViewById(R.id.buttonAddActivity);

        buttonAddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = nameText.getText().toString();
                String surname = surnameText.getText().toString();
                int age = Integer.parseInt(ageText.getText().toString());

                User user = new User(name, surname, age);

                Intent intent = new Intent(AddInformation.this, Info.class);
                intent.putExtra("newUser", user);
                startActivity(intent);
            }
        });
    }
}


