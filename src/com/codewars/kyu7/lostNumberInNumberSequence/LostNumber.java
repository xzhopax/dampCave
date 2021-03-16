package com.codewars.kyu7.lostNumberInNumberSequence;

public class LostNumber {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        int one = 0;
        int two = 0;

        for (int i : arr){
            one += i;
        }
        for (int i : mixedArr){
            two += i;
        }

        return (arr.length == 0)? 0 : one-two;
    }
}
