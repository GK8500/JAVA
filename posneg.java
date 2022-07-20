

import java.util.Scanner;


public class posneg {
    public static void main(String args[])
    {
         int a ;
         char c ;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         a = sc.nextInt();

         if (a > 0)
         System.out.println("Positive");

         else if (a == 0)
         System.out.print("Zero");

         else
         System.out.println("Negative");
    }
    
}
