// package arrays;
import java.util.*;



public class ascending {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int[] asc = new int[5];

        for(int i= 0; i < 5 ; i++){
            asc[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            int a = 0;
            if(asc[i] > a){
                a = asc[i];
                System.out.print(a +" ");
            }
        }sc.close();
    }
}
