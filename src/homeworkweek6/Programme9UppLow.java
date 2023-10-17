package homeworkweek6;
// Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Programme9UppLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or sentence or paragraph: ");
        String str = input.nextLine();
        System.out.println(str.toLowerCase());
        input.close();
    }
}
