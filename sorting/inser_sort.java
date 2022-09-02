package sorting;

public class inser_sort {
    public static void main(String[] args) {
        int arr[] = {8,9,3,5,6,4};
        //  taking the 0th element as a sorted element.
        for(int i = 1; i<arr.length;i++) {   // this is for traversing in the unsorted part 
            int current = arr[i];           // current is th element to be compared 
            int j = i-1;                    // j is the index of last sorted element 

            while(j>=0 && current < arr[j]) {   //j should'nt be less than zero as zero is the last index and the loop should also run till the current element is less than those in sorted part so that it is placed just before the element larger than the current number
                arr[j+1] = arr[j];      // keep assigning values to the current number so that it moves up the array
                j--;        // since we are traversing from the back side or the last element of the array we are using j--
            }

            // assigning new index
            arr[j+1] = current;
        }
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
