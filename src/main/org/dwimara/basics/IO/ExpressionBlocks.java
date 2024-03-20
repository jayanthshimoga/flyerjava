package org.dwimara.basics.IO;

public class ExpressionBlocks {

    public static void main(String[] args) {

        // Expressions
        Double a = 22.5, b = 13.4, result;
        result = a + b - 1.5;

        System.out.println(result);

        /*
         * number = 3  // Expression
         * number = 3; // Statement
         *
         */

        if (a < result) { //start of the block
            System.out.println("result is higher");
        } // End of the block
    }
}
