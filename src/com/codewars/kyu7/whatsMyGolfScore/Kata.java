package com.codewars.kyu7.whatsMyGolfScore;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int golfScoreCalculator(String parList, String scoreList) {
        List<String> par = new ArrayList<>();
        List<String> score = new ArrayList<>();
        int total = 0;
        char[] ch1 = parList.toCharArray();
        char[] ch2 = scoreList.toCharArray();

        for (char c : ch1) {
                par.add(String.valueOf(c));
        }
        for (char c : ch2){
            score.add(String.valueOf(c));
        }
        for (int i = 0; i < par.size(); i++){
            total = total + (Integer.parseInt(score.get(i)) - Integer.parseInt(par.get(i)));
        }
        return total;
    }
}
