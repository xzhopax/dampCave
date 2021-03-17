package com.codewars.kyu7.wordsShifter;

import org.junit.Assert;
import org.junit.Test;

public class TestShifter {
    @Test
    public void shifterTest(){
        Assert.assertEquals(2, Shifter.count("OS IS UPDATED"));
        Assert.assertEquals(2, Shifter.count("I III I III"));
    }
    @Test
    public void empty(){
        Assert.assertEquals(0, Shifter.count(""));
    }
}
