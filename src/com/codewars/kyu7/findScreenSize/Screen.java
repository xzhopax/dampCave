package com.codewars.kyu7.findScreenSize;

public class Screen {
    public static String findScreenHeight(int width, String ratio) {

        String[] strNumbers = ratio.split(":");
        double height = ((double) width / Integer.parseInt(strNumbers[0])) * Integer.parseInt(strNumbers[1]);

        return String.format("%dx%d", width,(int)height);
    }
}
