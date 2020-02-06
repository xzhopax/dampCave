package com.codewars.kyu8.сonvertNumberToReversedArrayOfDigits;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] digitize(long n) {
        List<Integer> list = new ArrayList<>();

            while (!(n == 0)) {
                list.add((int) (n % 10));
                n = n / 10;
            }
        int[] result = new int[list.size()];
        for (int i = 0; i <list.size(); i++ ) {
            result[i] = list.get(i);
        }
        return result;
    }
}
