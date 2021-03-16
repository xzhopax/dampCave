package com.codewars.kuy6.rectangleIntoSquares;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {
    private static boolean checkThatWidthNotEqualHeight(int length, int width){
        return length != width;
    }

    private static void whileLengthNotEqualsOneAndWidthNotEqualsOne(List<Integer> list, int length, int width){
        while (length > 1 && width > 1) {
            if (length > width) {
                list.add(width);
                length -= width;
            } else {
                list.add(length);
                width -= length;
            }
        }
    }

    private static void recordingRemainingCells(List<Integer> list, int length, int width){
        if (length == 1) {
            for (int i = 0; i < width; i++){
                list.add(1);
            }
        } else
            for (int i = 0; i < length; i++) {
                list.add(1);
            }
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> saveResult = new ArrayList<>();
        int numberOne = 0;
        int numberTwo = 0;


        if (checkThatWidthNotEqualHeight(lng,wdth)) {
            if (lng != 1 && wdth != 1) {

                whileLengthNotEqualsOneAndWidthNotEqualsOne(saveResult,lng,wdth);

                int count = saveResult.size() - 1;

                while (saveResult.get(saveResult.size() - 1).equals(saveResult.get(count))) {
                    if (saveResult.get(count) < saveResult.get(count - 1)) {
                        numberOne = saveResult.get(count - 1);
                    }
                    numberTwo += saveResult.get(count);
                    count--;

                }

                if ((numberOne - numberTwo) == 1) {
                    int numb = saveResult.get(saveResult.size() - 1);
                    for (int i = 0; i < numb; i++) {
                        saveResult.add(1);
                    }
                }
                return saveResult;
            } else
            recordingRemainingCells(saveResult,lng,wdth);
            return saveResult;
        }
        return null;
    }
}
