package testQuestionSortList;

import java.util.*;

public class TestSort {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Тихо струится река серебристая");
//        list.add("В царстве вечернем зеленой весны.");
//        list.add("А царстве вечернем зеленой весны.");
//        list.add("Б царстве вечернем зеленой весны.");
//        list.add("Солнце садится за горы лесистые.");
//        list.add("Рог золотой выплывает луны.");

        List<String> list = Arrays.asList("Тихо струится река серебристая", "В царстве вечернем зеленой весны.",
                "А царстве вечернем зеленой весны.", "Б царстве вечернем зеленой весны.",
                "Солнце садится за горы лесистые.", "Рог золотой выплывает луны.");

        Collections.sort(list);

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()) {
//                    return o1.compareTo(o2);
//                }
//                return o1.length() - o2.length();
//            }
//        }); // end str.sort

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();

        }); // end list.sort

//        for (String s : list) {
//            System.out.printf("(%d): %s\n", s.length(), s);
//        } // end for

        list.forEach(s -> System.out.printf("(%d): %s\n", s.length(), s));
    }
}
