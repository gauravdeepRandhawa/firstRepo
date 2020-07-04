package com.example.recipeapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ImageView;

public class BottomFragment extends Fragment{
    //private static TextView quickRecipeText;
     TextView vegText;
     TextView nonVegText;
     ImageView vegImage;
     ImageView nonVegImage;


   // private static TextView nonVegText;

//TopSectionListener activityComander;
//
//    public interface TopSectionListener{
//        public void createMeme(String topSearch);
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try{
//            activityComander = (TopSectionListener) context;
//        }catch(ClassCastException e){
//            throw new ClassCastException(context.toString());
//        }
//    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);

//        quickRecipeText = (TextView) view.findViewById(R.id.quickRecipeText);
        vegText = (TextView) view.findViewById(R.id.vegText);
        nonVegText = (TextView) view.findViewById(R.id.nonVegText);
        vegImage = (ImageView) view.findViewById(R.id.vegImageView);
        nonVegImage = (ImageView) view.findViewById(R.id.nonVegImageView);
//        nonVegText = (TextView) view.findViewById(R.id.nonVegText);
        vegText.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        clickToVisitVeg(v);
                    }
                }
        );
        vegImage.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        clickToVisitVeg(v);
                    }
                }
        );
        nonVegText.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        clickToVisitNonVeg(v);
                    }
                }
        );
        nonVegImage.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        clickToVisitNonVeg(v);
                    }
                }
        );



        return view;
    }

    public void clickToVisitVeg(View view){
        Intent i = new Intent(getActivity(), VegetarianDishScreen.class); // creates the instance of Intent and says this activity is to launch
        startActivity(i);

    }

    public void clickToVisitNonVeg(View view){
        Intent in = new Intent(getActivity(), NonVegDishScreen.class); // creates the instance of Intent and says this activity is to launch
        startActivity(in);

    }

}
