package com.example.android.chineselearner;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);

        final ArrayList<Word> family = new ArrayList<>();

        family.add(new Word("Mother", "妈妈", R.mipmap.family_mother, R.raw.family_mom));
        family.add(new Word("Father", "爸爸", R.mipmap.family_father, R.raw.family_dad));
        family.add(new Word("Younger Sister", "妹妹", R.mipmap.family_younger_sister, R.raw.family_younger_sister));
        family.add(new Word("Older Sister", "姐姐", R.mipmap.family_older_sister, R.raw.family_older_sister));
        family.add(new Word("Younger Brother", "弟弟", R.mipmap.family_younger_brother, R.raw.family_younger_brother));
        family.add(new Word("Older Brother", "哥哥", R.mipmap.family_older_brother, R.raw.family_older_brother));
        family.add(new Word("Son", "儿子", R.mipmap.family_son, R.raw.family_son));
        family.add(new Word("Daughter", "女儿", R.mipmap.family_daughter, R.raw.family_daughter));
        family.add(new Word("Father's Mother", "祖母", R.mipmap.family_grandmother_nan, R.raw.family_fathers_mother));
        family.add(new Word("Father's Father", "祖父", R.mipmap.family_grandfather_nan, R.raw.family_fathers_father));
        family.add(new Word("Mother's Mother", "外父母", R.mipmap.family_grandmother_nv, R.raw.family_mothers_mother));
        family.add(new Word("Mother's Father", "外祖父", R.mipmap.family_grandfather_nv, R.raw.family_mothers_father));

        WordAdapter adapter = new WordAdapter(this, family, Color.parseColor("#009900"));

        ListView listView = findViewById(R.id.basicView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = family.get(position);
                m = MediaPlayer.create(FamilyActivity.this, word.getSoundAddress());
                m.start();
            }
        });
    }
}
