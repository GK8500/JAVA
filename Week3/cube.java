import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number you want to cube : ");
        int a = sc.nextInt();
        System.out.println(a*a*a);
        sc.close();
    }
}
