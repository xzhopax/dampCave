package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(Kata.pipeFix(new int[] {1,2,3,12})));
        System.out.println(Arrays.toString(Kata.pipeFix(new int[] {-92,-102})));
    }
}
