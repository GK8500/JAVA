import java.util.Scanner;
public class prime {

    public static void main(String args[]){
    Scanner no = new Scanner(System.in);
    int n , count = 0 , i = 1;
    System.out.print("Enter a number: ");
    n = no.nextInt();
    while(i <= n)
        {if (n % i == 0)
        count += 1;
        i += 1;}

    if (count > 2)
    System.out.print("It is not a prime number");

    else
    System.out.print("It is a prime number");
    no.close();
}
}
