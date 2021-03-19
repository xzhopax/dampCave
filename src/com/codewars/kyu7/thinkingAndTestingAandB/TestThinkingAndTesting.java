package com.codewars.kyu7.thinkingAndTestingAandB;

import org.junit.Assert;
import org.junit.Test;

public class TestThinkingAndTesting {
    @Test
    public void thinkingAndTestingTestAddition (){
        Assert.assertEquals(1, ThinkingAndTesting.testAB(0, 1));
        Assert.assertEquals(3, ThinkingAndTesting.testAB(1, 2));
        Assert.assertEquals(30, ThinkingAndTesting.testAB(10, 20));
    }
    @Test
    public void thinkingAndTestingTestMultiplication (){
        Assert.assertEquals(1, ThinkingAndTesting.testAB(1, 1));
        Assert.assertEquals(3, ThinkingAndTesting.testAB(1, 3));
    }
}
