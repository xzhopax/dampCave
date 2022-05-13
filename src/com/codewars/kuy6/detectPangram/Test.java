package com.codewars.kuy6.detectPangram;

public class Test {
    public static void main(String[] args) {
        PangramChecker checker = new PangramChecker();

        System.out.println(checker.check("The quick brown fox jumps over the lazy dog."));
        System.out.println(checker.check("The quick brown fox jumps over the lazy."));
        System.out.println(checker.check("You shall not pass!"));
    }
}
