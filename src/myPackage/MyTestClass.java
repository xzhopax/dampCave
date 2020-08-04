package myPackage;


import java.util.*;
import java.util.stream.Collectors;

public class MyTestClass {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25) {
            return "Normal";
        } else if (bmi <= 30){
            return "Overweight";
        }else return "Obese";
    }
}
