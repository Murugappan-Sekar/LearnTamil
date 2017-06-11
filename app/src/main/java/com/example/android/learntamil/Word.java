package com.example.android.learntamil;

/**
 * Created by murugappan on 6/11/17.
 */

public class Word {
    private String tamilWord;
    private String translationWord;
    public Word(String tamWord,String traWord)
    {
        tamilWord=tamWord;
        translationWord=traWord;
    }
    public String getTamilWord()
    {
        return tamilWord;
    }
    public String getTransWord()
    {
        return translationWord;
    }
}
