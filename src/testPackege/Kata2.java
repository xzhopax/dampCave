package testPackege;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static String alphabetWar(String fight){
        int leftCount = 0;
        int rightCount = 0;
        Map<Character, Integer> left = new HashMap<Character, Integer>();
        Map<Character, Integer> right = new HashMap<Character, Integer>();
        left.put('w', 4);
        left.put('p', 3);
        left.put('b', 2);
        left.put('s', 1);
        right.put('m', 4);
        right.put('q', 3);
        right.put('d', 2);
        right.put('z', 1);

        for (char ch: fight.toCharArray()){
            if (left.containsKey(ch)){
                leftCount = leftCount + left.get(ch);
            }
            if (right.containsKey(ch)){
                rightCount = rightCount + right.get(ch);
            }
        }
        if (leftCount > rightCount){
            return "Left side wins!";
        } else if (rightCount > leftCount){
            return "Right side wins!";
        } else
            return "Let's fight again!";
    }
}
