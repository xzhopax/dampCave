package com.codewars.kuy6.detectPangram;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PangramChecker {

   static final Map<String, Integer> count = new HashMap<>();

    public static Map<String, Integer> alphabet(){

            count.put("a",0);
            count.put("b",0);
            count.put("c",0);
            count.put("d",0);
            count.put("e",0);
            count.put("f",0);
            count.put("g",0);
            count.put("h",0);
            count.put("i",0);
            count.put("j",0);
            count.put("k",0);
            count.put("l",0);
            count.put("m",0);
            count.put("n",0);
            count.put("o",0);
            count.put("p",0);
            count.put("q",0);
            count.put("r",0);
            count.put("s",0);
            count.put("t",0);
            count.put("u",0);
            count.put("v",0);
            count.put("w",0);
            count.put("x",0);
            count.put("y",0);
            count.put("z",0);

        return count;
    }



    public boolean check(String sentence){
        if (sentence.length() < 26){
            return false;
        }
        alphabet();

        char[] arrString = sentence.toLowerCase(Locale.ROOT).toCharArray();

        for (char ch : arrString){
            for (Map.Entry<String,Integer> entry: count.entrySet()){
                if (entry.getKey().charAt(0) == ch){
                    entry.setValue(1);
                }
            }
        }

        return !count.containsValue(0);
    }
}