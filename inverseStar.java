import java.util.*;
public class inverseStar {

     public static void main(String[] args) {
        int n = 4;
         for(int i = n;i>=1;i--){ 
            for(int star =1; star<=i;star++){
                System.out.print("*");
            }
            System.out.println("");
         }
     }
}