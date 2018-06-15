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

        colors.add(new Word("blue", "蓝色", R.mipmap.color_blue));
        colors.add(new Word("yellow", "黄色", R.mipmap.color_mustard_yellow));
        colors.add(new Word("red", "红色", R.mipmap.color_red));
        colors.add(new Word("orange","橙色", R.mipmap.color_orange));
        colors.add(new Word("green", "绿色", R.mipmap.color_green));
        colors.add(new Word("purple", "紫色", R.mipmap.color_purple));
        colors.add(new Word("white", "白色", R.mipmap.color_white));
        colors.add(new Word("gray", "灰色", R.mipmap.color_gray));
        colors.add(new Word("black", "黑色", R.mipmap.color_black));
        colors.add(new Word("brown", "棕色", R.mipmap.color_brown));

        WordAdapter colorsAdapt = new WordAdapter(this, colors);
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(colorsAdapt);

    }
}
