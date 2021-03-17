package com.codewars.kyu7.wordsShifter;


import java.util.HashSet;
import java.util.Set;

public class Shifter {
    static int[] decLetters = new int[]{72,73,78,79,83,88,90,77,87};

    public static int count(String st){
        Set<String> setStrings = new HashSet<>();

        String[] arrayStrings = st.split(" ");
        for (String s : arrayStrings){
            int count = 0;
            for (char c: s.toCharArray()){
                for (int i : decLetters){
                    if (i == c) count++;
                }
            }
            if (count != 0 && count == s.length()) setStrings.add(s);
        }
        return setStrings.size();
    }
}
