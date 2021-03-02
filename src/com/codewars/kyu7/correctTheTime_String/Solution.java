package com.codewars.kyu7.correctTheTime_String;



public class Solution {
    private static int hours;
    private static int minutes;
    private static int seconds;

    private static int writeHours(String strNum){
        hours = Integer.parseInt(strNum);
        if (hours > 23){
                while (hours > 23){
                    hours = hours - 24;
                }
        }
       return hours;
    }
    private static int writeMinutes(String strNum){
        minutes = Integer.parseInt(strNum);
        if (minutes > 59){
            while (minutes > 59){
                minutes = minutes - 60;
                if (hours == 23){
                    hours = 0;
                } else  hours++;
            }
        }
        return minutes;
    }
    private static int writeSeconds(String strNum){
        seconds = Integer.parseInt(strNum);
        if (seconds > 59){
            while (seconds > 59){
                seconds = seconds - 60;
                if (minutes == 59) {
                    minutes = 0;
                    if (hours == 23) {
                        hours = 0;
                    } else hours++;
                } else minutes++;
            }
        }
        return seconds;
    }
    private static String writeTime(int h, int m, int s){
        StringBuilder stringBuilder = new StringBuilder();
        if (h == 24){
            stringBuilder.append("00").append(":");
        } else if (h < 10){
            stringBuilder.append("0").append(h).append(":");
        } else stringBuilder.append(h).append(":");
        if (m < 10){
            stringBuilder.append("0").append(m).append(":");
        } else stringBuilder.append(m).append(":");
        if (s < 10){
            stringBuilder.append("0").append(s);
        } else stringBuilder.append(s);

        return stringBuilder.toString();
    }


    public static String timeCorrect(String timestring) {
        if ( timestring == null || !(timestring.matches("\\d{2}:\\d{2}:\\d{2}")) ) {
            return null;
        } else if (!timestring.isEmpty()) {
            String[] splitNumbers = timestring.split(":");

            hours = Solution.writeHours(splitNumbers[0]);
            minutes = Solution.writeMinutes(splitNumbers[1]);
            seconds = Solution.writeSeconds(splitNumbers[2]);
            return Solution.writeTime(hours, minutes, seconds);

        }
        return "";
    }
}
