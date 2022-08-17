

import java.util.Scanner;
public class calculator {
    public static void main(String args[])
    {
        Float a ,b, c , d;
        ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        b = sc.nextFloat();
        
        System.out.print("What operation would you like to perform. \n Press 1 -> Add \n 2 -> Substraction \n 3 -> Multiplication 4 -> Division \n ");
        c = sc.nextFloat();

    //     if (c == " + ")
    //    { d = a + b;
    //     System.out.println(d);}

    //     else if (c == "-")
    //     {d = a - b;
    //     System.out.println(d);}

    //     else if (c == "*")
    //    { d = a*b;
    //     System.out.println(d);}

    //     else if (c == "/")
    //     {d = a/ b;
    //     System.out.println(d);}

    //     else
    //     System.out.println("PLEASE ENTER A VALID OPERATION");

    if (c==1)
    { d = a + b;
    System.out.println(d);}

    else if (c == 2)
    {d = a - b;
    System.out.println(d);}

    else if (c == 3)
   { d = a*b;
    System.out.println(d);}

    else if (c == 4)
    {d = a/ b;
    System.out.println(d);}

    else
    System.out.println("PLEASE ENTER A VALID OPERATION");

        sc.close();
    }
}
