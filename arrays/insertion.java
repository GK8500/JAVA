import java.util.*;

public class insertion {
    public static void main(String args[]) {
        int i;

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("enter the elements of array: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("enter the element you want to insert: ");
        int s = sc.nextInt();
        System.out.println("enter the position where you want to insert: ");
        int pos = sc.nextInt();

        System.out.println("------------------------------------------------------");
        for (i = size; i >= pos; i--) {
            arr[i + 1] = arr[i];

        }
        arr[pos] = s;

        for (i = 0; i < size + 1; i++) {

            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}