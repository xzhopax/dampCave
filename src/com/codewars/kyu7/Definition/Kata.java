package com.codewars.kyu7.Definition;

import java.util.ArrayList;
import java.util.List;

public class Kata extends Exception {

    public static String jumpingNumber(int number) {
        List<Integer> list = new ArrayList<>();
        int num;

        while (number > 0) {
            num = number % 10;
            list.add(num);
            number = (int) (number * 0.1);
        }
        num = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i) + 1) == num || (list.get(i) - 1) == num) {
                num = list.get(i);
            } else return "Not!!";
        }
        return "Jumping!!";

    }
}

