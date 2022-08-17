
import java.util.Scanner;
public class productogdigits {
    public static void main(String args[])
{
    Scanner sc =  new Scanner(System.in);
    int n , product = 1 ;
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    while (n > 0)
    {product = product * (n% 10);
    n = n /10;}
    System.out.println(product);
    sc.close();


}
}