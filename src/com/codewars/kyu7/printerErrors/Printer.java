package com.codewars.kyu7.printerErrors;

public class Printer {
    public static String printerError(String s) {
        char[] arrayChars = s.toCharArray();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch > 109 || ch < 97){
                count++;
            }
        }
        return String.format("%d/%d", count,arrayChars.length);
    }
}
