package com.example.cityinfo;

import androidx.annotation.NonNull;

import android.content.res.Configuration;

//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.DisplayMetrics;

import android.widget.TextView;



import org.w3c.dom.Text;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class List1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);
        getSupportActionBar().setTitle("Home");
        Button but1=findViewById(R.id.but1);
        Button but2=findViewById(R.id.but2);
        Button but3=findViewById(R.id.but3);
        Button but4=findViewById(R.id.but4);
        Button but5=findViewById(R.id.but5);
        Button but6=findViewById(R.id.but6);



        String text="";



        //Determine screen size

        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {

            text="LargeScreen";

        }

        else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {

            text="MediumScreen";

        }

        else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {

            text="SmallScreen";

        }

        else {

            text="None";

        }







        //Determine density

        DisplayMetrics metrics = getResources().getDisplayMetrics();

        float density = metrics.density;

        float dpWidth=metrics.widthPixels/density;

        float dpHeight=metrics.heightPixels/density;



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, mess.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, Grocery.class);
                startActivity(int1);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, Computer_Shop.class);
                startActivity(int1);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, Hospitals.class);
                startActivity(int1);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, Shopping.class);
                startActivity(int1);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(List1.this, Hostels.class);
                startActivity(int1);
            }
        });

        }

}
