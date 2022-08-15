import java.util.*;

public class multi_func{
    public static int mult (int a , int b) {
        int multiply = a * b;
        return multiply;
    }


public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a no: ");
    int a = sc.nextInt();
    System.out.println("Enter a no: ");
    int b = sc.nextInt();

    int multiply = mult(a, b);
    System.out.println(multiply);
    sc.close();
}
}