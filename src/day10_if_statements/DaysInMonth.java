package day10_if_statements;

import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a number between 1 and 12 inclusive which represents each month: ");
        int monthInNum = key.nextInt();

        boolean has31Days = monthInNum == 1 || monthInNum == 3 || monthInNum == 5 || monthInNum == 7 || monthInNum == 8 || monthInNum == 10 || monthInNum == 12;
        boolean has30Days = monthInNum == 4 || monthInNum == 6 || monthInNum == 9 || monthInNum == 11;
        boolean has28Days = monthInNum == 2;

        if (has31Days) {
            System.out.println("Month has 31 days");
        }

        if (has30Days) {
            System.out.println("Month has 30 days");
        }

        if (has28Days)
            System.out.println("Month has 28 days");

        System.out.println("--------------------------");

        if (has31Days) {
            System.out.println("Month has 31 days");
        } else if (has30Days) {
            System.out.println("Month has 30 days");
        } else if (has28Days) {
            System.out.println("Month has 28 days");
        } else {
            System.out.println("The number you have given is not in the range of 1 and 12\n\tYour number was :" + monthInNum);
        }

    }
}
