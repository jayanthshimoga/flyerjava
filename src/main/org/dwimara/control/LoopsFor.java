package org.dwimara.control;

import java.util.Scanner;

public class LoopsFor {

    public static void main(String[] args) {

        // FOR LOOP
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int innerloop=1; innerloop <= n; innerloop++){
            sum += innerloop;
            System.out.println("Printing records : "+ innerloop);
        }
        System.out.println("Total sum is : "+ sum);



        // FOR - EACH Loop
        int[] numbers = {3, 7, 5, -5};
        for(int num: numbers){
            System.out.println(num);
        }
    }


}
