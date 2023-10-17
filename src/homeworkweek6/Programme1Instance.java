package homeworkweek6;
/**
 * 1   Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 **/
public class Programme1Instance {
                                       // 1.1 Declaration of two instance variables
    int yr = 2023;                                    // yr is an instance variable
    String mth = "October";                          // mth is an instance variable
    public void M1() {                       //1.2 Declaration of an instance method
        System.out.print(mth);  //1.3 Calling instance variable to instance method
        System.out.println(" "+ yr);   //1.3 Calling instance variable to instance method
    }
    public static void main(String[] args) {   // 1.4 declaration of the main method
        Programme1Instance obj = new Programme1Instance();         //object creation
        obj.M1();               // 1.5 Calling instance method M1 to the main method
    }
}
