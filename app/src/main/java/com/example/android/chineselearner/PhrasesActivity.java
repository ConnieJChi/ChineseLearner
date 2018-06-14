package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word("Where are you going?", "你要去哪里?"));
        phrases.add(new Word("What is your name?", "你叫什么名字?"));
        phrases.add(new Word("My name is ...","我的名字是..."));
        phrases.add(new Word("How are you feeling?", "你感觉怎么样?"));
        phrases.add(new Word("Where is the bathroom", "洗手间在哪里"));
        phrases.add(new Word("How was your day?", "你今天过得怎么样?"));
        phrases.add(new Word("Breakfast", "早餐"));
        phrases.add(new Word("Lunch", "午餐"));
        phrases.add(new Word("Dinner", "晚餐"));
        phrases.add(new Word("What is this?", "这是什么？"));
        phrases.add(new Word("Thank you!", "谢谢！"));
        phrases.add(new Word("Sorry", "对不起"));
        phrases.add(new Word("Where is ...?", "...在哪里？"));

        WordAdapter phr = new WordAdapter(this, phrases);
        ListView listView = findViewById(R.id.phrases);
        listView.setAdapter(phr);
    }
}
