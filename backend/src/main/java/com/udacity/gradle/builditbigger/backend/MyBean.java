package com.udacity.gradle.builditbigger.backend;

import com.somago.jokeslibrary.MyFunnyJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;

    }

    public void setData(String joke){
        myData = joke;
    }
}