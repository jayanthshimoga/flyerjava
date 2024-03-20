package org.dwimara.control;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String size;

        switch (number){

            case 36:
                size = "Extra small";
                break;

            case 38:
                size = "small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 46:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size : "+ size);
    }
}
