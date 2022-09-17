package week5;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float n =  sc.nextFloat();
        float sum = 0;
        for(float i = 1; i <=n ; i++){
            sum = sum + (1/i);
        }
        System.out.println(sum);

        sc.close();
}
}
