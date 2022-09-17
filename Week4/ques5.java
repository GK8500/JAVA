package Week4;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        while(n / 2 >= 9) {
            System.out.println(n/2);
            n = n/2;
        }

    sc.close();
    }
}
