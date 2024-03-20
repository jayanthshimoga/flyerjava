package org.dwimara.basics.IO;


/*
 * Output:
 * System.out.println(); or System.out.print(); or System.out.printf();
 *
 * Input:
 * Scanner
 */

import java.util.Scanner;


public class IO {

    static int a  = 24;
    public static void main(String[] args) {
        System.out.println("Cursor moves to the next line");
        System.out.print("Cursor stays at same line: see the next println result here ");
        System.out.printf("%d \n", IO.a);

        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        System.out.println("Your age is : "+ user_input);
    }
}
