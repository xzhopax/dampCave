package com.codewars.kyu7.AlternateCapitalization;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String[] capitalize(String s){
        String[] str = new String[2];
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        char[] ch1 = new char[s.length()];

         ch1 = s.toCharArray();

         for (int i = 0; i < ch1.length; i++){
             if(i % 2 == 0) {
                 sb1.append(Character.toUpperCase(ch1[i]));
                 sb2.append(Character.toLowerCase(ch1[i]));
             } else  {
                 sb1.append(Character.toLowerCase(ch1[i]));
                 sb2.append(Character.toUpperCase(ch1[i]));
             }
         }
         str[0] = sb1.toString();
         str[1] = sb2.toString();

        return str;
    }
}
