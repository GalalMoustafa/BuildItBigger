package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class MyTestUnit extends AndroidTestCase {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);


    @Test
    public void testClickToGetJoke(){
        onView(withId(R.id.TellJokeButton)).perform(click());
        onView(withId(R.id.joke_tv)).check(matches(isDisplayed()));
    }

    @Test
    public void testJokeAsyncTask() throws Exception{
        MyAsyncTaskTest myAsyncTaskTest = new MyAsyncTaskTest();
        myAsyncTaskTest.execute(InstrumentationRegistry.getContext());
        String JokeText = myAsyncTaskTest.get(5000, TimeUnit.MILLISECONDS);
        Assert.assertTrue(!JokeText.equals(""));
    }

}
