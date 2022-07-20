import java.util.Scanner;
public class sumnn {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number : ");
        i = sc.nextInt();
        n = (i*(i+1))/2;
        System.out.print(n);
    }
}
