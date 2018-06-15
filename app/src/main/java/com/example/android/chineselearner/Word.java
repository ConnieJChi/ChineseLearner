package com.example.android.chineselearner;

public class Word {
    private String englishWord;
    private String chineseWord;
    private int imageAddress = 0;

    Word(String e, String c) {
        englishWord = e;
        chineseWord = c;
    }

    Word(String e, String c, int i) {
        englishWord = e;
        chineseWord = c;
        imageAddress = i;
    }
    public String getDefaultTranslation() {
        return englishWord;
    }
    public String getChineseTranslation() {
        return chineseWord;
    }
    public int getImageAddress() {return imageAddress;}
}
