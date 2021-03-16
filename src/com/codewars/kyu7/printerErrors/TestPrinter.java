package com.codewars.kyu7.printerErrors;

import org.junit.Assert;
import org.junit.Test;

public class TestPrinter {
    @Test
    public void testPrinter(){
        String oneTest = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        Assert.assertEquals("3/56", Printer.printerError(oneTest));
    }
}
