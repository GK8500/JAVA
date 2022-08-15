import java.util.*;

public class DemoProject {

    
    public static void main(String args[] ) {
    
        Scanner x = new Scanner (System.in);
        
        System.out.println("ENTER A NUMBER: ");
        Integer a = x.nextInt();
        int i= 1;
        for (;(i<=a); i++)
            
            i = i*i;
        
        
        System.out.println("FACTORIAL = " + i);
     x.close();
    }
    
}