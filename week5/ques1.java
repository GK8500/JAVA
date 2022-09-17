package week5;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        // input
        for(int i=0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
