package myPackage;


import java.util.*;
import java.util.stream.Collectors;

public class MyTestClass {
    public static int[] mergeArrays(int[] first, int[] second) {
        List<Integer> list = new ArrayList<>(new HashSet<>());

        for (int mas : first){ // add first in list
            list.add(mas);
        }

        for (int mas : second){ // add second in list
            list.add(mas);
        }

        Collections.sort(list); // sort list
        list = list.stream().distinct().collect(Collectors.toList()); // delete double


        int[] result = new int[list.size()]; // create array (result)
        for (int i = 0; i < list.size(); i ++) { // copy list in result
            result[i] = list.get(i);
        }

        return result;
    }
}
