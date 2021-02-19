package com.codewars.kuy6.helpTheBookseller;

import java.util.HashMap;
import java.util.Map;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
       Map<String, Integer> countMap = new HashMap<>();
       int[] count = new int[lstOf1stLetter.length];
       StringBuilder result = new StringBuilder();

       if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
           return "";
       } else
        for (String str : lstOfArt){
            countMap.put(str.replaceAll("\\d","").trim(),
                            Integer.parseInt(str.replaceAll("\\D","")));
        }

        for (Map.Entry<String,Integer> entry : countMap.entrySet()) {

            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (entry.getKey().charAt(0) == lstOf1stLetter[i].charAt(0)){
                    count[i] = count[i]+entry.getValue();
                }
            }
        }

        for(int i = 0; i < lstOf1stLetter.length; i++){
            if (i == lstOf1stLetter.length - 1) {
                result.append("(").append(lstOf1stLetter[i]).append(" : ").append(count[i]).append(")");
            } else result.append("(").append(lstOf1stLetter[i]).append(" : ").append(count[i]).append(")").append(" - ");
        }

        return result.toString();
    }
}
