package com.example.tast1;

import android.view.View;
import android.widget.EditText;

import java.util.Arrays;
import java.util.Collections;

public class Reverse extends MainActivity{




    public static String makeAnagram(String text, String filter){


            String[] words = text.split("\\s");
            String makeAnagram = "";
            for (String word : words) {
                StringBuilder stringBuilder = new StringBuilder(filter(word,filter));
                makeAnagram += stringBuilder.toString() + " ";
            }

            return makeAnagram.trim();

    }





    public static String filter(String text, String filter) {

        int r = text.length() - 1;
        char[] charsText = text.toCharArray();
        int l = 0;

       // int lenFilter = filter.length() - 1;
        char[] charsFilter = filter.toCharArray();
       // int j = 0;

        if (filter.isEmpty()) {

            while (l < r) {
                char firstCh = text.charAt(l);
                char lastCh = text.charAt(r);

                if (!isAlpha(firstCh)) {
                    l++;
                } else if (!isAlpha(lastCh)) {
                    r--;
                } else {
                    char temp = charsText[l];
                    charsText[l] = charsText[r];
                    charsText[r] = temp;
                    l++;
                    r--;
                }
            }

        } else {

            for (int j = 0; j < filter.length(); j++) {

                 while (l < r) {

                     char firstCh = text.charAt(l);
                     char lastCh = text.charAt(r);

//                     char firstFilter = filter.charAt(j);
//                     char lastFilter = filter.charAt(lenFilter);

                     if (firstCh == charsFilter[j]) {
                         l++;
                     }
                     else if (lastCh == charsFilter[j]) {
                         r--;
                     } else {
                         char temp = charsText[l];
                         charsText[l] = charsText[r];
                         charsText[r] = temp;
                         l++;
                         r--;

                     }

                 }

            }

        }



        return String.copyValueOf(charsText);
    }



    private static boolean isAlpha(char ch) {
        if (ch >= 'a' && ch <= 'z'
                || ch >= 'A' && ch <= 'Z'){
            return true;
        }
        return false;
    }

//    private static boolean isDigit(char ch) {
//        if (ch >= '0' && ch <= '9') {
//            return true;
//        }
//        return false;
//    }

}




//    public static String reverseWord(String str) {
//        String[] words = str.split(" ");
//        String reverseWord = "";
//        int r = words.length - 1, l = 0;
//        while (l < r) {
//            if (!Character.isAlphabetic(l))
//                l++;
//            else if (!Character.isAlphabetic(r))
//                r--;
//            else {
//                for (String w : words) {
//                    StringBuilder sb = new StringBuilder(w);
//                    sb.reverse();
//                    reverseWord += sb.toString()+" ";
//
//                }
//
//            }
//
//        }
//        return reverseWord.trim();
//    }
//}






//    public static void reverse(char[] str) {
//        int r = str.length - 1, l = 0;
//
//        while (l < r) {
//            if (!Character.isAlphabetic(str[l]))
//                l++;
//            else if (!Character.isAlphabetic(str[r]))
//                r--;
//            else {
//                char tmp = str[l];
//                str[l] = str[r];
//                str[r] = tmp;
//                l++;
//                r--;
//            }
//        }
//    }




//public class Reverse {
//    public static String reverseWord(String str){
//        String[] words =str.split("\\s");
//        String reverseWord="";
//        for(String w:words){
//            StringBuilder sb=new StringBuilder(w);
//            sb.reverse();
//            reverseWord+=sb.toString()+" ";
//        }
//        return reverseWord.trim();
//    }
//}