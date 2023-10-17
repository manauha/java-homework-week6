package homeworkweek6;
import java.util.Scanner;
/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme19Lc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER YOUR MESSAGE IN UPPER CASE:");
        String msg = scn.nextLine();
        System.out.println(msg);
        System.out.println(msg.toLowerCase());
        scn.close();
    }
}


