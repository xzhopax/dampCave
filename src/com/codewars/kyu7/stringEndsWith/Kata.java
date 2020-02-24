package com.codewars.kyu7.stringEndsWith;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (!(str.isEmpty()|| ending.length() > str.length())){
       if (str.substring(str.length() - ending.length()).contains(ending)) {
           return true;
       } else return false;
        } else return false;
    }

    // оказывается был метод проще ... return str.endsWith(ending);
}
