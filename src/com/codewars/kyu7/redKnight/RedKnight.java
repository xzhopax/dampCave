package com.codewars.kyu7.redKnight;

import jdk.jshell.Snippet;

public class RedKnight {
    public static PawnDistance redKnight(int knight, long pawn) {
        if (knight == 1 && pawn % 2  == 0) {
           return new PawnDistance("Black", pawn + pawn);
        } else if (knight == 1) {
            return new PawnDistance("White", pawn + pawn);
        } else if (knight == 0 && pawn % 2  == 0) {
            return new PawnDistance("White", pawn + pawn);
        } else return new PawnDistance("Black", pawn + pawn);
    }
}
