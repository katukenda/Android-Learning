package com.example.myrecycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item( "janitha", "janitha@gmail.com",R.drawable.a ));
        items.add(new Item( "prashad", "prashd@gmail.com",R.drawable.b ));
        items.add(new Item( "katukenda", "katukenda@gmail.com",R.drawable.c ));
        items.add(new Item( "ruwan", "ruwan@gmail.com",R.drawable.d ));
        items.add(new Item( "chathura", "chathura@gmail.com",R.drawable.e ));
        items.add(new Item( "sasindu", "sasindu@gmail.com",R.drawable.f ));
        items.add(new Item( "viraj", "viraj@gmail.com",R.drawable.g ));
        items.add(new Item( "prashad", "prashd@gmail.com",R.drawable.b ));
        items.add(new Item( "katukenda", "katukenda@gmail.com",R.drawable.c ));
        items.add(new Item( "ruwan", "ruwan@gmail.com",R.drawable.d ));
        items.add(new Item( "chathura", "chathura@gmail.com",R.drawable.e ));
        items.add(new Item( "sasindu", "sasindu@gmail.com",R.drawable.f ));
        items.add(new Item( "ranaweera", "ranaweera@gmail.com",R.drawable.h ));
        items.add(new Item( "prashad", "prashd@gmail.com",R.drawable.b ));
        items.add(new Item( "katukenda", "katukenda@gmail.com",R.drawable.c ));
        items.add(new Item( "ruwan", "ruwan@gmail.com",R.drawable.d ));
        items.add(new Item( "chathura", "chathura@gmail.com",R.drawable.e ));
        items.add(new Item( "sasindu", "sasindu@gmail.com",R.drawable.f ));

        recyclerView.setLayoutManager((new LinearLayoutManager (this)));
        recyclerView.setAdapter((new MyAdapter(getApplicationContext(), items)));
    }
}