package com.example.tast1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class UITest {

    private final UITestObject[] test = new UITestObject[]{
            new UITestObject("dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl"),
            new UITestObject("dcba hgfe", "abcd efgh", "xl"),
            new UITestObject("dcb1a hgfle", "a1bcd efglh", "xl"),
            new UITestObject("qw@!321e qCBAqq", "qwe123!@ qABCqq", "qw"),
            new UITestObject("y2trweq31 !q2", "123qwerty q!2", "e2"),
            new UITestObject("dednimxoF looc 24/7", "Foxminded cool 24/7", ""),
            new UITestObject("qwe123 !@ABCqq", "ewq123 !@qqCBA", ""),
            new UITestObject("d1cba hgf!e", "a1bcd efg!h", ""),
            new UITestObject("", "", "xl"),
    };

    @Rule
    public ActivityScenarioRule activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void test() {
        for (UITestObject uiTestObject : test) {

            onView(withId(R.id.text_for_anagram)).perform(typeText(uiTestObject.text));
            onView(withId(R.id.filter_anagram)).perform(typeText(uiTestObject.filter));
            onView(withId(R.id.text_anagram)).check(matches(withText(uiTestObject.expected)));

            onView(withId(R.id.text_for_anagram)).perform(clearText());
            onView(withId(R.id.filter_anagram)).perform(clearText());
        }
    }
}