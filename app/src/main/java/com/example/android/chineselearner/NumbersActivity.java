package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> numArr = new ArrayList ();

        numArr.add(new Word("zero", "零"));
        numArr.add(new Word("one", "一"));
        numArr.add(new Word("two", "二"));
        numArr.add(new Word("three", "三"));
        numArr.add(new Word("four", "四"));
        numArr.add(new Word("five", "五"));
        numArr.add(new Word("six", "六"));
        numArr.add(new Word("seven", "七"));
        numArr.add(new Word("eight", "八"));
        numArr.add(new Word("nine", "九"));
        numArr.add(new Word("ten", "十"));

//        WordAdapter flavorAdapter = new WordAdapter(this, numArr);
//
//        // Get a reference to the ListView, and attach the adapter to the listView.
//        ListView listView = (ListView) findViewById(R.id.rootView);
//        listView.setAdapter(flavorAdapter);

        WordAdapter adapter = new WordAdapter(this, numArr);

        ListView listView = (ListView) findViewById(R.id.rootView);

        listView.setAdapter(adapter);
    }
}

