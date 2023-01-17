package com.example.tast1;

public class Reverse extends MainActivity {


    public static String makeAnagram(String text, String filter) {


        String[] words = text.split("\\s");
        StringBuilder makeAnagram = new StringBuilder();
        for (String word : words) {
            makeAnagram.append(filter(word, filter)).append(" ");
        }

        return makeAnagram.toString().trim();

    }


    public static String filter(String text, String filter) {

        int r = text.length() - 1;
        char[] charsText = text.toCharArray();
        int l = 0;

        while (l < r) {
            if (isFilter(filter, text.charAt(l))) {
                l++;
            } else if (isFilter(filter, text.charAt(r))) {
                r--;
            } else {
                char temp = charsText[l];
                charsText[l] = charsText[r];
                charsText[r] = temp;
                l++;
                r--;
            }
        }


        return new String(charsText);
    }


    private static boolean isFilter(String filter, char ch) {
        if (filter.isEmpty()) {
            return !Character.isLetter(ch);
        } else {
            return filter.indexOf(ch) != -1;
        }
    }
}
