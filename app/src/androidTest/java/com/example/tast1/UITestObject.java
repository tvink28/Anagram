package com.example.tast1;

public class UITestObject {

    final String expected;
    final String text;
    final String filter;

    public UITestObject(String expected, String text, String filter) {
        this.expected = expected;
        this.text = text;
        this.filter = filter;
    }
}
