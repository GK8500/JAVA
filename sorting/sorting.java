package sorting;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int  temp;
        Scanner s = new Scanner(System.in);
        // System.out.print("Enter no. of elements you want in array:");
        // n = s.nextInt();
        int[] a = new int[]{1,5,6,3,2,7,8,9,4,10};
        // System.out.println("Enter  the elements:");
        // for (int i = 0; i < 10; i++) {
        //     a[i] = s.nextInt();
        // }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted  Order:");
        for (int i = 0; i <= 10 - 1; i++) {
            System.out.print(a[i] + ",");
        }


        s.close();
    }
}