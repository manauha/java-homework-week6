package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in
 * degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme7Temp {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (((fahrenheit -32)*5)/9);
        System.out.println(fahrenheit + " degree Fahrenheit is: "+ celsius);
        input.close();
    }
}
