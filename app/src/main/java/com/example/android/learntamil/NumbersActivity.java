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
        words.add(new Word(getResources().getString(R.string.oneStringAnswer),getResources().getString(R.string.oneString),R.drawable.number_one));
        words.add(new Word(getResources().getString(R.string.twoStringAnswer),getResources().getString(R.string.twoString),R.drawable.number_two));
        words.add(new Word(getResources().getString(R.string.threeStringAnswer),getResources().getString(R.string.threeString),R.drawable.number_three));
        words.add(new Word(getResources().getString(R.string.fourStringAnswer),getResources().getString(R.string.fourString),R.drawable.number_four));
        words.add(new Word(getResources().getString(R.string.fiveStringAnswer),getResources().getString(R.string.fiveString),R.drawable.number_five));
        words.add(new Word(getResources().getString(R.string.sixStringAnswer),getResources().getString(R.string.sixString),R.drawable.number_six));
        words.add(new Word(getResources().getString(R.string.sevenStringAnswer),getResources().getString(R.string.sevenString),R.drawable.number_seven));
        words.add(new Word(getResources().getString(R.string.eightStringAnswer),getResources().getString(R.string.eightString),R.drawable.number_eight));
        words.add(new Word(getResources().getString(R.string.nineStringAnswer),getResources().getString(R.string.nineString),R.drawable.number_nine));
        words.add(new Word(getResources().getString(R.string.tenStringAnswer),getResources().getString(R.string.tenString),R.drawable.number_ten));
        WordAdapter wordAdapter=new WordAdapter(this,words);


        ListView rootView=(ListView) findViewById(R.id.listViewRoot);

        rootView.setAdapter(wordAdapter);
        //end of source words display

    }
}
