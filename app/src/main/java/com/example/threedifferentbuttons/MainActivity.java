package com.example.threedifferentbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
                Intent intent = new Intent(MainActivity.this, ShowIntentActivity.class);
                intent.putExtra("int", 10);
                intent.putExtra("double", 5.5);
                intent.putExtra("boolean", true);
                startActivity(intent);
            }
        });

        Button buttonTask = findViewById(R.id.buttonTask);
        buttonTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TaskActivity .class);
                startActivity(intent);
            }
        });

        Button buttonIntentToWebPage = findViewById(R.id.buttonIntentToWebPage);
        buttonIntentToWebPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addres = Uri.parse("https://www.ufc.com");
                Intent openSite = new Intent(Intent.ACTION_VIEW, addres);

                if(openSite.resolveActivity(getPackageManager()) !=null){
                    startActivity(openSite);
                }
                else{
                    Log.d("Intent", "Can't using this site");
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}