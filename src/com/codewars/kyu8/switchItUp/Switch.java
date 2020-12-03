package com.codewars.kyu8.switchItUp;

public class Switch {
    public static String switchItUp(int number){
        String result;
        switch (number) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return result;
    }
}
