package myPackage;

import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        MyTestClass m1 = new MyTestClass();
        System.out.println(Arrays.toString(MyTestClass.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(MyTestClass.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 })));




    }
}
