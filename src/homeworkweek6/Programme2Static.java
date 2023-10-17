package homeworkweek6;
/**
 * 2.  Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2Static {
    static int num = 2020;                        // 2.1  Declaration of two static variables
    static String name = "London Olympics";

    public static void s1(){                          //2.2 Declaration of the static method S1
        System.out.print(name + " ");
        System.out.println(num);       //2.3 Calling both static variables in the print statement
    }
    public static void main(String [] args){                  //2.4 Declaration of the main method
        s1();                                         //2.5 Calling static method S1 in main method
    }
}