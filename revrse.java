
import java.util.Scanner;
public class revrse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ,  reverse;
        System.out.print("Enter the number you want to reverse: ");
        n = sc.nextInt();
        reverse = 0;
        while (n > 0)
        {reverse = reverse * 10 + n % 10;
        n = n/10;}
        System.out.print(reverse);
        sc.close();
    }
}
