package com.somago.jokeslibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyFunnyJokes {


    List<String> jokes = Arrays.asList(
            "Did you hear about the crook who stole a calendar? He got twelve months.",
            "I get plenty of exercise – jumping to conclusions, pushing my luck, and dodging deadlines.",
            "Nothing ruins a Friday more than an understanding that today is Tuesday.",
            "Don’t use beef stew as a computer password. It’s not stroganoff.",
            "I was walking along a back road when two bunnies suddenly leapt into the air and landed one on top of the other. To my astonishment, I saw that one…"
    );

    public String getJoke(){
        Random rand = new Random();
        int random = rand.nextInt(jokes.size());

        return jokes.get(random);
    }
}
