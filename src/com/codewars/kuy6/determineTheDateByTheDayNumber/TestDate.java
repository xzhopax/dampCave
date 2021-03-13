package com.codewars.kuy6.determineTheDateByTheDayNumber;

public class TestDate {
    public static void main(String[] args) {

        System.out.println( Date.getDay(15, false));
        System.out.println( Date.getDay(59, false));
        System.out.println( Date.getDay(60, true));
        System.out.println( Date.getDay(60, false));

    }
}
