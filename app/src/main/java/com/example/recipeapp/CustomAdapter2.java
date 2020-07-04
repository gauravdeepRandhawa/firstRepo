package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter2 extends ArrayAdapter<String> {

    private String[] nonVegDishName;
    private Integer[] nonVegImgID;

    public CustomAdapter2(Context context, String[] nonVegDishes, Integer[] nonvegimgid) {
        super(context, R.layout.custom_list2, nonVegDishes);
        this.nonVegDishName = nonVegDishes;
        this.nonVegImgID = nonvegimgid;
    }

    //This method sets the layout of passes strings or list.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            r = layoutInflater.inflate(R.layout.custom_list2, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.imgv.setImageResource(nonVegImgID[position]);
        viewHolder.textv1.setText(nonVegDishName[position]);
        return r;
//        LayoutInflater gsInflater = LayoutInflater.from(getContext());
//        View customView = gsInflater.inflate(R.layout.custom_list, parent, false);
//
//        // creates the refrence to list of fruits, textview, and the image.
//        String singleVegItem = getItem(position);
//        TextView itemView = (TextView) customView.findViewById(R.id.listItemView);
//        ImageView dishImage = (ImageView) customView.findViewById(R.id.dishImage);
//
//        //sets the value to textView, image and returns the custom view.
//        itemView.setText(singleVegItem);
//        dishImage.setImageResource(R.drawable.image);
//        return customView;
    }

    class ViewHolder {
        TextView textv1;
        ImageView imgv;

        ViewHolder(View v) {
            textv1 = v.findViewById(R.id.listItemView);
            imgv = v.findViewById(R.id.dishImage);
        }
    }
}


