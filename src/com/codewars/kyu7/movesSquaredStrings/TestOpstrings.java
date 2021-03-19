package com.codewars.kyu7.movesSquaredStrings;

import org.junit.Assert;
import org.junit.Test;

public class TestOpstrings {
    public static void main(String[] args) {

        System.out.println("Fixed Tests vertMirror");
        System.out.println("test one\n");
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        System.out.println(Opstrings.vertMirror(s));// /"QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        System.out.println("");
        System.out.println("test two\n");
        String s2 = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
        System.out.println(Opstrings.vertMirror(s2)); //"EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
        System.out.println("");
        System.out.println("Fixed Tests horMirror");
        System.out.println("test one\n");
        String s3 = "lVHt\nJVhv\nCSbg\nyeCt";
        System.out.println(Opstrings.horMirror(s3));// "yeCt\nCSbg\nJVhv\nlVHt";
        System.out.println("");
        System.out.println("test two\n");
        String s4 = "njMK\ndbrZ\nLPKo\ncEYz";
        System.out.println(Opstrings.horMirror(s4));// "cEYz\nLPKo\ndbrZ\nnjMK";

    }


}
