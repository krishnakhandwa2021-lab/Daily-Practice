import java.util.*;

public class Even {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();


        if ( num % 2==0 ) {

            System.out.println("Number is even  ");
         }
        
        
        else {
             System.out.println("Number is odd ");
        }
    }
}

