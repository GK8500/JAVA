package week5;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        int sum = 0;

        while(n % 10 > 0){
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.println(sum);
        sc.close();
}
}
