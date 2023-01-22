package com.example.tast1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
public class ReverseTest {

    ObjectsTest[] test = new ObjectsTest[3];

    public void str(ObjectsTest[] test) {
        test[0] = new ObjectsTest("dexdnimoF oocl 7/42", "Foxminded cool 24/7", "xl");
        test[1] = new ObjectsTest("dcba hgfe", "abcd efgh", "xl");
        test[2] = new ObjectsTest("dcb1a hgfle", "a1bcd efglh", "xl");
    }


    @Test
    public void TestMakeAnagram() {
        for (ObjectsTest objectsTest : test) {
            assertEquals(objectsTest.expected, Reverse.makeAnagram(objectsTest.text, objectsTest.filter));
        }
    }

    @Test
    public void TestMakeAnagramNullFilter() {
        assertEquals("dednimxoF looc 24/7", Reverse.makeAnagram("Foxminded cool 24/7", ""));
        assertEquals("dcba hgfe", Reverse.makeAnagram("abcd efgh", ""));
        assertEquals("d1cba hgf!e", Reverse.makeAnagram("a1bcd efg!h", ""));
    }

    @Test
    public void TestMakeAnagramIsEmpty() {
        assertEquals("", Reverse.makeAnagram("", "xl"));
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
