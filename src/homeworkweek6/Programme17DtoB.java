package homeworkweek6;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number :
 * 5 Expected Output Binary number is: 101
 */

public class Programme17DtoB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
        input.close();
    }
}
