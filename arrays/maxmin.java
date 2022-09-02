// Find the maximum & minimum number in an array of integer

// package arrays;
import java.util.*;

public class maxmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[100];  
        
        //input
        for(int i= 0; i < size ; i++){
            marks[i] = sc.nextInt();

        }
        
        //output
        for(int i = 0;i <size ; i++){
            System.out.println(marks[i]);
            // for (int a = 0; marks[i] > a ; i++){
            //     i < size ;
            //     marks[i] = a;
            //     i++;
            //  }
        }
        
        sc.close();
}
}