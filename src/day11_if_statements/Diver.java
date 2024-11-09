package day11_if_statements;
/*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign an int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you are at 50%
 */
import java.util.Scanner;
public class Diver {
    public static void main(String[] args) {

        int oxyLevel = 80;

        if (oxyLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxyLevel > 80) {
            System.out.println("Still okay");
        } else if (oxyLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxyLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxyLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("SOS. See you in heaven");
        }

    }
}
