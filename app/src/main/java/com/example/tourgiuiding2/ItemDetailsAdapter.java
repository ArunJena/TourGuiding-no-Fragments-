package com.example.tourgiuiding2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemDetailsAdapter extends ArrayAdapter {

    public ItemDetailsAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    //listview will call this methode to collect indivisual item from arrayadapter
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.each_item, parent, false);
        }
        //Insted of normal item we need to return customized item from getView methode

        //Get the item
        EachItem eachItem = (EachItem) getItem(position);
        //Now we have ith element of the list

        //Place each element at correct fields before returning
        TextView textView = (TextView)listItemView.findViewById(R.id.each_item_tv);
        textView.setText(eachItem.getName());
        if(0!= eachItem.getImg_rcs()) {
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_view);
            imageView.setImageResource(eachItem.getImg_rcs());
        }

        return listItemView;
    }
}
