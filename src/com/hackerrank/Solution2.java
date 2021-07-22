package com.hackerrank;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        while (sc.hasNextLine()) {
            System.out.println(counter + " " + sc.nextLine());
            counter++;
        }
    }
}
