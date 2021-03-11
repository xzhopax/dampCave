package testPackege;

import java.util.*;

//1 Imperial Gallon = 4.54609188 litres
// 1 Mile = 1.609344 kilometres

public class Kata2 {
    public static float mpgToKPM(final float mpg) {

        double km = mpg * 1.609344;
        double litres = km / 4.54609188;

        return Float.parseFloat(String.format("%.2f",litres).replace(",","."));

    }
}
