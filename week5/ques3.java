package week5;

import java.util.Scanner;

public class ques3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows needed: ");
    int n = sc.nextInt() ;
    for (int i = 0; i <= n; i++) {
      for (int k = n; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      
      for (int j = i-1; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
    sc.close();
  }
}