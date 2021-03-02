package com.codewars.kyu8.howManyStairsWillSuzukiClimbIn20Years;

public class Stair {

    public static long stairsIn20(int[][] stairs){
        long countStairs = 0;

        for (int[] weekday : stairs){
            for (int day : weekday){
                countStairs = countStairs + day;
            }
        }

        return countStairs * 20;
    }

}
