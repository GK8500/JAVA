import java.util.Scanner;
public class prime_arr {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int ln = 10;
        int [] arr = new int[ln+1];
        // input
        for (int i = 0; i < ln; i++){
            System.out.print("Enter the elements: " + (i+1) + " : ");
            arr[i] = num.nextInt();
        }
        
        // if the number is divisible by any number between 2 and itself its not prime.
        // using that logic:
        

        System.out.println("\nThe prime numbers in the array are: ");
        for (int i = 0; i < ln; i++){
            Boolean flag = false;
            for (int j=2; j<arr[i]; j++){
                if(arr[i]%j==0){
                    flag =true;
                    break;
                }
            }
            if(flag == false)
            System.out.print(arr[i] + " , "); 
        }
        num.close();
    }
}