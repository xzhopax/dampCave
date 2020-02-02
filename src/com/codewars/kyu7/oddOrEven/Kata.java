package com.codewars.kyu7.oddOrEven;

public class Kata {
    public static String oddOrEven (int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count = count + array[i];
        }
        if (array.length == 0 || count % 2 == 0) {
            return "even";
        } else return "odd";
    }
}
