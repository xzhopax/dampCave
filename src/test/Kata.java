package test;


import java.util.*;

public class Kata {
    public static int sumTriangularNumbers(int n)
    {
        int sum = 0;
        int result = 0;

        for (int i=1; i <= n; i++ ){
            sum += i;
            result = result + sum;
        }


        return result;
    }
}
