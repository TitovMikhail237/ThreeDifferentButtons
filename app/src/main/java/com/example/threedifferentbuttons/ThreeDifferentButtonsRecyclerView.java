package com.example.threedifferentbuttons;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ThreeDifferentButtonsRecyclerView extends AppCompatActivity {

    private final List<String> recyclerViewList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_different_buttons_recycler_view);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        addListItem();


        ThreeDifferentButtonsAdapter threeDifferentButtonsAdapter = new ThreeDifferentButtonsAdapter(recyclerViewList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(threeDifferentButtonsAdapter);
    }

    private void addListItem(){
        recyclerViewList.add("Anderson Silva");
        recyclerViewList.add("George St Pierre");
        recyclerViewList.add("Jon Jones");
        recyclerViewList.add("BJ Penn");
        recyclerViewList.add("Donald Cerrone");
        recyclerViewList.add("Carlos Condit");
        recyclerViewList.add("Tony Ferguson");
        recyclerViewList.add("Nate Diaz");
        recyclerViewList.add("Nick Diaz");
        recyclerViewList.add("Dustin Porier");
        recyclerViewList.add("Rashad Evans");
        recyclerViewList.add("Shogun Rua");
        recyclerViewList.add("Lyoto Machida");
        recyclerViewList.add("Cain Velasques");
        recyclerViewList.add("Edson Barbosa");
        recyclerViewList.add("Diego Sanchez");
        recyclerViewList.add("Conor McGregor");
        recyclerViewList.add("Dan Henderson");
    }
}