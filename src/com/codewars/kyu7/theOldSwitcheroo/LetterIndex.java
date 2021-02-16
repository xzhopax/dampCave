package com.codewars.kyu7.theOldSwitcheroo;

import java.util.ArrayList;
import java.util.List;


public class LetterIndex {

    public static String vowel2Index(String s) {
        List<Character> listVowels = new ArrayList<>();
        listVowels.add('a');
        listVowels.add('e');
        listVowels.add('i');
        listVowels.add('o');
        listVowels.add('u');

        StringBuilder indexString = new StringBuilder();

        boolean isFlag = false;

        for (int i = 0; i < s.length() ; i++){
            isFlag=false;
            for ( char ch : listVowels){
                if (ch == s.charAt(i)){
                    indexString.append((i+1));
                    isFlag=true;
                }
            }
            if (!isFlag){
                indexString.append(s.charAt(i));
            }
        }
        return indexString.toString();
    }
}
