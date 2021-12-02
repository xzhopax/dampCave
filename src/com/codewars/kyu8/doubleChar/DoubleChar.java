package com.codewars.kyu8.doubleChar;

public class DoubleChar {
    public static String doubleChar(String s){
        StringBuilder getDoubleString = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            getDoubleString.append(s.charAt(i));
            getDoubleString.append(s.charAt(i));
        }
        return getDoubleString.toString();
    }
}
