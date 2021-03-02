package testPackege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dinglemouse {


    public static String solve(String s, int k) {


        char[] arrayLettersString = s.toCharArray();
        List<Character> characterList = new ArrayList<>();
        List<Character> resultCharLetter = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : arrayLettersString) {
            characterList.add(c);
        }
        Arrays.sort(arrayLettersString);
        for (int i = k; i < arrayLettersString.length; i++){
            resultCharLetter.add(arrayLettersString[i]);
        }

        for (int i = characterList.size()-1; i != -1  ; i--){
            for (int j = 0; j < resultCharLetter.size(); j++){
                if (characterList.get(i) == resultCharLetter.get(j)){
                    sb.append(characterList.get(i));
                    resultCharLetter.remove(j);
                    break;
                }
            }
        }
        return sb.reverse().toString();
    }
}
