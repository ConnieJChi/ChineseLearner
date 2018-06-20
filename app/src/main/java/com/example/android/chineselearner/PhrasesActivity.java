package com.example.android.chineselearner;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer m = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);

        final ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word("Where are you going?", "你要去哪里?", R.raw.phrases_where_are_you_going));
        phrases.add(new Word("What is your name?", "你叫什么名字?", R.raw.phrases_what_is_your_name));
        phrases.add(new Word("My name is ...","我的名字是...", R.raw.phrases_my_name_is));
        phrases.add(new Word("How are you feeling?", "你感觉怎么样?", R.raw.phrases_how_do_you_feel));
        phrases.add(new Word("Where is the bathroom", "洗手间在哪里", R.raw.phrases_where_is_bathroom));
        phrases.add(new Word("How was your day?", "你今天过得怎么样?", R.raw.phrases_how_was_your_day));
        phrases.add(new Word("Breakfast", "早餐", R.raw.phrases_breakfast));
        phrases.add(new Word("Lunch", "午餐", R.raw.phrases_lunch));
        phrases.add(new Word("Dinner", "晚餐", R.raw.phrases_dinner));
        phrases.add(new Word("What is this?", "这是什么？", R.raw.phrases_what_is_this));
        phrases.add(new Word("Thank you!", "谢谢！", R.raw.phrases_thank_you));
        phrases.add(new Word("Sorry", "对不起", R.raw.phrases_sorry));
        phrases.add(new Word("Where is ...?", "...在哪里？", R.raw.phrases_where_is_it));

        WordAdapter phr = new WordAdapter(this, phrases, Color.parseColor("#0066ff"));
        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(phr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (m != null ) {
                    m.release();
                    m = null;
                }

                Word word = phrases.get(position);
                m = MediaPlayer.create(PhrasesActivity.this, word.getSoundAddress());
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
