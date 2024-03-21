package com.example.thegroceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList;

    MyAdapter  myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.Recycle);

        itemList = new ArrayList<>();
        Item item1 =new Item(R.drawable.fruit,"Fruits:","Fresh from the Garden");
        Item item2 = new Item(R.drawable.vegitables,"Vegetables:","Leafy Veggies");
        Item item3 = new Item(R.drawable.bread, "Bread:", "Fresh Bread");
        Item item4 = new Item(R.drawable.beverage,"Beverage:","Cold Drinks,Coffee");
        Item item5 = new Item(R.drawable.milk,"Milk:", "Fresh Cow Buffalo Milk");
        Item item6 =  new Item(R.drawable.popcorn,"Snacks:","Spicy & Cheese PopCorn");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

    }
}