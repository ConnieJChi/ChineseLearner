package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("blue", "蓝色"));
        colors.add(new Word("yellow", "黄色"));
        colors.add(new Word("red", "红色"));
        colors.add(new Word("orange","橙色"));
        colors.add(new Word("green", "绿色"));
        colors.add(new Word("purple", "紫色"));
        colors.add(new Word("white", "白色"));
        colors.add(new Word("gray", "灰色"));
        colors.add(new Word("black", "黑色"));

        WordAdapter colorsAdapt = new WordAdapter(this, colors);
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(colorsAdapt);

    }
}
