// Find the maximum & minimum number in an array of integer

// package arrays;
// import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        // int  temp;
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter no. of elements you want in array:");
        // n = s.nextInt();
        // int a[] = new int[n];
        int a[] = new int[]{1,2,3,4,5,6,7};

        // // input
        // System.out.println("Enter  the elements:");
        // for (int i = 0; i < n; i++) {
        //     a[i] = s.nextInt();
        // }


        // output   [bubble sort]
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // s.close();
        System.out.println("maximum values is: " + a[7 - 1]);

        System.out.print("Minimum value is: " + a[0]);
    }

}