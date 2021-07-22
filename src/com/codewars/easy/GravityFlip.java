package com.codewars.easy;

import java.util.Arrays;
import java.util.Collections;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {

        if(dir == 'R'){
            Arrays.sort(arr);
        }else if (dir == 'L'){
            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
            if( arr[j] < arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        }
        return arr;
    }
}
