package com.example.android.chineselearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);

        ArrayList<Word> family = new ArrayList<>();

        family.add(new Word("Mother", "妈妈", R.mipmap.family_mother));
        family.add(new Word("Father", "爸爸", R.mipmap.family_father));
        family.add(new Word("Younger Sister", "妹妹", R.mipmap.family_younger_sister));
        family.add(new Word("Older Sister", "姐姐", R.mipmap.family_older_sister));
        family.add(new Word("Younger Brother", "弟弟", R.mipmap.family_younger_brother));
        family.add(new Word("Older Brother", "哥哥", R.mipmap.family_older_brother));
        family.add(new Word("Son", "儿子", R.mipmap.family_son));
        family.add(new Word("Daughter", "女儿", R.mipmap.family_daughter));
        family.add(new Word("Father's Mother", "祖母", R.mipmap.family_grandmother_nan));
        family.add(new Word("Father's Father", "祖父", R.mipmap.family_grandfather_nan));
        family.add(new Word("Mother's Mother", "外父母", R.mipmap.family_grandmother_nv));
        family.add(new Word("Mother's Father", "外祖父", R.mipmap.family_grandfather_nv));

        WordAdapter adapter = new WordAdapter(this, family, Color.parseColor("#009900"));

        ListView f = findViewById(R.id.basicView);

        f.setAdapter(adapter);

    }
}
