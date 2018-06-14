package com.example.android.chineselearner;

public class Word {
    private String englishWord;
    private String chineseWord;

    Word(String e, String c) {
        englishWord = e;
        chineseWord = c;
    }
    public String getDefaultTranslation() {
        return englishWord;
    }
    public String getChineseTranslation() {
        return chineseWord;
    }
}
