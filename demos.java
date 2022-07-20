// import java.time.Period;
import java.util.*;

public class demos {
public static void main(String args[])
{
    int len , br , area , peri;
    Scanner ar =  new Scanner(System.in);
    System.out.print("Enter Lenght: ");
    len = ar.nextInt();
    System.out.print("Entr Breadth: ");
    br = ar.nextInt();
    area = len * br ; 
    System.out.println("Area = " + area);
    
    peri = 2*(len + br) ; 
    System.out.print("Perimeter = " + peri);


}
}
