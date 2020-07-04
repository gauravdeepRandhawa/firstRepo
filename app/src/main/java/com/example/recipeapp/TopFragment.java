package com.example.recipeapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

public class TopFragment extends Fragment{

    private static SearchView searchView;

    TopSectionListener activityComander;

    public interface TopSectionListener{
        public void createMeme(String topSearch);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityComander = (TopSectionListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        searchView = (SearchView) view.findViewById(R.id.searchView);

        return view;
    }


}
