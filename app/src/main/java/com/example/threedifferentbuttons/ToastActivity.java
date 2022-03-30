package com.example.threedifferentbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        EditText editTextToast = (EditText)findViewById(R.id.editTextToast);
        Button buttonToastActivityToast = (Button) findViewById(R.id.buttonToastActivityToast);
        buttonToastActivityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(editTextToast.length()<=3) {

                    editTextToast.setError("Too short Toast");
                }
                else{
                    Toast.makeText(getApplicationContext(), editTextToast.getText().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}