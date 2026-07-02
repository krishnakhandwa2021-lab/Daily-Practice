import java.util.*;
public class Exception {

     public static void main(String[] args) {
         try {
             int a = 10 ; 
             int b = 0;
              
             int result = a/b;
             System.out.println("result =  " + result );
         }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
     }
}