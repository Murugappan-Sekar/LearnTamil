package com.example.android.learntamil;

/**
 * Created by murugappan on 6/11/17.
 */

public class Word {
    private String tamilWord;
    private String translationWord;
    private int picId=0;

    public Word(String tamWord, String traWord) {
        tamilWord = tamWord;
        translationWord = traWord;
    }

    public Word(String tamWord, String traWord, int pic) {
        tamilWord = tamWord;
        translationWord = traWord;
        picId = pic;
    }

    public String getTamilWord() {

        return tamilWord;
    }

    public String getTransWord() {
        return translationWord;
    }

    public int getPicId() {
        return picId;
    }
}
