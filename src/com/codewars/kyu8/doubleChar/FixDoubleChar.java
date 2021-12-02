package com.codewars.kyu8.doubleChar;

public class FixDoubleChar {
    public static String doubleChar(String s){
        StringBuilder getString = new StringBuilder();
        getString.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != getString.charAt(getString.length() - 1)){
                getString.append(s.charAt(i));
            }
        }
        return getString.toString();
    }
}
