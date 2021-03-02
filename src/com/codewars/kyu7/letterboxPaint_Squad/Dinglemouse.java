package com.codewars.kyu7.letterboxPaint_Squad;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {

        int[] countNumbers = new int[10];
        List<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= end; i++){
            int num = i;
            while (num != 0){
                numbers.add(num%10);
                num = num / 10;
            }
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 0) countNumbers[0]++;
            else if (numbers.get(i) == 1) countNumbers[1]++;
            else if (numbers.get(i) == 2) countNumbers[2]++;
            else if (numbers.get(i) == 3) countNumbers[3]++;
            else if (numbers.get(i) == 4) countNumbers[4]++;
            else if (numbers.get(i) == 5) countNumbers[5]++;
            else if (numbers.get(i) == 6) countNumbers[6]++;
            else if (numbers.get(i) == 7) countNumbers[7]++;
            else if (numbers.get(i) == 8) countNumbers[8]++;
            else if (numbers.get(i) == 9) countNumbers[9]++;
        }

        return countNumbers;
    }
}
