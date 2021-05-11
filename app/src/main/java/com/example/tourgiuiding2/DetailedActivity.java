package com.example.tourgiuiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        if(getIntent().hasExtra("EachItem")){
            EachItem eachItem = getIntent().getParcelableExtra("EachItem");
            TextView detailed_name = (TextView)findViewById(R.id.detailed_name);
            detailed_name.setText(eachItem.getName());

            ImageView detailed_img = (ImageView)findViewById(R.id.detaied_img);
            detailed_img.setImageResource(eachItem.getImg_rcs());
        }
//        TextView textView = (TextView)findViewById(R.id.detailed_name);
//        textView.setText(getIntent().getStringExtra("MSG"));
    }
}