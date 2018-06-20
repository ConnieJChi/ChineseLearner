package com.example.android.chineselearner;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer m = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);

        final ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("blue", "蓝色", R.mipmap.color_blue, R.raw.color_blue));
        colors.add(new Word("yellow", "黄色", R.mipmap.color_mustard_yellow, R.raw.color_yellow));
        colors.add(new Word("red", "红色", R.mipmap.color_red, R.raw.color_red));
        colors.add(new Word("orange","橙色", R.mipmap.color_orange, R.raw.color_orange));
        colors.add(new Word("green", "绿色", R.mipmap.color_green, R.raw.color_green));
        colors.add(new Word("purple", "紫色", R.mipmap.color_purple, R.raw.color_purple));
        colors.add(new Word("white", "白色", R.mipmap.color_white, R.raw.color_white));
        colors.add(new Word("gray", "灰色", R.mipmap.color_gray, R.raw.color_gray));
        colors.add(new Word("black", "黑色", R.mipmap.color_black, R.raw.color_black));
        colors.add(new Word("brown", "棕色", R.mipmap.color_brown, R.raw.color_brown));

        WordAdapter colorsAdapt = new WordAdapter(this, colors, Color.parseColor("#993399"));
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(colorsAdapt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               if (m != null ) {
                   m.release();
                   m = null;
               }
               Word word = colors.get(position);
               m = MediaPlayer.create(ColorsActivity.this, word.getSoundAddress());
               m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                   @Override
                   public void onCompletion(MediaPlayer mp) {
                       m.release();
                       m = null;
                   }
               });
               m.start();

               }
        });


    }


    @Override
    protected void onStop() {
        super.onStop();
        if (m != null) {
            m.release();
        }
    }
}
