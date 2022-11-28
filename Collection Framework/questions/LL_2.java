import java.util.*;
import java.util.Scanner;

public class LL_2 {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean h = false;
        while(h == false){
            System.out.println("Do you wat to keep adding numbers?\n Press y for yes or n for no: ");
            String prompt = sc.nextLine();
        if(prompt == "n"){
            h = true;
            for (int j = 0; j < i.size(); j++) {
                if(i.get(j) >= 25){
                    i.remove(j);
                }
            }
        }
        else{
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            
        }
    }}
}
