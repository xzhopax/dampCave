package com.codewars.kyu7.doubleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleSort {

    public static Object[] dbSort(Object[] a){

        List<Integer> listIntegers = new ArrayList<>();
        List<String> listStrings = new ArrayList<>();
        List<Object> listObjects = new ArrayList<>();
        Object[] result = new Object[a.length];

        for (Object o: a){
            if (o instanceof Integer){
                listIntegers.add((int)o);
            }
            if (o instanceof String){
                listStrings.add((String)o);
            }
        }

        Collections.sort(listIntegers);
        Collections.sort(listStrings);

        listObjects.addAll(listStrings);
        listObjects.addAll(listIntegers);

        for (int i = 0; i < listObjects.size(); i++){
            result[i] = listObjects.get(i);
        }

        return result;
    }

}
