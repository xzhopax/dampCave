package testQuestionGetMonth;

import java.util.Map;

public class Month {

    public static void GetMonth (Map<Integer, String > months, int numMonth) { // need add Map months and number month

        if (numMonth < 13 && numMonth > 0) {
            System.out.println(months.get(numMonth));
        } else System.out.println("INCORRECT INPUT DATA");
    } // end GetMonth

}
