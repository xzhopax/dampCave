package com.hackerrank.username_validator;

class UsernameValidator {
    public static String valid (String name){
        if (name.matches(regularExpression)){
            return "VALID";
        } else  return "INVALID";
    }

    public static final String regularExpression = "(^[a-zA-Z])([a-zA-Z\\d_]{7,29})";

    public static void main(String[] args) {
        System.out.println(valid("_fafaw222323"));
        System.out.println(valid("Lost2323"));
        System.out.println(valid("Lost232323Lost232323Lost232323"));
        System.out.println(valid("Lost2323 "));
        System.out.println(valid("Lost2323 s"));
        System.out.println(valid("Lost232323Lost232323Lost2323232"));
        System.out.println(valid("2sadasdad"));
    }
}