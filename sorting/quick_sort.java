// // how to implement quick sort ?

//     public static void qsort(int[] a, int si, int ei){
//     //base case
//     if(ei<=si || si>=ei){}

//     else{ 
//         int pivot = a[si]; 
//         int i = si+1; int tmp; 

//         //partition array 
//         for(int j = si+1; j<= ei; j++){
//             if(pivot > a[j]){
//                 tmp = a[j]; 
//                 a[j] = a[i]; 
//                 a[i] = tmp; 

//                 i++; 
//             }
//         }

//         //put pivot in right position
//         a[si] = a[i-1]; 
//         a[i-1] = pivot; 

//         //call qsort on right and left sides of pivot
//         qsort(a, si, i-2); 
//         qsort(a, i, ei); 
//     }
// }

public class quick_sort{
    public static void swap(int n1 , int n2){
        int temp = n1;
        n1 = n2 ;
        n2 = temp;
    }
    public void partition(int[] arr , int start , int end) {
        int count = 0;
        int pivot = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(pivot > arr[i]){
                count ++;
            }
            int pivotIndex = start + count;
            swap(arr[pivotIndex], arr[s] );
        }
         
    }

    public void quickSort(arr , int start , int end){
        if(start >= end){
            return;
        }
        int p = partition(arr, start, end); 
        quickSort(arr , start , p-1);
        quickSort(arr , p+1 , end);

    }


}
