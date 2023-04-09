package com.example.parci3;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.parci3.db.DbHelper;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class Test4 {

    private DbHelper dbHelper;
    private Persona persona;

    @Rule
    public ActivityScenarioRule<Ver> mVer = new ActivityScenarioRule(Ver.class);

    @Test
    public void testLayoutIsDisplayed() {
        //onView(withId(R.id.listaContactos)).check(matches(isDisplayed()));
        onView(withId(R.id.listaContactos)).perform(click());
    }
}