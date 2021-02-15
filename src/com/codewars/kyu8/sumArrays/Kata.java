package com.codewars.kyu8.sumArrays;

public class Kata {
    public static double sum(double[] numbers) {
        double count = 0.0;

        for (double i : numbers){
            count = count + i;
        }
        return count;
    }
}
