package com.codewars.kyu8.takeTheFirstNElements;

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static int[] take(int[] arr, int n) {
        if ( n == 0 || arr.length == 0){
            return new int[0];
        } else if ( n > arr.length){
            n = arr.length;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        System.out.println(Arrays.toString(result));

        return result;
     }
    }
