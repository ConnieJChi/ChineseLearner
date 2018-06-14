package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numArr = new ArrayList<> ();

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

        WordAdapter adapter = new WordAdapter(this, numArr);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(adapter);
    }
}

