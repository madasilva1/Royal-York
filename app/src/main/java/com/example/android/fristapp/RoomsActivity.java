package com.example.android.fristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomsActivity extends AppCompatActivity {
    private TextView editTxt;

    private ListView list;
    private ArrayAdapter<Integer> adapter;
    private ArrayList<Integer> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
        list = (ListView) findViewById(R.id.List_of_rooms);
        arrayList = new ArrayList<Integer>();
        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
        // Here, you set the data in your ListView
        list.setAdapter(adapter);
        // Set a click listener on that View
      arrayList.add(0,20);
      arrayList.add(1,23);
    }
}
