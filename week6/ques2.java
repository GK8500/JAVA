package week6;
import java.util.*;;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int prime = sc.nextInt();
        int count = 0;
        for (int i = 1; i < prime+1; i++) {
            if(prime%i ==0){
                count++;
            }
        }
            if(count == 2){
            System.out.println("The number is prime.");
            }
            else{
            System.out.println("The number is not prime.");
            }
        
        sc.close();
    }
}
