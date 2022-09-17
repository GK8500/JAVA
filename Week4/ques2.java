package Week4;
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n =  sc.nextInt();
    System.out.print("Enter the number: ");
    int m =  sc.nextInt();
    System.out.print("Enter the number: ");
    int k =  sc.nextInt();

    if(n > m && n > k){
        System.out.println(n +" is the largest.");
    }
    else if(k > m && k > n){
        System.out.println(k +" is the largest.");
    }
    else{
        System.out.println(m + " is the largest.");
    }
    sc.close();
}
}