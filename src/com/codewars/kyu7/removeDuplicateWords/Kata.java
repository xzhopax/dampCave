package com.codewars.kyu7.removeDuplicateWords;


import java.util.LinkedHashSet;
import java.util.Set;

public class Kata {
    public static String removeDuplicateWords(String s){
        Set<String> str = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String s1 : s.split(" ")){
            str.add(s1);
        }

        for (String s2 : str){
          sb.append(s2).append(" ") ;
        }
        return sb.toString().trim();
    }
}
