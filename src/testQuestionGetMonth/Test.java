package testQuestionGetMonth;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {



        Map<Integer, String> mounth = new HashMap<>();

        mounth.put(1, "Я-Н-В-А-Р-Ь");
        mounth.put(2, "Ф-Е-В-Р-А-Л-Ь");
        mounth.put(3, "М-А-Р-Т");
        mounth.put(4, "А-П-Р-Е-Л-Ь");
        mounth.put(5, "М-А-Й");
        mounth.put(6, "И-Ю-Н-Ь");
        mounth.put(7, "И-Ю-Л-Ь");
        mounth.put(8, "А-В-Г-У-С-Т");
        mounth.put(9, "С-Е-Н-Т-Я-Б-Р-Ь");
        mounth.put(10, "О-К-Т-Я-Б-Р-Ь");
        mounth.put(11, "Н-О-Я-Б-Р-Ь");
        mounth.put(12, "Д-Е-К-А-Б-Р-Ь");

        Month.GetMonth(mounth, 10);
        Month.GetMonth(mounth, 0);
        Month.GetMonth(mounth, -10);
        Month.GetMonth(mounth, 13);
        Month.GetMonth(mounth, 4);
    }
}
