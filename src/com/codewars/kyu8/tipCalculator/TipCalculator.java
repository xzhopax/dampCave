package com.codewars.kyu8.tipCalculator;

import java.util.HashMap;
import java.util.Map;

public class TipCalculator {

    private static final HashMap<String, Double> percent = new HashMap<>();

    public static Integer calculateTip(double amount, String rating) {
        percent.put("terrible", 0.0);
        percent.put("poor", 0.05);
        percent.put("good", 0.1);
        percent.put("great", 0.15);
        percent.put("excellent", 0.20);

        for (Map.Entry<String,Double> entry : percent.entrySet()) {
            if (entry.getKey().contains(rating.toLowerCase())) {
                return (int)Math.ceil(amount * entry.getValue());
            }
        }
        return null;
    }
}
