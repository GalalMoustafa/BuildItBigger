package com.somago.jokeslibrary;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyFunnyJokes {


    List<String> jokes = asList(
            "Did you hear about the crook who stole a calendar? He got twelve months.",
            "I get plenty of exercise jumping to conclusions pushing my luck and dodging deadlines.",
            "Nothing ruins a Friday more than an understanding that today is Tuesday.",
            "Don not use beef stew as a computer password. It is not stroganoff.",
            "I was walking along a back road when two bunnies suddenly leapt into the air and landed one on top of the other To my astonishment I saw that one…"
    );

    public String getJoke(){
        Random rand = new Random();
        int random = rand.nextInt(jokes.size());
        String joke = jokes.get(random);
        return joke;
    }
}
