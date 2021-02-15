package com.codewars.kyu8.convertBooleanValuesToStrings;

import java.util.ArrayList;
import java.util.List;

public class YesOrNo {

    public static String boolToWord(boolean b){
//        List<String> listYesOrNo = new ArrayList<>();
//        listYesOrNo.add("Yes");
//        listYesOrNo.add("No");
//
//        if (b){
//            return listYesOrNo.get(0);
//        }else return listYesOrNo.get(1);

        return b ? "Yes" : "No";

    }
}
