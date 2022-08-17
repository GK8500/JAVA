
import java.util.Scanner;
public class prosum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n , sum = 0 , product = 1 , digit ;
        System.out.print("Enter the number: ");
        n = sc.nextLong();
        while (n > 0)
        {
            digit = n % 10;
            if (digit % 2 == 0)
            {
                sum += digit ;
            }
            else
            {
                product=  product * digit;
            }
            n = n/10;
        }
        System.out.println("The sum of even numbers is "+ sum);
        System.out.println("The product of odd numbers is "+product);
        sc.close();
    }

}