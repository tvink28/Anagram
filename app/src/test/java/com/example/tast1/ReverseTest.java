package com.example.tast1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {


    private final TestObjects[] test = new TestObjects[]{
            new TestObjects("dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl"),
            new TestObjects("dcba hgfe", "abcd efgh", "xl"),
            new TestObjects("dcb1a hgfle", "a1bcd efglh", "xl"),
            new TestObjects("qw@!321e qCBAqq", "qwe123!@ qABCqq", "qw"),
            new TestObjects("y2trweq31 !q2", "123qwerty q!2", "e2"),
    };

    private final TestObjects[] nullFilter = new TestObjects[] {
            new TestObjects("dednimxoF looc 24/7","Foxminded cool 24/7", null),
            new TestObjects("dcba hgfe","abcd efgh", null),
            new TestObjects("d1cba hgf!e","a1bcd efg!h", null),
    };

    private final TestObjects[] nullText = new TestObjects[] {
            new TestObjects("",null, "xl"),
            new TestObjects("",null, "!2qw"),
            new TestObjects("",null, ""),
    };


    @Test
    public void TestMakeAnagram() {
        for (TestObjects testObjects : test) {
            assertEquals(testObjects.expected, Reverse.makeAnagram(testObjects.text, testObjects.filter));
        }
    }

    @Test
    public void TestMakeAnagramNullFilter() {
        for (TestObjects testObjects : nullFilter) {
            assertEquals(testObjects.expected, Reverse.makeAnagram(testObjects.text, testObjects.filter));
        }
    }

    @Test
    public void TestMakeAnagramNullText() {
        for (TestObjects testObjects : nullText) {
            assertEquals(testObjects.expected, Reverse.makeAnagram(testObjects.text, testObjects.filter));
        }
    }

//    @Test
//    public void TestMakeAnagramNullFilter() {
//        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7", null));
//        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh", null));
//        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h", null));
//        assertEquals("ytrewq123 !@CBA", Reverse.makeAnagram("qwerty123 !@ABC", null));
//    }
//
//    @Test
//    public void TestMakeAnagramIsEmpty() {
//        assertEquals("", Reverse.makeAnagram(null, "xl"));
//        assertEquals("", Reverse.makeAnagram(null, "!2qw"));
//        assertEquals("", Reverse.makeAnagram(null, ""));
//    }
}

