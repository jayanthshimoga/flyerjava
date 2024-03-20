package org.dwimara.basics;

public class Literals {

    public static void main(String[] args) {
        // binary
        int binaryNumber = 0b10010;
        // octal
        int octalNumber = 027;

        // decimal
        int decNumber = 34;

        // hexadecimal
        int hexNumber = 0x2F; // 0x represents hexadecimal
        // binary
        int binNumber = 0b10010; // 0b represents binary

        System.out.println("Type of variable binaryNumber is : "+ ((Object)binNumber).getClass().getName());
        System.out.println("Type of variable octalNumber is : "+ ((Object)octalNumber).getClass().getName());
        System.out.println("Type of variable decNumber is : "+ ((Object)decNumber).getClass().getName());
        System.out.println("Type of variable hexNumber is : "+ ((Object)hexNumber).getClass().getName());
        System.out.println("Type of variable binNumber is : "+ ((Object)binNumber).getClass().getName());
    }
}
