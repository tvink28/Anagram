package com.example.tast1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

    @Test
    public void makeAnagram() {
        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7",""));
        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh",""));
        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h",""));

        assertEquals("dexdnimoF oocl 7/42", Reverse.makeAnagram("Foxminded cool 24/7","xl"));
        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh","xl"));
        assertEquals("dcb1a hgfle", Reverse.makeAnagram("a1bcd efglh","xl"));
        assertEquals("dcb1a hgfle", Reverse.makeAnagram("a1bcd efglh","x l"));

        assertEquals("", Reverse.makeAnagram("","xl"));
    }
}