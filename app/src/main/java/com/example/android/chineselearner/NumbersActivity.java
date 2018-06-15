package com.example.android.chineselearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);
        ArrayList<Word> numArr = new ArrayList<> ();

        numArr.add(new Word("zero", "零", R.mipmap.number_zero));
        numArr.add(new Word("one", "一", R.mipmap.number_one));
        numArr.add(new Word("two", "二", R.mipmap.number_two));
        numArr.add(new Word("three", "三", R.mipmap.number_three));
        numArr.add(new Word("four", "四", R.mipmap.number_four));
        numArr.add(new Word("five", "五", R.mipmap.number_five));
        numArr.add(new Word("six", "六", R.mipmap.number_six));
        numArr.add(new Word("seven", "七", R.mipmap.number_seven));
        numArr.add(new Word("eight", "八", R.mipmap.number_eight));
        numArr.add(new Word("nine", "九", R.mipmap.number_nine));
        numArr.add(new Word("ten", "十", R.mipmap.number_ten));

        WordAdapter adapter = new WordAdapter(this, numArr, Color.parseColor("#ff8533"));

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(adapter);
    }
}

