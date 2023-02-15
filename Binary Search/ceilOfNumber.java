// find the ceilling of a number
// ceil of a number is the smallest number greater than target

public class ceilOfNumber {
    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9};
        int target = 6 ;
        int ans = ceil(arr,target);
        System.out.println(ans);
    }

}
