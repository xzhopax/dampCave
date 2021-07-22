package com.codewars.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        List<Integer> list = new ArrayList<>();

        for (int i = a, j = 0; i <= b; i++, j++){
           list.add(i);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
