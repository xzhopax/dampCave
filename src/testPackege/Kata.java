package testPackege;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;


public class Kata {

    public static String dateNbDays(double a0, double a, double p) {
        int count = 0;

        while ( a0 < a){
            count++;
            a0 = a0 + (a0 * (p / 36000));
        }

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.set(2016, 00,01 + count);

        return dateFormat.format(calendar.getTime());
    }


}
