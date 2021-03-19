package com.codewars.kyu7.movesSquaredStrings;


import java.util.function.Function;

public class Opstrings {

    public static String vertMirror (String strng) {
        String[] arrStr = strng.split("\n");

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < arrStr.length; i++){
            StringBuilder reverseString = new StringBuilder();
            reverseString.append(arrStr[i]).reverse();
            if (i == arrStr.length - 1) resultString.append(reverseString);
            else resultString.append(reverseString).append("\n");
        }

       return resultString.toString();
    }
    public static String horMirror (String strng) {
        String[] arrStr = strng.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = arrStr.length - 1; i > -1; i--) {
            if (i == 0){
                sb.append(arrStr[i]);
            } else
            sb.append(arrStr[i]).append("\n");
        }
        return sb.toString();
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
