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
    };


    @Test
    public void TestMakeAnagram() {
        for (TestObject testObject : test) {
            assertEquals(testObject.expected, Reverse.makeAnagram(testObject.text, testObject.filter));
        }
    }


    @Test
    public void TestMakeAnagramNullFilter() {
        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7", null));
        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh", null));
        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h", null));
        assertEquals("ytrewq123 !@CBA", Reverse.makeAnagram("qwerty123 !@ABC", null));
    }

    @Test
    public void TestMakeAnagramNullText() {
        assertEquals("", Reverse.makeAnagram(null, "xl"));
        assertEquals("", Reverse.makeAnagram(null, "!2qw"));
        assertEquals("", Reverse.makeAnagram(null, ""));
    }
}

