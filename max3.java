// Maximum of three numbers

import java.util.Scanner;
public class max3 {
    public static void main(String args[])
    {
        int a , b ,c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number: ");
        a = sc.nextInt();
        System.out.print("What is the second number: ");
        b = sc.nextInt();
        System.out.print("What is the third number: ");
        c = sc.nextInt();

        if (a > b && a > c)
            System.out.print(a);
        else if(b > a && b > c)
            System.out.print(b);
        else
            System.out.print(c);
            sc.close();
    }
}
