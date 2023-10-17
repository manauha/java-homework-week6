package homeworkweek6;

/**
 * 3  Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3InSt {
    int yr = 2021;                                                          //3.1 Declaration an instance variable
    static String word = "Census";                                          //3.1 Declaration of a static variable

    public void s1() {                                                          // 3.2 Declare one instance method
        System.out.print(yr + " ");                        //3.4 instance variable to instance method - direct calling
        System.out.println(Programme3InSt.word); //3.4  calling static variable to instance method - class calling
    }

    public static void s2() {                                                      // 3.3 Declare one static method
        Programme3InSt obj1 = new Programme3InSt();  // object creation to call instance variable  to static method
        System.out.print(word + " ");                   //3.4 calling static variable to static method - direct calling
        System.out.println(obj1.yr);                         // Instance variable to static method - object calling
    }

    public static void main(String[] args) {                                   //3.5 Declaration of the main method
        Programme3InSt p1 = new Programme3InSt();         // object creation to call instance method to main method
        p1.s1();                                        //3.6 calling instance method  to main method through object
        s2();                                          // 3.6 calling static method to main method -  direct calling
    }
}