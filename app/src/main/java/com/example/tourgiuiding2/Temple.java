package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

        //Provide details of each item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //List contain one item
                //Fit the item details in a list
                //Set appropriate adapter for the list
                //Set adapter for the list
                ArrayList<EachItem> oneItem= new ArrayList<EachItem>();
                oneItem.add(arrayList.get(position));

//                ItemDetailsAdapter itemDetailsAdapter = new ItemDetailsAdapter(getApplicationContext(),oneItem);
//                ListView listView1 = (ListView)findViewById(R.id.list);
//                listView.setAdapter(itemDetailsAdapter);

                CustoumAdapter custoumAdapter = new CustoumAdapter(getApplicationContext(),arrayList);
                ListView listView  = (ListView)findViewById(R.id.list);
                listView.setAdapter(custoumAdapter);
                setContentView(R.layout.arrayadapter_list);

                Toast.makeText(getApplicationContext(),"onclickListener works",Toast.LENGTH_SHORT).show();

            }
        });

    }
}