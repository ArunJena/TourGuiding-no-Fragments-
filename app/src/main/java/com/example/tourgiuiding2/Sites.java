package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                EachItem eachItem = arrayList.get(position);
                Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                // intent.putExtra("Temple", (Parcelable) eachItem);
                intent.putExtra("EachItem",eachItem);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"onclickListener works",Toast.LENGTH_SHORT).show();

            }
        });

    }
}