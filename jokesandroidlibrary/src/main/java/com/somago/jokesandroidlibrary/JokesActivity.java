package com.somago.jokesandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new JokesFragment()).commit();
    }
}
