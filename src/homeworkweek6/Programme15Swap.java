package homeworkweek6;

import java.util.Scanner;

// Write a Java program to swap two variables

public class Programme15Swap {
    public static void main(String[] args) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input A: ");
        a = sc.nextLine();
        System.out.print("Enter input B: ");
        b = sc.nextLine();
        System.out.println("You entered  A: " + a + " and B: " + b);
        swap(a, b);
        sc.close();
    }
    public static void swap(String a, String b) {
        String c = a;
        a = b;
        System.out.println("After swapping: " + c + " became " + a + " and " + b + " became " + c);
    }
}
