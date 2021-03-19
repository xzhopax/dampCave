package com.codewars.kyu7.statusArrays;

import java.util.Map;
import java.util.TreeMap;

public class Rays {

    public static int[] status(int[] nums){
        int[] resultPosition = new int[nums.length];
        Map<Double, Integer> map = new TreeMap<>();
        int numb = 0;

        for (int i = 0; i< nums.length; i++){
            double position;
            int count = 0;
            double iterNum = 0;
            for (int j = 0; j < nums.length; j++){
                if (j != i && nums[i] > nums[j]){
                    count++;
                }
            }
            position = i + count;
            if (map.containsKey(position)){
                while (map.containsKey(position)) {
                  position += iterNum += 0.1;
                }
            }
            map.put(position ,nums[i]);
        }

        for (Map.Entry<Double,Integer> entry : map.entrySet()){
            resultPosition[numb] = entry.getValue();
            numb++;
        }

        return resultPosition;
    }
}
