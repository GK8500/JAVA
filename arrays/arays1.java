// package arrays;
import java.util.*;

import javax.swing.text.AbstractDocument.BranchElement;

public class arays1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int[] arr = new int[1000]; 
        System.out.print("How many elements do you want in the array: "); 
        int size = sc.nextInt();
        
        //input
        for(int i= 0; i < size ; i++){
            arr[i] = sc.nextInt();
            // System.out.println("Would you like: ");
            // String s = sc.nextLine();
            // if(s == "y"){
            //     break;
            // }

        }
        
        //output
        for(int i = 0;i <size ; i++){
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
}
}