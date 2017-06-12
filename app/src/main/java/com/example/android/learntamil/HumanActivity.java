package com.example.android.learntamil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HumanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewxml);
        //display source words
        //through array adapter
        //Log.v("activity ","before adapter");
        ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word(getResources().getString(R.string.humanAnswer1), getResources().getString(R.string.human1)));
        words.add( new Word(getResources().getString(R.string.humanAnswer2), getResources().getString(R.string.human2)));
        words.add( new Word(getResources().getString(R.string.humanAnswer3), getResources().getString(R.string.human3)));
        words.add( new Word(getResources().getString(R.string.humanAnswer4), getResources().getString(R.string.human4)));
        words.add( new Word(getResources().getString(R.string.humanAnswer5), getResources().getString(R.string.human5)));
        words.add( new Word(getResources().getString(R.string.humanAnswer6), getResources().getString(R.string.human6)));
        words.add( new Word(getResources().getString(R.string.humanAnswer7), getResources().getString(R.string.human7)));
        words.add( new Word(getResources().getString(R.string.humanAnswer8), getResources().getString(R.string.human8)));
        words.add( new Word(getResources().getString(R.string.humanAnswer9), getResources().getString(R.string.human9)));
        words.add( new Word(getResources().getString(R.string.humanAnswer10), getResources().getString(R.string.human10)));
        WordAdapter wordAdapter = new WordAdapter(this, words);


        ListView rootView = (ListView) findViewById(R.id.listViewRoot);
        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
