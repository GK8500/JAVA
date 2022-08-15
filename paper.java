import java.util.*;

public class paper {
    public static int avg (int a , int b , int c) {
        a = 0;
        b = 0;
        while (b < c) 
        {
        a = a + (2*b + 1);
        b ++ ;
        // System.out.println(a);
        }
        return (a);          
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer a; //= sc.nextInt();
        int b; //= sc.nextInt();
        int c = sc.nextInt();
        a = 0;
        b = 0;

        // a = avg(a, b, c);
        System.out.println(avg(a, b, c));
       
        sc.close();
    }
}
