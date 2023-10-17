package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class Programme13Avg {
    public static void main(String[] args) {
        System.out.println("This programme returns average of three numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.print("Enter third number: ");
        double c = input.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("Average of the number " + a + ", " + b + " and " + c + " is: " + avg );
        input.close();
    }
}
