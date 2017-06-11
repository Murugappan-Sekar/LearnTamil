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
        words.add( new Word(getResources().getString(R.string.blackColorAnswer), getResources().getString(R.string.blackColor)));
        words.add( new Word(getResources().getString(R.string.whiteColorAnswer), getResources().getString(R.string.whiteColor)));
        words.add( new Word(getResources().getString(R.string.blueColorAnswer), getResources().getString(R.string.blueColor)));
        words.add( new Word(getResources().getString(R.string.greenColorAnswer), getResources().getString(R.string.greenColor)));
        words.add( new Word(getResources().getString(R.string.redColorAnswer), getResources().getString(R.string.redColor)));
        words.add( new Word(getResources().getString(R.string.yellowColorAnswer), getResources().getString(R.string.yellowColor)));
        words.add( new Word(getResources().getString(R.string.purpleColorAnswer), getResources().getString(R.string.purpleColorAnswer)));
        words.add( new Word(getResources().getString(R.string.brownColorAnswer), getResources().getString(R.string.brownColor)));
        WordAdapter wordAdapter = new WordAdapter(this, words);


        ListView rootView = (ListView) findViewById(R.id.listViewRoot);
        rootView.setBackgroundColor(getResources().getColor(R.color.brown));
        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
