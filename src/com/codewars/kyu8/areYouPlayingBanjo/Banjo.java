package com.codewars.kyu8.areYouPlayingBanjo;

import java.util.regex.Pattern;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.matches("[rR].*")) {
            return String.format("%s plays banjo", name);
        } else
        return String.format("%s does not play banjo", name);
    }
}
