package com.codewars.kyu8.reversedWords;

import java.lang.reflect.Array;
import java.util.*;

public class ReverseWords {

    public static String reverseWords(String str){
        //write your code here...
        String[] revers = str.split(" ");
        StringBuilder sb = new StringBuilder();
        Collections.reverse(Arrays.asList(revers));
        for (int i = 0; i < revers.length; i++) {
            sb.append(revers[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
