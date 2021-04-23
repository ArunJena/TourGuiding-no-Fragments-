package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Jagannath Temple");
        stringList.add("Lingaraaj Temple");
        stringList.add("Sun Temple");
        stringList.add("Krishna Temple");

        ArrayAdapter itemAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,stringList);
        ListView listView = findViewById(R.id.list2);
        listView.setAdapter(itemAdapter);
    }
    public void intentTemple(View v){
        Intent intent = new Intent(getApplicationContext(),Temple.class);
        startActivity(intent);
    }
    public void intentHotel(View v){
        Intent intent = new Intent(getApplicationContext(),Hotel.class);
        startActivity(intent);
    }
    public void intentSites(View v){
        Intent intent = new Intent(getApplicationContext(),Sites.class);
        startActivity(intent);
    }
}