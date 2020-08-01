package testQuestionSortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("Тихо струится река серебристая");
        str.add("В царстве вечернем зеленой весны.");
        str.add("А царстве вечернем зеленой весны.");
        str.add("Б царстве вечернем зеленой весны.");
        str.add("Солнце садится за горы лесистые.");
        str.add("Рог золотой выплывает луны.");

        Collections.sort(str);

        str.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        }); // end str.sort

        for (String s : str) {
            System.out.printf("(%d): %s\n", s.length(), s);
        } // end for

    }
}
