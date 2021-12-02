package test;

import org.junit.Assert;
import org.junit.Test;


public class TestSolution {

    @Test
    public static void main(String[] args) {


        Assert.assertEquals(20,Solution.sendPassword("stalker72"));
        Assert.assertEquals(87,Solution.sendPassword("NukaCola76"));
        Assert.assertEquals(38,Solution.sendPassword("Porcupine79"));
        Assert.assertEquals(140,Solution.sendPassword("99Nebuchadnezzar"));
        Assert.assertEquals(-1,Solution.sendPassword("aaaaaaa"));

    }


}
