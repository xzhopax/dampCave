package com.hackerrank.systemIn;

import java.util.Scanner;

public class StaticInitializationBlocks {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //breadth
        int B = scanner.nextInt();
        //height
        int H = scanner.nextInt();

        scanner.close();

        if ( B <= 0 || H <=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int result = B * H;
            System.out.println(result);
        }

    }
}
