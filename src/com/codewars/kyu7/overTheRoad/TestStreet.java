package com.codewars.kyu7.overTheRoad;

public class TestStreet {
    public static void main(String[] args) {

        System.out.println(Street.overTheRoad(1, 3)); //6
        System.out.println(Street.overTheRoad(3, 3)); //4
        System.out.println(Street.overTheRoad(2, 3)); //5
        System.out.println(Street.overTheRoad(3, 5)); //8
        System.out.println(Street.overTheRoad(20, 1000000)); //1999981L
        System.out.println(Street.overTheRoad(23633656673L, 310027696726L)); //596421736780L

    }
}
