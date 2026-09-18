import java.util.*;
public  class linear {

    public  static int linearsearch(int number[],int key){ 
        for(int i=0; i < number.length; i++){ 
            if(number[i]==key){
                return i;

            }
        } return  -1;
    }

    public static void main(String[] args) {

        int number[] = {1,2,54,11,223,10,99};
        int key = 10;

        int index = linearsearch(number, key);
        if (index==-1) {
            System.out.println("NOT FOUND");
        } else{ 
            System.out.println("Key is at index : " + index);
        }
    }
}