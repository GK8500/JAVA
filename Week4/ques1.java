package Week4;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        }
        System.out.println("odd");
        sc.close();
    }
}
