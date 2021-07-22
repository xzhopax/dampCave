package com.codewars.easy;

public class Dinglemouse {
    public static int countYearDog(int year){
        int countYear = 0;
        for (int i = 0; i < year; i++){
            if (i == 0){
                countYear += 15;
            } else if (i == 1){
                countYear += 9;
            } else countYear += 5;
        }
        return countYear;
    }
    public static int countYearCat(int year){
        int countYear = 0;
        for (int i = 0; i < year; i++){
            if (i == 0){
                countYear += 15;
            } else if (i == 1){
                countYear += 9;
            } else countYear += 4;
        }
        return countYear;
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        return new int[]{humanYears,Dinglemouse.countYearCat(humanYears),Dinglemouse.countYearDog(humanYears)};
    }
}
