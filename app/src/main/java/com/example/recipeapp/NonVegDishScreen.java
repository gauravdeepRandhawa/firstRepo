package com.example.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NonVegDishScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg_dish_screen);

        String[] nonVegDishes = {"Chicken", "Lamb", "Beef", "Duck", "Pork", "Fish"};
        Integer[] imgid = {R.drawable.chicken, R.drawable.lamb, R.drawable.beef, R.drawable.duck, R.drawable.pork, R.drawable.fishes};

        ListView nonVegListView = (ListView) findViewById(R.id.nonVegList);
        //vegListView.setAdapter(gsAdapter); //convert the fruits array into list view
        CustomAdapter2 customAdapter = new CustomAdapter2(this, nonVegDishes, imgid);
        nonVegListView.setAdapter(customAdapter);

        nonVegListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //When click on the item of a list it will convert item to a string by taking its position.
                        String nonVegDish = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(NonVegDishScreen.this, nonVegDish, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
