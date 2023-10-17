package homeworkweek6;
//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Programme8Triangle {
    public static void main(String[] args) {
        float height, base, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextFloat();
        System.out.print(("Enter the base of the triangle in cm: "));
        base = input.nextFloat();
        area = ((height*base)/2);
        System.out.println("Area of the triangle with height " + height + " cm and "+ base +" cm is : " + area + " cm2.");
        input.close();
    }
}
