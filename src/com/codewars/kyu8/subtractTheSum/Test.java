package com.codewars.kyu8.subtractTheSum;

public class Test {
    public static void main(String[] args) {
        int num = 145;
        int number;
        int result = 0;
        while (num != 0) {
           number =  num % 10;
           num =  number;
           result = result + number;
        }
        System.out.println(result);
    }
}
