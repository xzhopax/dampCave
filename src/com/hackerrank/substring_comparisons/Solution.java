package com.hackerrank.substring_comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

            String smallest = "";
            smallest = s.substring(0,k);
            String largest = "";
            largest= s.substring(0,k);

            for (int i = 0; i <= s.length()- k; i++) {
                String str = s.substring(i,k+i);
                smallest = smallest.compareTo(str) > 0 ? str : smallest;
                largest = largest.compareTo(str) < 0 ? str : largest;
            }

            return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}