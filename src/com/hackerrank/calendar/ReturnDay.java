package com.hackerrank.calendar;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ReturnDay {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(year,month -1,day);

        String dayWeek;

        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 1:
                dayWeek="SUNDAY";
                break;
            case 2:
                dayWeek="MONDAY";
                break;
            case 3:
                dayWeek="TUESDAY";
                break;
            case 4:
                dayWeek="WEDNESDAY";
                break;
            case 5:
                dayWeek="THURSDAY";
                break;
            case 6:
                dayWeek="FRIDAY";
                break;
            case 7:
                dayWeek="SATURDAY";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calendar.get(Calendar.DAY_OF_WEEK));
        }

        return  dayWeek;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = ReturnDay.findDay(month, day, year);
        System.out.println( res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
