package com.codewars.kyu7.statusArrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestRays {
    @Test
    public void raysTest(){
       Assert.assertEquals(new int[]{6,3,2,1,9,3,8},
                            Rays.status(new int[]{6,9,3,8,2,3,1}));
    }
    @Test
    public void raysTest2(){
        Assert.assertEquals(new int[]{6,3,2,1,9,3,8},
                Rays.status(new int[]{6,9,3,8,2,3,1}));
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Rays.status(new int[]{6, 9, 3, 8, 2, 3, 1})));
        System.out.println(Arrays.toString(Rays.status(new int[]{5 ,5 ,5 ,8 ,7 ,-2 ,-2 ,-3 ,1 ,9, 8 ,3 ,-3, 4 ,-4 ,6 })));
    }
}
