package com.example.android.learntamil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewxml);
        //Log.v("activity ","before adapter");
        ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word(getResources().getString(R.string.familyAnswer1), getResources().getString(R.string.family1)));
        words.add( new Word(getResources().getString(R.string.familyAnswer2), getResources().getString(R.string.family2)));
        words.add( new Word(getResources().getString(R.string.familyAnswer3), getResources().getString(R.string.family3)));
        words.add( new Word(getResources().getString(R.string.familyAnswer4), getResources().getString(R.string.family4)));
        words.add( new Word(getResources().getString(R.string.familyAnswer5), getResources().getString(R.string.family5)));
        words.add( new Word(getResources().getString(R.string.familyAnswer6), getResources().getString(R.string.family6)));
        words.add( new Word(getResources().getString(R.string.familyAnswer7), getResources().getString(R.string.family7)));
        words.add( new Word(getResources().getString(R.string.familyAnswer8), getResources().getString(R.string.family8)));
        words.add( new Word(getResources().getString(R.string.familyAnswer9), getResources().getString(R.string.family9)));
        words.add( new Word(getResources().getString(R.string.familyAnswer10), getResources().getString(R.string.family10)));
        WordAdapter wordAdapter = new WordAdapter(this, words);


        ListView rootView = (ListView) findViewById(R.id.listViewRoot);
        rootView.setBackgroundColor(getResources().getColor(R.color.skyBlue));
        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
