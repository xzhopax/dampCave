package com.codewars.kuy6.determineTheDateByTheDayNumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Date {

    private static int getLeapYear(boolean isLeap){
        if (isLeap) return 2012;
        else return  2013;
    }

    public static String getDay(int day, boolean isLeap) {
        String[] months = new String[]{
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        StringBuilder printDate = new StringBuilder();
        Calendar calendar = new GregorianCalendar();

        calendar.set(getLeapYear(isLeap), Calendar.JANUARY,day);

        return printDate.append(months[calendar.get(Calendar.MONTH)])
                        .append(", ")
                        .append(calendar.get(Calendar.DAY_OF_MONTH)).toString();
    }
}
