import java.util.Scanner;
public class printnn 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i , n;
        System.out.println("Enter the number upt which you want to print the numbers: ");
        n = sc.nextInt();
        i = 1 ;
        while (i <= n);
        {
            System.out.println(i);
            i = i + 1;
        }
    }
}
