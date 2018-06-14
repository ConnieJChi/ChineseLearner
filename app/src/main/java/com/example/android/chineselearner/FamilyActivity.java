package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> family = new ArrayList<>();

        family.add(new Word("Mother", "妈妈"));
        family.add(new Word("Father", "爸爸"));
        family.add(new Word("Younger Sister", "妹妹"));
        family.add(new Word("Older Sister", "姐姐"));
        family.add(new Word("Younger Brother", "弟弟"));
        family.add(new Word("Older Brother", "哥哥"));
        family.add(new Word("Son", "儿子"));
        family.add(new Word("Daughter", "女儿"));
        family.add(new Word("Father's Mother", "祖母"));
        family.add(new Word("Father's Father", "祖父"));
        family.add(new Word("Mother's Mother", "外父母"));
        family.add(new Word("Mother's Father", "外祖父"));

        WordAdapter adapter = new WordAdapter(this, family);

        ListView f = findViewById(R.id.fam);

        f.setAdapter(adapter);

    }
}
