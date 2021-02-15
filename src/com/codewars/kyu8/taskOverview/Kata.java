package com.codewars.kyu8.taskOverview;

public class Kata {
    public static int toBinary(int n) {
       String toBinaryString = Integer.toBinaryString(n);
        return Integer.parseInt(toBinaryString);
    }
}
