package com.codewars.kyu8.how_old_will_I_be_in_2099;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        // TODO: your code here

        return birth < yearTo & yearTo - birth == 1 ? "You are " + (yearTo - birth) + " year old.":
               birth < yearTo ? "You are " + (yearTo - birth) + " years old.":
               birth > yearTo & birth - yearTo == 1 ? "You will be born in " + (birth - yearTo) + " year." :
               birth > yearTo ? "You will be born in " + (birth - yearTo) + " years." :
               "You were born this very year!";

    }
}
