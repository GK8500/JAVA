import java.util.Scanner;
public class palindrome {
    public static void main(String hammad[])
    {
         Scanner sc = new Scanner(System.in) ;
            int n , reverse = 0 , z;
            System.out.print("Enter the number : ");
            n = sc.nextInt();
            z = n;       // as the loop runs , the initial number "n" changes so to store the orignal values of n we initailize z as n.
            
            while (n > 0)
           { reverse = reverse * 10 + n % 10;
            n = n/ 10;}
            System.out.println(reverse);

            if (reverse == z)
            {System.out.println("This a palindrome");}

            else
            {System.out.println("This not palindrome");}
        }
    } 

