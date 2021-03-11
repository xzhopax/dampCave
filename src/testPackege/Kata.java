package testPackege;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;


public class Kata {

    public static int reverse_bits(int n){
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(),2);
    }
}
