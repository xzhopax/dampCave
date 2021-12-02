package com.codewars.kyu8.allStarCodeChallenge18;

import com.codewars.kyu8.how_old_will_I_be_in_2099.AgeDiff;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(AgeDiff.CalculateAge(2012, 2016));
        System.out.println(AgeDiff.CalculateAge(1989, 2016));
        System.out.println(AgeDiff.CalculateAge(2011, 2012));
        System.out.println(AgeDiff.CalculateAge(2000, 1999));
        System.out.println(AgeDiff.CalculateAge(2010, 1900));
        System.out.println(AgeDiff.CalculateAge(2010, 1500));
        System.out.println(AgeDiff.CalculateAge(3400, 3400));
    }
}
