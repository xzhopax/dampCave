package com.codewars.kyu7.unluckyDays;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDay {
    public static int unluckyDays(int year) {
        LocalDate incomingDate = LocalDate.of(year, 1,1);
        int count = 0;

        while (incomingDate.getYear() != year + 1 ) {
            if  (incomingDate.getDayOfWeek() == DayOfWeek.FRIDAY && incomingDate.getDayOfMonth() == 13){
                count++;
            }
            incomingDate = incomingDate.plusDays(1);
        }
        return count;
    }
}
