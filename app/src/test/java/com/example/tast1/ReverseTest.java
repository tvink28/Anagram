package com.example.tast1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

    private final TestObject[] test = new TestObject[]{
            new TestObject("dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl"),
            new TestObject("dcba hgfe", "abcd efgh", "xl"),
            new TestObject("dcb1a hgfle", "a1bcd efglh", "xl"),
            new TestObject("qw@!321e qCBAqq", "qwe123!@ qABCqq", "qw"),
            new TestObject("y2trweq31 !q2", "123qwerty q!2", "e2"),
            new TestObject("qwe123 !@ABCqq", "ewq123 !@qqCBA", ""),
            new TestObject("dcba hgfe", "abcd efgh", ""),
            new TestObject("dednimxoF looc 24/7", "Foxminded cool 24/7", ""),
            new TestObject("d1cba hgf!e", "a1bcd efg!h", ""),
    };


    @Test
    public void TestMakeAnagram() {
        for (TestObject testObject : test) {
            assertEquals(testObject.expected, Reverse.makeAnagram(testObject.text, testObject.filter));
        }
    }


    @Test(expected = NullPointerException.class)
    public void TestMakeAnagramNullFilter() {
        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7", null));
    }

    @Test(expected = NullPointerException.class)
    public void TestMakeAnagramNullText() {
        assertEquals("", Reverse.makeAnagram(null, "xl"));
    }
}

