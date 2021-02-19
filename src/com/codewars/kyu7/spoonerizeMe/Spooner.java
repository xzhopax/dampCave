package com.codewars.kyu7.spoonerizeMe;

public class Spooner {
    String[] arrayWords;
    Character firstLetterInFirstWord ;
    Character firstLetterInSecondWord ;
    String firstWord;
    String secondWord;

    public String spoonerize(String words) {
        String[] word = words.split(" ");
        return String.format("%s %s",word[1].charAt(0) + word[0].substring(1),
                word[0].charAt(0) + word[1].substring(1));

    }
}
