package com.example.recipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondMainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main_screen);
    }

    public void clickToVisitDhoklaRecipe(View view){
        Intent i = new Intent(this, dhoklaScreen.class); // creates the instance of Intent and says this activity is to launch
        startActivity(i);  // It launches the activity
    }

    public void clickToVisitMomosRecipe(View view){
        Intent i = new Intent(this, MomosScreen.class);
        startActivity(i);
    }

    public void clickToVisitAlooTikki(View view){
        Intent i = new Intent(this, AlooTikkiScreen.class);
        startActivity(i);
    }

    public void clickToVisitCutlet(View view){
        Intent i = new Intent(this, CutletScreen.class);
        startActivity(i);
    }
}
