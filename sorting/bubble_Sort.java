public class bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {3,1,3,3,2};
        
        // bubble sort

        for(int i = 0 ; i < arr.length-1 ; i++) {   // moving to the next element 
            for (int j = 0 ; j < arr.length -1; j ++)  // to replace the index 
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
