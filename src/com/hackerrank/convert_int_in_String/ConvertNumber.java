package com.hackerrank.convert_int_in_String;

import java.util.Scanner;

public class ConvertNumber {
    public static String convertNumberInString(int number){
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        scanner.close();

        if (number <= 100000 && number >= -100000){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
