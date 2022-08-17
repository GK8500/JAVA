package arrays;
import java.util.*;

public class arays1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];  
        
        //input
        for(int i= 0; i < size ; i++){
            marks[i] = sc.nextInt();

        }
        
        //output
        for(int i = 0;i <size ; i++){
            System.out.println(marks[i]);
        }
        
        sc.close();
}
}