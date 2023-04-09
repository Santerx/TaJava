package com.example.parci3;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
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
public class Test3 {

    private DbHelper dbHelper;
    private Persona persona;

    @Rule
    public ActivityScenarioRule<Producto> mProduct = new ActivityScenarioRule(Producto.class);

    @Test
    public void testTextIsDisplayed() {
        //onView(withId(R.id.txtProducto)).check(matches(isDisplayed()));
        onView(withId(R.id.txtProducto)).perform(typeText("Fresa"));
    }

    @Test
    public void testTexttIsDisplayed() {
        //onView(withId(R.id.txtPrecio)).check(matches(isDisplayed()));
        onView(withId(R.id.txtPrecio)).perform(typeText("2500"));
    }

    @Test
    public void ButtonIsDisplayedd() {
        //onView(withId(R.id.btnSiguen)).check(matches(isDisplayed()));
        onView(withId(R.id.btnSiguen)).perform(click());
    }


}