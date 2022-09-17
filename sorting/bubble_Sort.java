package sorting;

public class bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {7,8,6,2,3,1,4};
        
        // bubble sort

        for(int i = 0 ; i < arr.length-1 ; i++) {   // moving to the next element 
            for (int j = 0 ; j < arr.length -1 -i; j ++)  // to replace the index 
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j+1] = temp ;
                // System.out.print(arr[i]);
            }
        }
        
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
