package com.example.android.learntamil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewxml);
        //((LinearLayout)findViewById(R.id.listLayout)).
        //display source words
        //through array adapter
        //Log.v("activity ","before adapter");
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word(getResources().getString(R.string.oneStringAnswer),getResources().getString(R.string.oneString)));
        words.add(new Word(getResources().getString(R.string.twoStringAnswer),getResources().getString(R.string.twoString)));
        words.add(new Word(getResources().getString(R.string.threeStringAnswer),getResources().getString(R.string.threeString)));
        words.add(new Word(getResources().getString(R.string.fourStringAnswer),getResources().getString(R.string.fourString)));
        words.add(new Word(getResources().getString(R.string.fiveStringAnswer),getResources().getString(R.string.fiveString)));
        words.add(new Word(getResources().getString(R.string.sixStringAnswer),getResources().getString(R.string.sixString)));
        words.add(new Word(getResources().getString(R.string.sevenStringAnswer),getResources().getString(R.string.sevenString)));
        words.add(new Word(getResources().getString(R.string.eightStringAnswer),getResources().getString(R.string.eightString)));
        words.add(new Word(getResources().getString(R.string.nineStringAnswer),getResources().getString(R.string.nineString)));
        words.add(new Word(getResources().getString(R.string.tenStringAnswer),getResources().getString(R.string.tenString)));
        WordAdapter wordAdapter=new WordAdapter(this,words);


        ListView rootView=(ListView) findViewById(R.id.listViewRoot);
        rootView.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        rootView.setAdapter(wordAdapter);
        //end of source words display

    }
}
