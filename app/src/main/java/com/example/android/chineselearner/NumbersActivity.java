package com.example.android.chineselearner;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);
        final ArrayList<Word> numArr = new ArrayList<> ();

        numArr.add(new Word("zero", "零", R.mipmap.number_zero, R.raw.number_zero));
        numArr.add(new Word("one", "一", R.mipmap.number_one, R.raw.number_one));
        numArr.add(new Word("two", "二", R.mipmap.number_two, R.raw.number_two));
        numArr.add(new Word("three", "三", R.mipmap.number_three, R.raw.number_three));
        numArr.add(new Word("four", "四", R.mipmap.number_four, R.raw.number_four));
        numArr.add(new Word("five", "五", R.mipmap.number_five, R.raw.number_five));
        numArr.add(new Word("six", "六", R.mipmap.number_six, R.raw.number_six));
        numArr.add(new Word("seven", "七", R.mipmap.number_seven, R.raw.number_seven));
        numArr.add(new Word("eight", "八", R.mipmap.number_eight, R.raw.number_eight));
        numArr.add(new Word("nine", "九", R.mipmap.number_nine, R.raw.number_nine));
        numArr.add(new Word("ten", "十", R.mipmap.number_ten, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this, numArr, Color.parseColor("#ff8533"));
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               Word word = numArr.get(position);
               m = MediaPlayer.create(NumbersActivity.this, word.getSoundAddress());
               m.start(); }
        });
    }
}

