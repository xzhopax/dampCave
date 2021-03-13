package com.codewars.kyu7.overTheRoad;

public class Street {
    public static long overTheRoad(long address, long n) {
        long maxHouse;
        long numb;

        if (address % 2 != 0) {
             maxHouse = 2 * n;
             numb = (address / 2) + (address / 2);
             return maxHouse - numb;
        } else
             maxHouse = 2 * n + 1;
             numb = (address / 2) + (address / 2);
             return maxHouse - numb;
    }
}
