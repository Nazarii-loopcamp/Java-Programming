package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // Scanner reference = create a Scanner object
        // Following line get the info from user/console
        System.out.println("Please, enter 2 numbers:");
        System.out.println("\tNumber 1: ");
        // int num = 34;
        int num = keyboard.nextInt();
        //System.out.println(num);
        System.out.println("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        boolean areNumsEqual = num == num2;
        System.out.println("\n\tIs " + num + " equal to " + num2 + "?:" + areNumsEqual);


    }
}
