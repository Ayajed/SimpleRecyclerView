package com.example.simplerecyclerview;

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
        items.add(new Item("John Wick", "babayaga@email.com", R.drawable.a));
        items.add(new Item("Yor Briar", "thornprincess@email.com", R.drawable.b));
        items.add(new Item("Eleanor Leywin", "ellie@email.com", R.drawable.c));
        items.add(new Item("Michael Angelo", "orangeturtle@email.com", R.drawable.d));
        items.add(new Item("Gwen Tennyson", "tennysong@email.com", R.drawable.e));
        items.add(new Item("Franklin File", "messengerf@email.com", R.drawable.f));
        items.add(new Item("Jack Sparrow", "blackpearl@email.com", R.drawable.g));
        items.add(new Item("Dracula Tepes", "theimpaler@email.com", R.drawable.h));
        items.add(new Item("John Wick", "babayaga@email.com", R.drawable.a));
        items.add(new Item("Yor Briar", "thornprincess@email.com", R.drawable.b));
        items.add(new Item("Eleanor Leywin", "ellie@email.com", R.drawable.c));
        items.add(new Item("Michael Angelo", "orangeturtle@email.com", R.drawable.d));
        items.add(new Item("Gwen Tennyson", "tennysong@email.com", R.drawable.e));
        items.add(new Item("Franklin File", "messengerf@email.com", R.drawable.f));
        items.add(new Item("Jack Sparrow", "blackpearl@email.com", R.drawable.g));
        items.add(new Item("Dracula Tepes", "theimpaler@email.com", R.drawable.h));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}