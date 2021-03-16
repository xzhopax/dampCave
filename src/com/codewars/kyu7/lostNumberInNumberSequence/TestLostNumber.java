package com.codewars.kyu7.lostNumberInNumberSequence;

import org.junit.Assert;
import org.junit.Test;

public class TestLostNumber {
    @Test
    public void lostNumberTest() {

        Assert.assertEquals(2, LostNumber.findDeletedNumber(
                new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 1, 5}));
    }
    @Test
    public void lostNumberTest2() {
        Assert.assertEquals(5, LostNumber.findDeletedNumber(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 9, 7, 4, 6, 2, 3, 8}));
    }
    @Test
    public void lostNumberTest3() {
        Assert.assertEquals(0, LostNumber.findDeletedNumber(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 7, 6, 9, 4, 8, 1, 2, 3}));
    }

    @Test
    public void lostNumberTest4() {
        Assert.assertEquals(9, LostNumber.findDeletedNumber(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 7, 6, 4, 8, 1, 2, 3}));
    }
    @Test
    public void lostNumberTest5() {
        Assert.assertEquals(0, LostNumber.findDeletedNumber(
                new int[]{}, new int[]{5, 7, 6, 4, 8, 1, 2, 3}));
    }

}
