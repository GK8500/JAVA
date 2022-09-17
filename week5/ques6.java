package week5;
import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        int fac = 1;
        for (int i = 1; i <=n; i++) {
            fac = fac*i;
        }
        System.out.println(fac);
        sc.close();
    }
}
