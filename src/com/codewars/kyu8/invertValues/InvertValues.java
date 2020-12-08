package com.codewars.kyu8.invertValues;

public class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * (-1);
        }
        return array;
    }
}
