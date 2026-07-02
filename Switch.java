import java.util.*;
public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();


        switch (Button) {
            case 1 : System.out.println("hello");
            break ; 
            case 2 : System.out.println("ja na ");
            break;
            case 3 : System.out.println("sherrr");
            break;
            default: System.out.println("beta tum se nhi ho payega ");
               }
    }
}