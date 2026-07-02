import java.util.*;
public class Natural {

     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
          
        // for(int i = 1; i<11; i++){
        //     System.out.println(i*n);
        // }
         
        do { 
            System.out.println("Enter the number :  ");
            int n = sc.nextInt();
            if( n % 10== 0) {
                break ; 
            
             }
              
             System.out.println(n);

        }while(true);

        
         
     }

}