import java.util.Scanner;
public class STAROPP {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n , i;
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for ( ; n > 0 ;n --)
        {
            for(i = 1 ; i <= n ; i ++ )
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
