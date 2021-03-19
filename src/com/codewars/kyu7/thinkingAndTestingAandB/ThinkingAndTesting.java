package com.codewars.kyu7.thinkingAndTestingAandB;

public class ThinkingAndTesting {
    //х*у=х+у,отсюда х=у/(у-1)
    public static int testAB(int a, int b) {
        /*
         * Google to help me
         *
         *
         * Since the expected values for the test cases do
         * not work with basic arithmentic operators. Lets
         * use bitwise operators.
         *
         * If we look at the input and output integer values
         * as 8 bit values, we can see that the operator being
         * used is an '|' (bitwise or).
         *
         * e.g.
         *        a:  0000 1010 base 2  (10 decimal)
         *        b:  0001 0100 base 2  (20 decimal)
         *   output:  0001 1110 base 2  (30 decimal)
         */

        return a | b;


    }
}
