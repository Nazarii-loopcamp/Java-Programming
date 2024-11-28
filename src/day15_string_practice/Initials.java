package day15_string_practice;

import java.util.Scanner;
/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = key.next().toUpperCase(); // tom --- > TOM
        System.out.print("Please, enter your last name: ");
        String lastName = key.next().toUpperCase();

        char firstCharOfFirstName = firstName.charAt(0); // TOM -- > 'T'
        char firstCharOfLasName = lastName.charAt(0);

        System.out.println( "" + firstCharOfFirstName + firstCharOfLasName );
    }
}
