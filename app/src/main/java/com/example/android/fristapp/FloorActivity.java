package com.example.android.fristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);
// Find the View that shows the Rooms category
        TextView rooms = (TextView) findViewById(R.id.rooms);
        rooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creat a new Intent to open the {@link roomsActivity}

                Intent RoomsActivity = new Intent(FloorActivity.this, RoomsActivity.class);
                startActivity(RoomsActivity);
                // Toast.makeText(getApplicationContext(),"MainActivity java",Toast.LENGTH_SHORT).show();
            }

        });


    }

}
