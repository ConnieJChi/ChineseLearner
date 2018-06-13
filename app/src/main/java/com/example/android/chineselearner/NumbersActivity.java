package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] numArr = new String[10];

        numArr[0] = "zero";
        numArr[1] = "one";
        numArr[2] = "two";
        numArr[3] = "three";
        numArr[4] = "four";
        numArr[5] = "five";
        numArr[6] = "six";
        numArr[7] = "seven";
        numArr[8] = "eight";
        numArr[9] = "nine";

        for (int i = 0 ; i < 10; i++) {
            Log.v("ColorsActivity", "word at index " + i + " is " +  numArr[i]);
        }
    }
}
