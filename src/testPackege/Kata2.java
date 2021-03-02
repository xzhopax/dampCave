package testPackege;

import java.util.*;

public class Kata2 {
    public static int sortDesc(final int num) {
        List<Integer> listInteger =  new ArrayList<>();
        int saveNumber = num;
        StringBuilder sb = new StringBuilder();

        if (num > 0) {
            while (saveNumber != 0) {
                listInteger.add(saveNumber % 10);
                saveNumber /= 10;
            }
            Collections.sort(listInteger);
            Collections.reverse(listInteger);

            for (int i : listInteger) {
                sb.append(i);
            }

            return Integer.parseInt(sb.toString());
        } else return 0;
    }
}
