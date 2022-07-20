import java.util.Scanner;
public class factorial {

    public static void main(String args[]){
    Scanner no = new Scanner(System.in);
    int n , product = 1 , i = 1;
    System.out.print("Enter a number: ");
    n = no.nextInt();

    while( i <= n)
        {product = product * i;
         i +=1 ;}
    System.out.print(product);
    

}
}