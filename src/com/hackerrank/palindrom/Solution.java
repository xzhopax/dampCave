package com.hackerrank.palindrom;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag = true;

        for (int i = 0, k = A.length()-1;  i < k ; i++, k--){

            String first = A.substring(i,i+1);
            String second = A.substring(k,k+1);
            flag = first.compareTo(second) == 0;
        }

        System.out.println(flag ? "Yes" : "No");

    }
}
