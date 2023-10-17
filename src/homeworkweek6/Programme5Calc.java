package homeworkweek6;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication and division methods
 * all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */

public class Programme5Calc {
    public void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);
    }

    public void sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + sub);
    }

    public static void mul(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("Product of the " + num1 + " and " + num2 + " is: " + product);
    }

    public static void div(int num1, int num2) {
        int div = (num1 / num2);
        System.out.println("Divison of the " + num1 + " and " + num2 + " is: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        Programme5Calc obj = new Programme5Calc();
        obj.addition(num1, num2);
        obj.sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);
        sc.close();
    }
}

