package sorting;

public class selection_sort {
    public static void main(String[] args) {
        
    
    int arr[] = {7,8,6,2,3,1,4};

    // selection sort

    for(int i = 0; i < arr.length-1 ; i++) {            // get to the next element in the array
        int smallest = i;
        
        for(int j = i + 1 ; j < arr.length; j++) {      // get to the next index in array. For eg in array [1,2,4,6,5,8,7] , the smallest index is 2nd as it was sorted in the last step so we will continue sorting from 3rd index. 
            if(arr[smallest] > arr[j]) {                // basically for replacing the smallest number if there is a change needed.
                smallest = j;
                // System.out.println(j);
            }  
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
        
    }
    for(int i = 0 ; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
