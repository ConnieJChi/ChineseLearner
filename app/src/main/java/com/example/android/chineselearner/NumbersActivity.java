package com.example.android.chineselearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<String> numArr = new ArrayList<String>();

        numArr.add("zero");
        numArr.add("one");
        numArr.add("two");
        numArr.add("three");
        numArr.add("four");
        numArr.add("five");
        numArr.add("six");
        numArr.add("seven");
        numArr.add("eight");
        numArr.add("nine");
        numArr.add("ten");

//        for (int i = 0; i <= 10; i++) {
//            Log.v("ColorsActivity", "word at index " + i + " is " + numArr.get(i));
//        }

//        ListView root = (ListView) this.findViewById(R.id.rootView);
//        for (int i= 0; i < numArr.size(); i++) {
//            TextView zero = new TextView(this);
//            zero.setText(numArr.get(i));
//            root.addView(zero);
//        }
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numArr);
        ListView listView = (ListView) findViewById(R.id.rootView);
        listView.setAdapter(itemsAdapter);

    }
}

