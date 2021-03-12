package testPackege;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

//        if (current.matches(RED)) return GREEN;
//        if (current.matches(YELLOW)) return RED;
//        if (current.matches(GREEN)) return YELLOW;


public class Kata {

    public static String updateLight(String current) {
        String GREEN ="green";
        String YELLOW ="yellow";
        String RED ="red";

        return current.matches(RED) ? GREEN
                : current.matches(YELLOW) ? RED
                : YELLOW;
    }

}
