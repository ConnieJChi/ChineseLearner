package com.example.android.chineselearner;

public class Word {
    private String englishWord;
    private String chineseWord;
    private int imageAddress = 0;
    private int soundAddress = 0;

//    Word(String e, String c) {
//        englishWord = e;
//        chineseWord = c;
//    }

    Word(String e, String c, int s) {
        englishWord = e;
        chineseWord = c;
        soundAddress = s;
    }

    Word(String e, String c, int i, int s) {
        englishWord = e;
        chineseWord = c;
        imageAddress = i;
        soundAddress = s;
    }
    public String getDefaultTranslation() {
        return englishWord;
    }
    public String getChineseTranslation() {
        return chineseWord;
    }
    public int getImageAddress() {return imageAddress;}
    public int getSoundAddress() {return soundAddress;}
}
