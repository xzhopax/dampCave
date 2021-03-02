package com.codewars.kyu7.simpleConsecutivePairs;

public class Pair {

    public static int solve(int [] arr){
        int countPairs = 0;

        for (int i = 0; i < arr.length - 1; i = i+2){
                if (arr[i] == (arr[i+1] - 1) || arr[i] == (arr[i+1] + 1)) {
                    countPairs++;
                }
        }

        return countPairs;
    }

}
