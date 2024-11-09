package day10_if_statements;

import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double salary;
        int hoursPerWeek;
        double hourlyRate;

        System.out.println("Please, enter your annual salary: $");
        salary = key.nextDouble();
        System.out.println("How many hours you works in a week: ");
        hoursPerWeek = key.nextInt();

        hourlyRate = salary / (hoursPerWeek * 52);

        System.out.println("My annual salary is $" + salary + "\n\tWork hours per week: " + hoursPerWeek + "\n\tHourly rate $" + hourlyRate);



    }
}
