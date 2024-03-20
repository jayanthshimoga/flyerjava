package org.dwimara.basics.variables;

public class VariableAdvance {

    // 1. Widening
    int  a = 10;
    float b = a;


    // 2. Narrowing ( TypeCasting )
    float f1 = 10.0f;
    int f2 = (int) f1;

    public static void main(String[] args) {
        VariableAdvance v1 = new VariableAdvance();
        System.out.println(v1.a);
        System.out.println(v1.b);
        System.out.println(v1.a==v1.b);

        System.out.println(v1.f1);
        System.out.println(v1.f2);
        System.out.println(v1.f1==v1.f2);
    }
}

