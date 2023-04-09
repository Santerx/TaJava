package com.example.parci3;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ExampleEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule(MainActivity.class);

    @Test
    public void ButtonIsDisplayed() {
        //onView(withId(R.id.btnCrear)).check(matches(isDisplayed()));
        onView(withId(R.id.btnCrear)).perform(click());
    }
    @Test
    public void testButtonIsDisplayed() {
        //onView(withId(R.id.btn_seguir)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_seguir)).perform(click());
    }


}
