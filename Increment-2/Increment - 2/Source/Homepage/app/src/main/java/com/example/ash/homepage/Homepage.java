package com.example.ash.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    ImageView imageV;
    ImageView imageVi;
    ImageView imageVie;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        imageV = (ImageView)findViewById(R.id.imageView7);
        //set a onclick listener for when the button gets clicked
        imageV.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Homepage.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }

}