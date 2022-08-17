// Print the maximum of the two numbers


import java.util.Scanner;
public class max {
    public static void main(String args[])
    {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number: ");
        a = sc.nextInt();
        System.out.print("What is the second number: ");
        b = sc.nextInt();
        if (a > b)
            System.out.print(a);
        else
            System.out.print(b);

        sc.close();
    }
}
