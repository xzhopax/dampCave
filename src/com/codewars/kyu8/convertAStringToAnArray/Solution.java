package com.codewars.kyu8.convertAStringToAnArray;

import java.lang.reflect.Array;

public class Solution {
    public static String[] stringToArray(String s) {
        String[] arrStr = new String[s.length()];
        arrStr = s.split(" ");
        return arrStr;
    }
}
