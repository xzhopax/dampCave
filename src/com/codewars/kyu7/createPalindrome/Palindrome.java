package com.codewars.kyu7.createPalindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

//    private static List<Character> replacementLetters (char[] ch, List<Character> listCH){
//
//        for (char c : ch) {
//            if (c == 97){
//                listCH.add((char) 122);
//                listCH.add((char) (c+1));
//            } else if (c == 122){
//                listCH.add((char) 97);
//                listCH.add((char) (c-1));
//            } else {
//                listCH.add((char) (c+1));
//                listCH.add((char) (c-1));
//            }
//        }
//        return listCH;
//    }

    private static void endlessСycle(int num){
        int count = 0;
        while (count != num){
            endlessСycle(num);
            count++;
        }
    }

    private static void qwe(int i){



    }



    public static boolean solve(String st) {

        List<String> characterList = new ArrayList<>();
        char[] charSt = st.toCharArray();
        List<StringBuilder> listSB = new ArrayList<>();
        int count = 0;



//        for (int i = 0; i < charSt.length; i++){
//                if (charSt[i] == 97) {
//                    listSB.get(count).append((char) 122);
//                    listSB.get(count+1).append((char) (charSt[i] + 1));
//                    count = count + 2;
//                } else if (charSt[i] == 122) {
//                    listSB.get(count).append((char) 97);
//                    listSB.get(count+1).append((char) (charSt[i] - 1));
//                    count = count + 2;
//                } else {
//                    listSB.get(count).append((char) (charSt[i] + 1));
//                    listSB.get(count+1).append((char) (charSt[i] - 1));
//                    count = count + 2;
//            }
//
//        }
        for (int i = 0; i < 1000; i++){
            listSB.add(new StringBuilder());
        }



                for (int i = 0; i < charSt.length; i++) {
                    int num = 0;

                    for (int j = 0; j < count; j++) {
//                        while (num != count) {
                            if (charSt[i] == 97) {
                                listSB.add(j, listSB.get(count).append(String.valueOf((char) 122)));
                                listSB.add(j + 1, listSB.get(count + 1).append(String.valueOf((char) (charSt[i] + 1))));
                                num = num + 1;

                            } else if (charSt[i] == 122) {
                                listSB.add(j, listSB.get(count).append(String.valueOf((char) 97)));
                                listSB.add(j + 1, listSB.get(count + 1).append(String.valueOf((char) (charSt[i] - 1))));
                                num = num + 1;
                            } else {
                                listSB.add(j, listSB.get(count).append(String.valueOf((char) (charSt[i] + 1))));
                                listSB.add(j + 1, listSB.get(count + 1).append(String.valueOf((char) (charSt[i] - 1))));
                                num = num + 1;
                            }
                        }
                    count = count + 2;

//                    }
                }




        System.out.println(listSB);




//

//        for (int i = 0; i < characterList.size(); i++){
//            for (int j = 0; j < characterList.get(i).toString().length(); j++){
//                int count = characterList.get(i).toString().length()-1;
//                char[] temporaryArray = characterList.get(i).toCharArray();
//                while ( count != -1){
//
//                }
//            }
//        }







        return true;
    }
}
