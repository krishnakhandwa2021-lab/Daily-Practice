import java.util.*;

public class starRectangle {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); // Number of rows
         int m = sc.nextInt(); // Number of columns

         for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) { 
                // Print stars only on the borders
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
         } 
         
     }
}