package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

public class MyAsyncTask extends AsyncTask<Context,Void,String> {

    private Context context;
    String JokeText;



    @Override
    protected String doInBackground(Context... contexts) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
