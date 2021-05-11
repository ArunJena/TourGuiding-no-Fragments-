package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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