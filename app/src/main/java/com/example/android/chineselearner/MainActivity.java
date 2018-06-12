package com.example.android.chineselearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numbersClicked(View v) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void familyClicked(View v) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void colorsClicked(View v) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void phrasesClicked(View v) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
