package com.somago.jokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesFragment extends Fragment {


    public JokesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jokes,container, false);
        TextView jokeTextView = view.findViewById(R.id.joke_tv);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("random_joke");
        jokeTextView.setText(joke);
        return view;
    }
}
