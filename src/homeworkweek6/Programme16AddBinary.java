package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10
 *             Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */

public class Programme16AddBinary {
    public static void main(String[] args) {
        //long b1, b2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String b1 = input.next();
        System.out.print("Enter second binary number: ");
        String b2 = input.next();

        int bn1 = Integer.parseInt(b1,2);
        int bn2 = Integer.parseInt(b2,2);
        int bn3 = bn1+bn2;

        System.out.println("Sum of two binary numbers " + Integer.toBinaryString(bn1) + " and " + Integer.toBinaryString(bn2) + " is: " + Integer.toBinaryString(bn3));
        input.close();
    }
}
