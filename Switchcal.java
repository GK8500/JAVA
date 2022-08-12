import java.util.Scanner;

public class Switchcal{

    public static void main(String args[]) {
        Scanner cal = new Scanner(System.in)
        {
            
        int i = cal.nextInt();
        int j = cal.nextInt();
        
        
        
        switch (calculator) {
            case add:
                ans = i + j ;
                System.out.println(ans);
                break;
        
            case Substract:
                ans = i - j ;
                System.out.println(ans);
                break;
        
            case Multiply:
                ans = i * j ;
                System.out.println(ans);
                break;
        
            case Divide:
                ans = i / j ;
                System.out.println(ans);
                break;
        
            default:
                break;
        }
    }
    }
}