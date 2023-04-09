package com.example.parci3;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class Test4 {

    @Rule
    public ActivityTestRule<Ver> mVer = new ActivityTestRule<>(Ver.class);

    @Test
    public void testLayoutIsDisplayed() {
        onView(withId(R.id.listaContactos)).check(matches(isDisplayed()));
    }
}