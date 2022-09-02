import java.util.Scanner;

public class sum_of_ele {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int 10 = sc.nextInt();
        int sum = 0;
        int[] arr = new int[10];  
        // arr = [1 , 2 , 3 ,4,5,,6,7,8,9,10];
        
        //input
        for(int i= 0; i < 10 ; i++){
            arr[i] = sc.nextInt();

        }
        // output
        for (int i = 0 ; i <10 ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array is: " + sum);
        sc.close();


}
}
