import java.util.Scanner;

public class leaderElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println(arr.length);
        System.out.print("How many elements do you want in the array: ");
        int num = sc.nextInt();
        // INPUT

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // LOGIC
        System.out.println("leader element ");
        int max = arr[num-1];                     //  <--
        System.out.println(max);
        for (int i = num-1; i >= 0; i--) {
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}




// import java.util.*;
// public class leaderElement {
//     public static void main(String args[])
//     {
//         int n;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter no. of elements you want in array:");
//         n = s.nextInt();
//         int a[] = new int[n];
//         System.out.println("Enter  the elements:");
//         //arr input
//         for (int i = 0; i < n; i++) {
//             a[i] = s.nextInt();
//         }
//         //finding leader element
//         int max=a[n-1];
//         System.out.println("YOUR LEADER ELEMENTS ARE: ");
//         for(int i=n-1;i>=0;i--){
//             if(i==(n-1)){
//                 System.out.println(a[i]);

//             }
//             if(a[i]>max){
//                 max=a[i];
//                 System.out.println(max);
//             }
//             s.close();
           

//         }
//     }
    
// }