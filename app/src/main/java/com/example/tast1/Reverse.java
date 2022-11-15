package com.example.tast1;

import android.view.View;
import android.widget.EditText;

public class Reverse {
        public static String reverseWord(String str){
        String[] words =str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
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

