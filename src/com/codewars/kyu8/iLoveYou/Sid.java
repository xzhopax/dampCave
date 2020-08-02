package com.codewars.kyu8.iLoveYou;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] petals = new String[]{"I love you", "a little","a lot",
                "passionately","madly","not at all"};
        if (nb_petals <= 6) {
            return petals[nb_petals - 1];
        } else {
            while (nb_petals > 6) {
                nb_petals = nb_petals - 6;
            } return petals[nb_petals - 1];
        }
    }
}
