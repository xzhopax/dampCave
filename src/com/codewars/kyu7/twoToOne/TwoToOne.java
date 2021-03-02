package com.codewars.kyu7.twoToOne;

import java.sql.Array;
import java.util.*;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        StringBuilder stringResult = new StringBuilder();
        List<Character> listChar = new ArrayList<>();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (char c : ch1){
            listChar.add(c);
        }
        for (char c : ch2){
            listChar.add(c);
        }
        Collections.sort(listChar);
        stringResult.append(listChar.get(0));

        for (int i = 1; i < listChar.size(); i++){
            if (!(listChar.get(i).equals(listChar.get(i-1)))){
                stringResult.append(listChar.get(i));
            }
        }

        return stringResult.toString();
    }
}
