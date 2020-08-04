package com.codewars.kyu8.areaOfASquare;

import java.text.DecimalFormat;
import java.util.Map;

public class Geometry {
    public static double squareArea(double a){
        double circumference = a * 4;
        double arcLength = circumference / (Math.PI * 2);
        double theAreaOfASquare = arcLength * arcLength;
        String str = String.format("%.2f",theAreaOfASquare);
        str=str.replace(',','.');
        return Double.parseDouble(str);
    }
}
