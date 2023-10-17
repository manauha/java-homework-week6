package homeworkweek6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4TwoInSt {
    int a = 9;                                                      // 4.1 First instance variable declaration
    int b = 7;                                                     //4.1  Second instance variable declaration
    static String wrd = "Nine";                                         //4.1 First static variable declaration
    static String wrd1 = "Seven";                                      //4.1 Second static variable declaration
    public void m1() {                                                      //4.2  instance method declaration
        System.out.print(a + " ");                              //4.4 calling instance variable to instance method
        System.out.println(b);                              //4.4 calling instance variable to instance method
        System.out.print(Programme4TwoInSt.wrd + " ");   //4.4  class calling - static variable to instance method
        System.out.println(Programme4TwoInSt.wrd1);  //4.4  class calling - static variable to instance method
    }
    public static void m2() {                                                 // 4.3  static method declaration
        Programme4TwoInSt n1 = new Programme4TwoInSt();                                      // Object creation
        System.out.print(n1.b + " ");                                                             // object calling
        System.out.println(n1.a);                                                             // object calling
        System.out.print(wrd1 + " ");                                    // calling static variable to static method
        System.out.println(wrd);
    }

    public static void main(String[] args) {                                        // main method declaration
        m2();                                                          // calling static method to main method
        Programme4TwoInSt n2 = new Programme4TwoInSt();                                       // object calling
        n2.m1();                                                       // calling instance method to main method
    }
}

