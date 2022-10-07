public class merge_sort{
    static int count = 0; // debugging   

    public static void conquer(int arr[],int start,int end, int mid){
        int merged[] = new int[end - start + 1];
        int indx1 = start;      // for first array
        int indx2 = mid + 1;        // for second part of array
        int x = 0;              // for merged array

        while (indx1 <= mid && indx2 <= end) {
            if(arr[indx1] <= arr[indx2]){
                merged[x] = arr[indx1];
                x++ ;
                indx1++ ;
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1 <= mid){
            merged[x++] = arr[indx1++];
        }
        
        while(indx2 <= end){
            merged[x++] = arr[indx2++];
        }
        for (int i=0 , j = start; i < merged.length; i++ , j++) {
            arr[j] = merged[i];
        }

    }


    public static void divide(int arr[] , int start , int end ){
        if(start >= end){
            return;
        }
        

        int mid = (start+ end)/2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, end, mid);
        count ++ ;
    }

    public static void main(String[] args) {
      int arr[] = {6,8,7,2,89,23};
      int n = arr.length;
       divide(arr, 0, n-1);
       
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
       System.out.println();
       System.out.println(count);
    }
}