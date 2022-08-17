import java.util.Scanner;
public class amstrongno {

    public static void main(String args[]){
    Scanner no = new Scanner(System.in);
    int n ,  product = 0 , z ,  count = 0;
    System.out.print("Enter a number: ");
    n = no.nextInt();
    z = n;
    while(n > 0)
    {
        
        count += 1 ;
        
        n = n /10;
    }
    while (z > 0)
    {product = (int) (product + Math.pow((z % 10), count));
    z = z / 10;}
    System.out.print(product);
    no.close();
    }

}  

// SDUIOSHFIFJHHSJSLFK