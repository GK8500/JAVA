import java.util.Scanner;

public class factorial_func {
    public static int fac(int a , int i ) {
        i = 1;
        while (a > 0)
            {i = i *a;
            a--;}
                // System.out.println(i);
        return i;
        
    }

public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a no: ");
    int a = sc.nextInt();
    int i = 1 ;
    System.out.println(fac(a, i));;
    sc.close();
}



}
