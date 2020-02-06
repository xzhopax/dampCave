package com.codewars.kyu8.takeTheFirstNElements;

public class Main {
    public static void main(String[] args) {

        System.out.println((Kata.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
        System.out.println(Kata.take(new int[]{0, 1, 2, -3, 5, 8, 20, 50}, 20));
        System.out.println(Kata.take(new int[0], 0));
    }
}
