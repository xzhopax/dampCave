package com.codewars.kyu7.guessTheSequence;

import java.util.ArrayList;
import java.util.List;

public class JomoPipi {
    static int[] sequence(int x) {
        List<Integer> listNumbers = new ArrayList<>();
        List<Integer> listSortedNumbers = new ArrayList<>();
        int[] result = new int[x];

        for (int i = 1; i<=x; i++){
            listNumbers.add(i);
        }

            for (int i = 1; i<= x; i++) {
                for (int j : listNumbers){
                    String strNumber = String.valueOf(j);
                    if (Integer.parseInt(String.valueOf(strNumber.charAt(0))) == i ){
                        listSortedNumbers.add(j);
                    }
                }
            }


        for (int i = 0; i < listSortedNumbers.size(); i++){
            result[i] = listSortedNumbers.get(i);
        }

        return result;
    }
}
