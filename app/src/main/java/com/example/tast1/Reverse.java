package com.example.tast1;

import android.view.View;
import android.widget.EditText;

public class Reverse {
    public static void reverse(char[] str) {
        int r = str.length - 1, l = 0;

        while (l < r) {
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}