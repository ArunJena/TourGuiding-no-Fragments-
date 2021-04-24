package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Sites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrayadapter_list);

        ArrayList<EachItem> arrayList = new ArrayList<EachItem>();
        arrayList.add(new EachItem(R.drawable.puri_beach,"Sea Beach"));
        arrayList.add(new EachItem(R.drawable.sanaghagara_waterfall,"Waterfall"));
        arrayList.add(new EachItem(R.drawable.zoo_nandankanan,"Nandankanan Zoo"));
      //  arrayList.add(new EachItem(R.drawable.mukteswar,"Mukteswar Temple"));

        CustoumAdapter custoumAdapter = new CustoumAdapter(this,arrayList);
        ListView listView  = (ListView)findViewById(R.id.list);
        listView.setAdapter(custoumAdapter);
    }
}