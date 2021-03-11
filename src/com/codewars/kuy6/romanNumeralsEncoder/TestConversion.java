package com.codewars.kuy6.romanNumeralsEncoder;

public class TestConversion {
    public static void main(String[] args) {
//        char c = '1';
//        int i = Integer.parseInt(String.valueOf(c));
//        System.out.println(i);

        Conversion conversion = new Conversion();

        System.out.println(conversion.solution(1));
        System.out.println(conversion.solution(4));
        System.out.println(conversion.solution(6));
        System.out.println(conversion.solution(40));
        System.out.println(conversion.solution(70));
        System.out.println(conversion.solution(110));
        System.out.println(conversion.solution(756));
        System.out.println(conversion.solution(900));
        System.out.println(conversion.solution(2014));

    }
}
