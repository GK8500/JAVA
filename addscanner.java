// Addition using scanner class

import java.util.Scanner;
public class addscanner {
    public static void main(String args[]) {
    int a , b , c;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter First NUmber: ");
    a = sc.nextInt();
    System.out.print("Enter second number: ");
    b = sc.nextInt();
    c = a + b ;
    System.out.println("Addition = " + c);
    }
}
