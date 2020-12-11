package com.codewars.kyu8.simpleFun1SeatsInTheater;

public class SeatInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        if (nCols <= 1000  && nRows <= 1000
                && col <= nCols && col >= 1 && row <= nRows && row >= 1) {
            return (nCols - col + 1) * (nRows - row);
        } else
            return 0;
    }
}
