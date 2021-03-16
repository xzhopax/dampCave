package com.codewars.kuy6.rectangleIntoSquares;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSqInRect {
    @Test
    public void testSqInRect(){
        List<Integer> testOne = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
        List<Integer> lengthEqualsOne = new ArrayList<Integer>(Arrays.asList(1, 1));
        List<Integer> testTwo = new ArrayList<Integer>(
                Arrays.asList(297, 297, 297, 109, 109, 79, 30, 30, 19, 11, 8, 3, 3, 2, 1, 1));

        Assert.assertEquals(testOne ,SqInRect.sqInRect(5, 3));
        Assert.assertEquals(lengthEqualsOne ,SqInRect.sqInRect(1, 2));
        Assert.assertEquals(testTwo ,SqInRect.sqInRect(1000, 297));


    }

    @Test
    public void testSqInRectShouldBeNull() {
        Assert.assertNull(SqInRect.sqInRect(5, 5));
    }

}
