package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrayadapter_list);

        ArrayList<EachItem> arrayList = new ArrayList<EachItem>();
        arrayList.add(new EachItem(R.drawable.empires_hotel,"Empires: Puri"));
        arrayList.add(new EachItem(R.drawable.mayfair_bbsr,"MayFair: Bhubaneswar"));
        arrayList.add(new EachItem(R.drawable.puri_resort,"Resort: Puri"));
        arrayList.add(new EachItem(R.drawable.shakti_hotel,"Shakti Hotel"));
        arrayList.add(new EachItem(R.drawable.trident_bbsr,"Trident Hotel"));

        CustoumAdapter custoumAdapter = new CustoumAdapter(this,arrayList);
        ListView listView  = (ListView)findViewById(R.id.list);
        listView.setAdapter(custoumAdapter);
    }
}