// package arrays;
import java.util.*;

public class arays1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[1000]; 
        System.out.print("How many elements do you want in the array: "); 
        int size = sc.nextInt()
        
        //input
        for(int i= 0; i < size ; i++){
            arr[i] = sc.nextInt();

        }
        
        //output
        for(int i = 0;i <size ; i++){
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
}
}