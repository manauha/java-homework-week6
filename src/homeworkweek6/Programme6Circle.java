package homeworkweek6;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle
 * and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme6Circle {
    static double radius, area;                                                       //static variables defined
    public static void main(String[] args) {                                          // main method declaration
        Scanner scn = new Scanner(System.in);                                 // calling a scanner for user input
        System.out.print("Enter the radius of the circle in cm: ");                        // message to the user
        radius = scn.nextDouble();                                               //storing a user input in radius
        calc();                                                                       //Calling the static method
        scn.close();                                                                            //Scanner closing
    }
    public static void calc(){                                                       // Static method declaration
        area = Math.PI * radius * radius;                                                      //Area Calculation
        System.out.print("Area of the the Circle with " +radius+ " cm radius is: "+ area + " cm2.");   //output
    }
}


