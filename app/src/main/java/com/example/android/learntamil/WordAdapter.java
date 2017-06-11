package com.example.android.learntamil;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by murugappan on 6/11/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, List<Word> words)
    {
        super(context,0,words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word words = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listviewadapter, parent, false);
        }


        TextView versionNameView = (TextView) convertView.findViewById(R.id.tamilText);
        versionNameView.setText(words.getTamilWord());

        TextView versionNumberView = (TextView) convertView.findViewById(R.id.defaultText);
        versionNumberView.setText(words.getTransWord());
        return convertView;
    }

}
