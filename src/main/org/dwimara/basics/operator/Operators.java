package org.dwimara.basics.operator;

public class Operators {

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int res = 0;

        // Arithmetic
        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction : "+ (a-b));
        System.out.println("Multiplication : "+ (a*b));
        System.out.println("Division : "+ (a/b));
        System.out.println("Modulo : "+ (a % b));

        // Assignment Operator
        res += a;   // res = res + a
        System.out.println("Addition Assignment : "+ (res));
        res -= 2;   // res = res - 2
        System.out.println("Subtraction Assignment : "+ (res));
        res *= a;   // res = res * a
        System.out.println("Multiplication Assignment : "+ (res));
        res /= a;   // res = res / a
        System.out.println("Division Assignment : "+ (res));
        res %= a;   // res = res % a
        System.out.println("Modulo Assignment : "+ (res));


        // Relational and Logical
        System.out.println("Equals : "+ (a == b));
        System.out.println("Greater or equals : "+ (a >= b));
        System.out.println("Smaller or equals : "+ (a <= b));
        System.out.println("Not Equals : "+ (a != b));

        System.out.println("AND : "+ ((5 < 3) && ( 8 < 13)));
        System.out.println("OR : "+ ((5 < 3) || ( 8 < 13)));
        System.out.println("NOT : "+ !(6==6));



        // Other operator
        String str = "Program";
        boolean result;
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);


        // Java Ternary operator
        // variable = Expression ? expression1 : expression2
        // The ternary operator (conditional operator) is shorthand for the if-then-else statement.3
        int februaryDays = 29;
        String resp;

        // ternary operator
        resp = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(resp);
    }
}
