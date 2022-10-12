import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int even = 0;
        int odd = 0;
        

        // output
        for(int i = 0 ; i < 10 ; i++){
            if(arr[i] % 2 == 0) {
                even += 1;
                System.out.println(arr[i]+ " is even");
            }
            else {
                odd += 1;
                System.out.println(arr[i]+ " is odd");
            }
        }
        System.out.print("There are " + even + " even and " + odd + " odd numbers.");
        sc.close();
    }
    
}
