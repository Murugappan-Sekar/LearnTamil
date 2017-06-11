package com.example.android.learntamil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewxml);
        //display source words
        //through array adapter
        //Log.v("activity ","before adapter");
        ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word(getResources().getString(R.string.animalAnswer1), getResources().getString(R.string.animal1)));
        words.add( new Word(getResources().getString(R.string.animalAnswer2), getResources().getString(R.string.animal2)));
        words.add( new Word(getResources().getString(R.string.animalAnswer3), getResources().getString(R.string.animal3)));
        words.add( new Word(getResources().getString(R.string.animalAnswer4), getResources().getString(R.string.animal4)));
        words.add( new Word(getResources().getString(R.string.animalAnswer5), getResources().getString(R.string.animal5)));
        words.add( new Word(getResources().getString(R.string.animalAnswer6), getResources().getString(R.string.animal6)));
        words.add( new Word(getResources().getString(R.string.animalAnswer7), getResources().getString(R.string.animal7)));
        words.add( new Word(getResources().getString(R.string.animalAnswer8), getResources().getString(R.string.animal8)));
        words.add( new Word(getResources().getString(R.string.animalAnswer9), getResources().getString(R.string.animal9)));
        words.add( new Word(getResources().getString(R.string.animalAnswer10), getResources().getString(R.string.animal10)));
        words.add( new Word(getResources().getString(R.string.animalAnswer11), getResources().getString(R.string.animal11)));
        words.add( new Word(getResources().getString(R.string.animalAnswer12), getResources().getString(R.string.animal12)));
        words.add( new Word(getResources().getString(R.string.animalAnswer13), getResources().getString(R.string.animal13)));
        words.add( new Word(getResources().getString(R.string.animalAnswer14), getResources().getString(R.string.animal14)));
        WordAdapter wordAdapter = new WordAdapter(this, words);


        ListView rootView = (ListView) findViewById(R.id.listViewRoot);
        rootView.setBackgroundColor(getResources().getColor(R.color.purple));
        rootView.setAdapter(wordAdapter);
        //end of source words display
    }
}
