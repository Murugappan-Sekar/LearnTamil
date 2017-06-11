package com.example.android.learntamil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Intent for activities
    public void startNumbersActivity(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void startColorsActivity(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void startAnimalsActivity(View view) {
        Intent i = new Intent(this, AnimalsActivity.class);
        startActivity(i);
    }

    public void startHumanActivity(View view) {
        Intent i = new Intent(this, HumanActivity.class);
        startActivity(i);
    }

    public void startFamilyActivity(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void startPhraseActivity(View view) {
        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }
    //end of activity intents
}
