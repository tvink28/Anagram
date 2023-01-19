package com.example.tast1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ReverseTest {

    String expected;
    String text;
    String filter;

    public ReverseTest(String expected, String text, String filter) {
        this.expected = expected;
        this.text = text;
        this.filter = filter;
    }

    @Parameterized.Parameters
    public static List<Object[]> str() {

        return Arrays.asList(new Object[][]{
                {"dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl"},
                {"dcba hgfe", "abcd efgh", "xl"},
                {"dcb1a hgfle", "a1bcd efglh", "xl"}
        });
    }

    @Test
    public void makeAnagram() {
        assertEquals(expected, Reverse.makeAnagram(text, filter));
    }

    @Test(expected = NullPointerException.class)
    public void makeAnagramNullFilter() {
        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7", null));
        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh", null));
        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h", ""));
    }

    @Test(expected = NullPointerException.class)
    public void makeAnagramIsEmpty() {
        assertEquals("", Reverse.makeAnagram(null, "xl"));
    }
}


//    public void makeAnagram() {
//
//        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7",""));
//        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh",""));
//        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h",""));
//
//        assertEquals("dexdnimoF oocl 7/42", Reverse.makeAnagram("Foxminded cool 24/7","xl"));
//        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh","xl"));
//        assertEquals("dcb1a hgfle", Reverse.makeAnagram("a1bcd efglh","xl"));
//        assertEquals("dcb1a hgfle", Reverse.makeAnagram("a1bcd efglh","x l"));
// String[] expected = new String[]{"dednimxoF looc 24/7", "dcba hgfe", "d1cba hgf!e", "dexdnimoF oocl 7/42", "dcba hgfe", "dcb1a hgfle"};
//    String[] text = new String[]{"Foxminded cool 24/7", "abcd efgh", "a1bcd efg!h", "Foxminded cool 24/7", "abcd efgh", "a1bcd efglh"};
//
//        assertEquals("", Reverse.makeAnagram("","xl"));
//    }
