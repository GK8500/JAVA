import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            Double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.next();
            
            

            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}
