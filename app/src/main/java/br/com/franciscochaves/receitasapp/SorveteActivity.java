package br.com.franciscochaves.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SorveteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soverte);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}