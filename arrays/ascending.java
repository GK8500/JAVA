// package arrays;
import java.util.*;
public class ascending {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int[] asc = new int[5];
// INPUT
        for(int i= 0; i < 5 ; i++){
            asc[i] = sc.nextInt();
        }
// Bubble sort      
        for(int i = 0; i < 5; i++){
            // int a = 0;
            for(int j = 0 ; j < i ; j++){
                if(asc[i] > asc[j]){
                    int temp = asc[i];
                    asc[i] = asc[j];
                    asc[j] = temp;
                    // System.out.print(a +" ");
                }

            }
        }
// output
        for (int i = 0; i < asc.length; i++) {
            
            System.out.println(asc[i]);
        }
        
        sc.close();
    }
}
