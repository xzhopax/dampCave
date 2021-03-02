package com.codewars.kyu7.correctTheTime_String;

public class TestTime {
    public static void main(String[] args) {

        System.out.println(Solution.timeCorrect(""));
        System.out.println(Solution.timeCorrect(null));
        System.out.println(Solution.timeCorrect("11:70:10")); //"12:10:10"
        System.out.println(Solution.timeCorrect("19:99:09")); //"20:39:09"
        System.out.println(Solution.timeCorrect("24:01:01")); //"00:01:01"
        System.out.println(Solution.timeCorrect("24:60:60")); // 01:01:00
        System.out.println(Solution.timeCorrect("23:00:00")); // 23:00:00
        System.out.println(Solution.timeCorrect("25:00:00")); // 01:00:00
        System.out.println(Solution.timeCorrect("24:60:00")); // 01:00:00
        System.out.println(Solution.timeCorrect("47:59:60")); // 00:00:00

    }
}
