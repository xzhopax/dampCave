package test;


import java.util.*;

public class Kata {

    public static int[] pipeFix(int[] numbers) {

        Set<Integer> num = new HashSet<Integer>();
        int start = numbers[0];
        int finish = numbers [numbers.length - 1];
        int count = 0;

        if (start < finish) {
            while (!(start > finish)) {
                num.add(start);
                start = start + 1;
            }
        } else {
            while (start >= finish) {
                num.add(start);
                start--;
            }
        }

        List<Integer> list = new ArrayList<Integer>(num);
        Collections.sort(list);
        if (list.get(list.size()-1) < 0 ) {
            Collections.reverse(list);
        }

        int[] result = new int[list.size()];
        for (Integer i : list){
            result[count] = i;
            count++;
        }

        return result;
    }

    }
