package com.example.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.ListView;
import android.widget.Toast;


public class VegetarianDishScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetarian_dish_screen);

        //list of items
       String[] vegDishes = {"Starters", "Pasta", "Curries", "Prantha", "Smoothies", "Dosa", "Briyani", "Indo-Chinese", "Snacks"};
       //list of images
       Integer[] imgid = {R.drawable.starter, R.drawable.pasta, R.drawable.curries, R.drawable.prantha, R.drawable.smoothies, R.drawable.dosa, R.drawable.briyani, R.drawable.indohinese, R.drawable.snacks};

         ListView vegListView = (ListView) findViewById(R.id.vegList);
         CustomAdapter customAdapter = new CustomAdapter(this, vegDishes, imgid);
         vegListView.setAdapter(customAdapter); //convert the fruits array into list view

         vegListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //When click on the item of a list it will convert item to a string by taking its position.
                        String vegDish = String.valueOf(parent.getItemAtPosition(position));
                        if(position == 0){
                            clickToVisitStarter(view);
                        }
                        Toast.makeText(VegetarianDishScreen.this, vegDish, Toast.LENGTH_LONG).show();
                    }
                }
         );
    }

    public void clickToVisitStarter(View view){
        Intent i = new Intent(this, StartersScreen.class); // creates the instance of Intent and says this activity is to launch
        startActivity(i);  // It launches the activity
    }
}
