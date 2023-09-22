package com.example.tast1;

public class TestObject {

    final String expected;
    final String text;
    final String filter;

    public TestObject(String expected, String text, String filter) {
        this.expected = expected;
        this.text = text;
        this.filter = filter;
    }
}