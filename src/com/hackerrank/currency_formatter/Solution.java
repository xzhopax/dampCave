package com.hackerrank.currency_formatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    //works only in 8 versions, in 15 does not work

    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India.*/
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
            System.out.println("US: "     + us.format(payment));
            System.out.println("India: "  + india.format(payment));
            System.out.println("China: "  + china.format(payment));
            System.out.println("France: " + france.format(payment));
        } catch (Exception e) {
            System.out.println("works only in 8 versions, in 15 does not work");
        }
    }
}