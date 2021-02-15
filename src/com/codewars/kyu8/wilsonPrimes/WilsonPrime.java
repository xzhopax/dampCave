package com.codewars.kyu8.wilsonPrimes;



public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        int[] arrayWilsonPrimes = new int[]{5,13,563};

        for (int arrayWilsonPrime : arrayWilsonPrimes) {
            if (n == arrayWilsonPrime) {
                return true;
            }
        }
        return false;
    }
}
