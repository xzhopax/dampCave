package com.codewars.kyu8.multiplicationTableForNumber;

public class Kata {
    public static String multiTable(int num) {

        int result = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 11; i++) {
            if (i != 10) {
                result = i * num;
                str.append(String.format("%d * %d = %d\n", i, num, result));
            } else {
                result = i * num;
                str.append(String.format("%d * %d = %d", i, num, result));
            }
        }
        return str.toString();
    }
}
