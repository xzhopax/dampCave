package com.hackerrank.string_introdaction;
import java.io.*;
import java.util.*;

public class Solution {
    public static String firstUpperCase(String str){
        String firstUpperCase = "";
        if (str.length() > 1) {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    firstUpperCase = firstUpperCase + str.substring(i, i + 1).toUpperCase();
                } else {
                    firstUpperCase = firstUpperCase + str.charAt(i);
                }
            }
        } else {
            firstUpperCase = firstUpperCase + str.substring(0, 1).toUpperCase();
        }

        return firstUpperCase;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        String firstUpperCase = Solution.firstUpperCase(A);
        String secondUpperCase = Solution.firstUpperCase(B);

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));



    }
}

