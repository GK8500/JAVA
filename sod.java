
import java.util.Scanner;
public class sod {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ,  sum;
        System.out.print("Enter the number you want to sum: ");
        n = sc.nextInt();
        sum = 0;
        while(n>0)
           { sum = sum + n % 10;
            n = n / 10;}
        System.out.println(sum);
sc.close();
    }
}