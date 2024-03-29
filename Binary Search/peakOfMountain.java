public class peakOfMountain {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                // ans found
                return mid;
            } else if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {

                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
