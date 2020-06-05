package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    private List<Dataitem> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        items=new ArrayList<>();

        items.add(new Dataitem("Exercise 1","Tricep Pushdown","10 Repetion",R.drawable.img));
        items.add(new Dataitem("Exercise 2","Seated Bicep Curl","15 Repetion",R.drawable.img1));
        items.add(new Dataitem("Exercise 3","Tricep","11 Repetion",R.drawable.img));
        items.add(new Dataitem("Exercise 4","Seated Bicep Curl","15 Repetion",R.drawable.img1));
        items.add(new Dataitem("Exercise 5","Tricep Pushdown","12 Repetion",R.drawable.img1));
        items.add(new Dataitem("Exercise 6","Tricep Pushdown","15 Repetion",R.drawable.img));
        items.add(new Dataitem("Exercise 7","Seated Bicep Curl","10 Repetion",R.drawable.img1));
        items.add(new Dataitem("Exercise 8","Tricep","15 Repetion",R.drawable.img));
        items.add(new Dataitem("Exercise 9","Tricep Pushdown","15 Repetion",R.drawable.img1));
        items.add(new Dataitem("Exercise 10","Seated Bicep Curl","12 Repetion",R.drawable.img));
        items.add(new Dataitem("Exercise 11","Tricep","15 Repetion",R.drawable.img1));
        ItemAdapter itemAdapter=new ItemAdapter(this,items);
        recyclerView.setAdapter(itemAdapter);



    }
}