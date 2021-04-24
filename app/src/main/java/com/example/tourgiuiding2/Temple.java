package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Temple extends AppCompatActivity {

    EachItem e ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrayadapter_list);

//        ArrayList<String> listItem = new ArrayList<>();
//        listItem.add("A");
//        listItem.add("B");
//        listItem.add("C");
//        listItem.add("D");
//        listItem.add("E");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listItem);
//        ListView listView = (ListView)findViewById(R.id.list);
//        listView.setAdapter(arrayAdapter);

        ArrayList<EachItem> arrayList = new ArrayList<EachItem>();
        arrayList.add(new EachItem(R.drawable.jagannath,"Jagannnath Temple"));
        arrayList.add(new EachItem(R.drawable.lingaraaj,"Lingaraj Temple"));
        arrayList.add(new EachItem(R.drawable.suntemple,"Sun Temple"));
        arrayList.add(new EachItem(R.drawable.mukteswar,"Mukteswar Temple"));
        arrayList.add(new EachItem(R.drawable.nilamadhab_kantilo,"Nilamadhab Temple"));

        CustoumAdapter custoumAdapter = new CustoumAdapter(this,arrayList);
        ListView listView  = (ListView)findViewById(R.id.list);
        listView.setAdapter(custoumAdapter);

    }
}