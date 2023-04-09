package com.example.parci3;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class Test2 {

    @Rule
    public ActivityScenarioRule<Usuario> mTest2 = new ActivityScenarioRule(Usuario.class);

    @Test
    public void testTextIsDisplayed() {
        //onView(withId(R.id.txtUser)).check(matches(isDisplayed()));
        onView(withId(R.id.txtUser)).perform(typeText("Mariana"));
    }

    @Test
    public void testTexttIsDisplayed() {
        //onView(withId(R.id.txtPassword)).check(matches(isDisplayed()));
        onView(withId(R.id.txtPassword)).perform(typeText("hfusahfao"));
    }

    @Test
    public void ButtonIsDisplayed() {
        //onView(withId(R.id.btnSigue)).check(matches(isDisplayed()));
        onView(withId(R.id.btnSigue)).perform(click());
    }


}
