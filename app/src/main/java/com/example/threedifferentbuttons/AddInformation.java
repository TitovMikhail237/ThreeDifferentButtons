package com.example.threedifferentbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddInformation extends AppCompatActivity {

    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    //private static final int AGE =


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_information);

        EditText editText = findViewById(R.id.editTextInfo);
        EditText editText2 = findViewById(R.id.editTextInfo2);
      //  EditText editText3 = findViewById(R.id.editTextInfo3);
        Button buttonAddActivity = findViewById(R.id.buttonAddActivity);
        buttonAddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddInformation.this, Info.class);
                intent.putExtra(NAME,editText.getText().toString());
                intent.putExtra(SURNAME, editText2.getText().toString());
                startActivity(intent);
            }
        });
    }
}