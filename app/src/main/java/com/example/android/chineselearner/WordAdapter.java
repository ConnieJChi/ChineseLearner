package com.example.android.chineselearner;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview_layout, parent, false);
        }
        Word currentWord = getItem(position);

        TextView english = listItemView.findViewById(R.id.first);
        english.setText(currentWord.getDefaultTranslation());

        TextView chinese = listItemView.findViewById(R.id.second);
        chinese.setText(currentWord.getChineseTranslation());

        return listItemView;
    }
}
