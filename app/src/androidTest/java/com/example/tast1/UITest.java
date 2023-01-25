package com.example.tast1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.typeText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class UITest {

    private final UITestObject[] test = new UITestObject[]{new UITestObject("dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl"), new UITestObject("dcba hgfe", "abcd efgh", "xl"), new UITestObject("dcb1a hgfle", "a1bcd efglh", "xl"), new UITestObject("qw@!321e qCBAqq", "qwe123!@ qABCqq", "qw"), new UITestObject("y2trweq31 !q2", "123qwerty q!2", "e2"),};

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void Test() {
        for (UITestObject uiTestObject : test) {

            onView(withId(R.id.text_for_anagram)).perform(typeText(uiTestObject.text));
            onView(withId(R.id.filter_anagram)).perform(typeText(uiTestObject.filter));
            onView(withId(R.id.text_anagram)).check(matches(withText(uiTestObject.expected)));

            onView(withId(R.id.text_for_anagram)).perform(clearText());
            onView(withId(R.id.filter_anagram)).perform(clearText());
        }
    }


    @Test
    public void TestWithoutFilter() {
        onView(withId(R.id.text_for_anagram)).perform(typeText("Foxminded cool 24/7"));
        onView(withId(R.id.text_anagram)).check(matches(withText("dednimxoF looc 24/7")));
        onView(withId(R.id.text_for_anagram)).perform(clearText());
        onView(withId(R.id.filter_anagram)).perform(clearText());

        onView(withId(R.id.text_for_anagram)).perform(typeText("ewq123 !@qqCBA"));
        onView(withId(R.id.text_anagram)).check(matches(withText("qwe123 !@ABCqq")));
        onView(withId(R.id.text_for_anagram)).perform(clearText());
        onView(withId(R.id.filter_anagram)).perform(clearText());

        onView(withId(R.id.text_for_anagram)).perform(typeText("a1bcd efg!h"));
        onView(withId(R.id.text_anagram)).check(matches(withText("d1cba hgf!e")));
        onView(withId(R.id.text_for_anagram)).perform(clearText());
        onView(withId(R.id.filter_anagram)).perform(clearText());

    }

    @Test
    public void TestWithoutText() {
        onView(withId(R.id.filter_anagram)).perform(typeText("xl"));
        onView(withId(R.id.text_anagram)).check(matches(withText("")));

    }
}