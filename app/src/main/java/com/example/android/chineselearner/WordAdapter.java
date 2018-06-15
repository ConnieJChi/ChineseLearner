package com.example.android.chineselearner;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
    private int color = 0;


    public WordAdapter(Activity context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }

    public WordAdapter(Activity c, ArrayList<Word> w, int co) {
        super(c, 0, w);
        color = co;
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

        if (currentWord.getImageAddress() != 0) {
            ImageView image = listItemView.findViewById(R.id.image);
            image.setImageResource(currentWord.getImageAddress());
        }

        LinearLayout textContainer = listItemView.findViewById(R.id.text);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
