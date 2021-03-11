package com.codewars.kuy6.romanNumeralsEncoder;

import java.util.*;

public class Conversion {

    Map<Integer,String> thousands = new TreeMap<>();
    Map<Integer,String> hundreds = new TreeMap<>();
    Map<Integer,String> tens = new TreeMap<>();
    Map<Integer,String> ones = new TreeMap<>();
    {
        thousands.put(0,"");
        thousands.put(1,"M");

        hundreds.put(0,"");
        hundreds.put(1,"C");
        hundreds.put(2,"CC");
        hundreds.put(3,"CCC");
        hundreds.put(4,"CD");
        hundreds.put(5,"D");
        hundreds.put(6,"DC");
        hundreds.put(7,"DCC");
        hundreds.put(8,"DCCC");
        hundreds.put(9,"CM");

        tens.put(0,"");
        tens.put(1,"X");
        tens.put(2,"XX");
        tens.put(3,"XXX");
        tens.put(4,"XL");
        tens.put(5,"L");
        tens.put(6,"LX");
        tens.put(7,"LXX");
        tens.put(8,"LXXX");
        tens.put(9,"XC");

        ones.put(0,"");
        ones.put(1,"I");
        ones.put(2,"II");
        ones.put(3,"III");
        ones.put(4,"IV");
        ones.put(5,"V");
        ones.put(6,"VI");
        ones.put(7,"VII");
        ones.put(8,"VIII");
        ones.put(9,"IX");
    }
    private int getInteger(char ch){ //преобразование char в int
        return Integer.parseInt(String.valueOf(ch));
    }

    private StringBuilder gettingThousands (char chNumber){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < getInteger(chNumber); i++){
            sb.append(thousands.get(1));
        }
        return sb;
    }

    public String solution(int n) {
        char[] arrayNumberChar = String.valueOf(n).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        switch (arrayNumberChar.length){
            case 4:
                stringBuilder.append(gettingThousands(arrayNumberChar[0]));
                stringBuilder.append(hundreds.get(getInteger(arrayNumberChar[1])));
                stringBuilder.append(tens.get(getInteger(arrayNumberChar[2])));
                stringBuilder.append(ones.get(getInteger(arrayNumberChar[3])));
                break;
            case 3:
                stringBuilder.append(hundreds.get(getInteger(arrayNumberChar[0])));
                stringBuilder.append(tens.get(getInteger(arrayNumberChar[1])));
                stringBuilder.append(ones.get(getInteger(arrayNumberChar[2])));
                break;
            case 2:
                stringBuilder.append(tens.get(getInteger(arrayNumberChar[0])));
                stringBuilder.append(ones.get(getInteger(arrayNumberChar[1])));
                break;
            case 1:
                stringBuilder.append(ones.get(getInteger(arrayNumberChar[0])));
        }

        return stringBuilder.toString();
    }

}
