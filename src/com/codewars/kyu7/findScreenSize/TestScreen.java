package com.codewars.kyu7.findScreenSize;


import org.junit.Assert;
import org.junit.Test;

public class TestScreen {

    @Test
    public void testProgramScreen() throws Exception {
        String test1 = Screen.findScreenHeight(1024,"4:3");
        String test2 = Screen.findScreenHeight(1280,"16:9");
        String test3 = Screen.findScreenHeight(3840,"32:9");
        String test4 = Screen.findScreenHeight(2226,"4:3");
        Assert.assertEquals( "1024x768", test1);
        Assert.assertEquals( "1280x720", test2);
        Assert.assertEquals( "3840x1080", test3);
        Assert.assertEquals( "2226x1669", test4);

    }
}
