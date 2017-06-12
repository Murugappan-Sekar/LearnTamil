package com.example.android.learntamil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewxml);

        //display source words
        //through array adapter
        //Log.v("activity ","before adapter");
        ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word(getResources().getString(R.string.blackColorAnswer), getResources().getString(R.string.blackColor),R.drawable.color_black));
        words.add( new Word(getResources().getString(R.string.whiteColorAnswer), getResources().getString(R.string.whiteColor),R.drawable.color_white));
        words.add( new Word(getResources().getString(R.string.blueColorAnswer), getResources().getString(R.string.blueColor)));
        words.add( new Word(getResources().getString(R.string.greenColorAnswer), getResources().getString(R.string.greenColor),R.drawable.color_green));
        words.add( new Word(getResources().getString(R.string.redColorAnswer), getResources().getString(R.string.redColor),R.drawable.color_red));
        words.add( new Word(getResources().getString(R.string.yellowColorAnswer), getResources().getString(R.string.yellowColor),R.drawable.color_dusty_yellow));
        words.add( new Word(getResources().getString(R.string.purpleColorAnswer), getResources().getString(R.string.purpleColor)));
        words.add( new Word(getResources().getString(R.string.brownColorAnswer), getResources().getString(R.string.brownColor),R.drawable.color_brown));
        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView rootView = (ListView) findViewById(R.id.listViewRoot);

        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
