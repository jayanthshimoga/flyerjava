package org.dwimara.basics;


import java.util.Arrays;

public class DataType {

    boolean flag = true;
    char c = 'A';

    byte n1 = 10;
    byte n11 = (byte)1000;
    short n2 = 100;
    int n3 = 1000;
    long n4 = 10000L;

    float d1 = 10.5f;
    double d2 = 10.5;

    String s1 = "name";
    String[] a1 = {"RCB", "CSK", "MI", "GT"};


    public static void main(String[] args) {
        DataType d1 = new DataType();
        System.out.println("Type is : "+ ((Object)d1.flag).getClass().getName() + " and value is "+ d1.flag);
        System.out.println(d1.c);
        System.out.println(d1.n1);
        System.out.println(d1.n11);
        System.out.println(d1.n2);
        System.out.println(d1.n3);
        System.out.println(d1.n4);
        System.out.println(d1.d1);
        System.out.println(d1.d2);
        System.out.println(d1.s1);
        System.out.println(d1.s1 instanceof String);
        System.out.println(Arrays.toString(d1.a1));
    }

}
