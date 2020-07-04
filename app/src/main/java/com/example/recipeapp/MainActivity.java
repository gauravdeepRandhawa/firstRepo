package com.example.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToVisitNext(View view){
        Intent i = new Intent(this, SecondMainScreen.class); // creates the instance of Intent and says this activity is to launch
        startActivity(i);  // It launches the activity
    }
}
