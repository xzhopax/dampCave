package com.hackerrank;

import java.util.Scanner;

public class Solution {
    public static String print(byte b){
        return String.format("%d can be fitted in:\n" +
                "* byte\n" +
                "* short\n" +
                "* int\n" +
                "* long", b);
    }
    public static String print(short b){
        return String.format("%d can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long", b);
    }
    public static String print(int b){
        return String.format("%d can be fitted in:\n" +
                "* int\n" +
                "* long", b);
    }
    public static String print(long b){
        return String.format("%d can be fitted in:\n" +
                "* long", b);
    }
    public static void main(String []argh)
    {




        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(Solution.print(x));
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
