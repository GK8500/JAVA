import java.util.Scanner;
public class STAR1 
{
    public static void main(String args[]){
        int i = 1, j = 1 , n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (i = n ; i >= 1 ; n --)
        {
            for (j = n ; j >= 1 ; i--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}