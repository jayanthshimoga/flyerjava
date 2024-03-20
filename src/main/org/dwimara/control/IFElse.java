package org.dwimara.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class IFElse {

    public static void main(String[] args) {

        ArrayList<String> catalog = new ArrayList<String>(Arrays.asList("r", "s", "p"));
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter r, p or s : for rock, paper or scissors respectively: ");

        String user_choice = scanner.next();
        int index = random.nextInt(catalog.size());
        String computer_choice = catalog.get(index);

        if(user_choice.equalsIgnoreCase(computer_choice)){
            System.out.println("Tie !");
        }else if ((user_choice.equalsIgnoreCase("r") && computer_choice.equalsIgnoreCase("s"))
                || (user_choice.equalsIgnoreCase("s") && computer_choice.equalsIgnoreCase("p"))
                || (user_choice.equalsIgnoreCase("p") && computer_choice.equalsIgnoreCase("r"))){
            System.out.println("User Wins !" + " Because computer choice : "+ computer_choice + " and user choice is : " + user_choice);
        }else {
            System.out.println("Computer Wins !" + " Because computer choice : "+ computer_choice + " and user choice is : " + user_choice);
        }

    }
}
