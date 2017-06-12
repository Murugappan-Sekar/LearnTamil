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
        words.add( new Word(getResources().getString(R.string.familyAnswer1), getResources().getString(R.string.family1),R.drawable.mother));
        words.add( new Word(getResources().getString(R.string.familyAnswer2), getResources().getString(R.string.family2),R.drawable.father));
        words.add( new Word(getResources().getString(R.string.familyAnswer3), getResources().getString(R.string.family3),R.drawable.family_grandfather));
        words.add( new Word(getResources().getString(R.string.familyAnswer4), getResources().getString(R.string.family4),R.drawable.family_grandmother));
        words.add( new Word(getResources().getString(R.string.familyAnswer5), getResources().getString(R.string.family5),R.drawable.brother));
        words.add( new Word(getResources().getString(R.string.familyAnswer6), getResources().getString(R.string.family6),R.drawable.sister));
        words.add( new Word(getResources().getString(R.string.familyAnswer7), getResources().getString(R.string.family7),R.drawable.son));
        words.add( new Word(getResources().getString(R.string.familyAnswer8), getResources().getString(R.string.family8),R.drawable.daughter));
        words.add( new Word(getResources().getString(R.string.familyAnswer9), getResources().getString(R.string.family9),R.drawable.wife));
        words.add( new Word(getResources().getString(R.string.familyAnswer10), getResources().getString(R.string.family10),R.drawable.husband));
        WordAdapter wordAdapter = new WordAdapter(this, words);


        ListView rootView = (ListView) findViewById(R.id.listViewRoot);
        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
