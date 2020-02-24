package com.codewars.kyu7.stringEndsWith;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.solution("abc", "bc"));
        System.out.println(Kata.solution("expected", "actual"));
        System.out.println(Kata.solution("expected", "ed"));
        System.out.println(Kata.solution("expected", "xpected"));
        System.out.println(Kata.solution("expected", "expected"));
        System.out.println(Kata.solution("expected", ""));
        System.out.println(Kata.solution("", "expected"));
    }
}
