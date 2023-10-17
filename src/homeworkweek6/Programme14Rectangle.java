package homeworkweek6;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height and width of the rectangle in cm");
        System.out.println("Height:  ");
        double height = input.nextDouble();
        System.out.println("Width: ");
        double width = input.nextDouble();
        rec(height, width);
        input.close();
    }
    public static void rec(double height, double width){
        System.out.println("Area of the rectangle = "+ height +" * "+ width + " = " + height*width + " cm2.");
        System.out.println("Perimeter of the rectangle =  2*(" +height+ " + " + width + ") = " + 2*(height + width) + " cm.");
    }
}
