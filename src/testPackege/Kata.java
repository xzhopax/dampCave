package testPackege;

import java.util.HashMap;
import java.util.Map;

public class Kata {


    public static String position(char alphabet){
        Map<Character, String> alphabetMap = new HashMap<>();
        alphabetMap.put('a',"Position of alphabet: 1");
        alphabetMap.put('b',"Position of alphabet: 2");
        alphabetMap.put('c',"Position of alphabet: 3");
        alphabetMap.put('d',"Position of alphabet: 4");
        alphabetMap.put('e',"Position of alphabet: 5");
        alphabetMap.put('f',"Position of alphabet: 6");
        alphabetMap.put('g',"Position of alphabet: 7");
        alphabetMap.put('h',"Position of alphabet: 8");
        alphabetMap.put('i',"Position of alphabet: 9");
        alphabetMap.put('j',"Position of alphabet: 10");
        alphabetMap.put('k',"Position of alphabet: 11");
        alphabetMap.put('l',"Position of alphabet: 12");
        alphabetMap.put('m',"Position of alphabet: 13");
        alphabetMap.put('n',"Position of alphabet: 14");
        alphabetMap.put('o',"Position of alphabet: 15");
        alphabetMap.put('p',"Position of alphabet: 16");
        alphabetMap.put('q',"Position of alphabet: 17");
        alphabetMap.put('r',"Position of alphabet: 18");
        alphabetMap.put('s',"Position of alphabet: 19");
        alphabetMap.put('t',"Position of alphabet: 20");
        alphabetMap.put('u',"Position of alphabet: 21");
        alphabetMap.put('v',"Position of alphabet: 22");
        alphabetMap.put('w',"Position of alphabet: 23");
        alphabetMap.put('x',"Position of alphabet: 24");
        alphabetMap.put('y',"Position of alphabet: 25");
        alphabetMap.put('z',"Position of alphabet: 26");

        return alphabetMap.get(alphabet);
    }
}
