import java.util.Scanner;

public class Switchcal{

    public static void main(String args[]) {
        Scanner cal = new Scanner(System.in);
        
            
        int i = cal.nextInt();
        int j = cal.nextInt();
        
        int calculate= cal.nextInt();
        
        switch (calculate) {
            case 1:
                int ans = i + j ;
                System.out.println(ans);
                break;
        
            case 2:
                ans = i - j ;
                System.out.println(ans);
                break;
        
            case 3:
                ans = i * j ;
                System.out.println(ans);
                break;
        
            case 4:
                ans = i / j ;
                System.out.println(ans);
                break;
        
            default:
                break;
        }
        cal.close();
    }
    }
