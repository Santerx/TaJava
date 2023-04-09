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
public class Test2 {

    @Rule
    public ActivityTestRule<Usuario> mUser = new ActivityTestRule<>(Usuario.class);

    @Test
    public void testTextIsDisplayed() {
        onView(withId(R.id.txtUser)).check(matches(isDisplayed()));
    }

    @Test
    public void testTexttIsDisplayed() {
        onView(withId(R.id.txtPassword)).check(matches(isDisplayed()));
    }

    @Test
    public void ButtonIsDisplayed() {
        onView(withId(R.id.btnSigue)).check(matches(isDisplayed()));
    }


}
