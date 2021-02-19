package com.codewars.kyu7.deodorantEvaporator;

public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int count = 0;
        double shutdownThreshold = content * (threshold / 100);
        double result = content;

        while ( result > shutdownThreshold){
            result = result - (result * (evap_per_day / 100));
            count++;
        }

        return count;
    }
}
