import java.util.*;
public class Distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter The First Point: ");
         int a = sc.nextInt();
         System.out.print("Enter The seconf point: ");
         int b = sc.nextInt();

         int dis = b- a ;
         System.out.println("The distance between the two points is : " + dis);
         sc.close();
    }
}
