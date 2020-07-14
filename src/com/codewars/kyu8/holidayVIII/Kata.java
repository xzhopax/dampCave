package com.codewars.kyu8.holidayVIII;

public class Kata {
    public static int dutyFree(int normPrice, int discount, int hol) {
    return (int)(hol/(normPrice*((double)discount/100)));
    }
}
