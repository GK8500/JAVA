
import java.util.Scanner;




public class oddeven {

    public static void main(String args[])
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = s.nextInt();
        if (a % 2 == 0)
        System.out.print("Even");

        else
        System.out.print("Odd");
    }
    
}
