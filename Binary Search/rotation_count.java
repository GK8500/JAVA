public class rotation_count {
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findKRotation(int arr[], int n){
        int Pivot = findPivot(arr);
        if(Pivot == arr.length-1){
            System.out.println(Pivot);
            return 0;
        }else if(Pivot == 0){
            System.out.println(Pivot);
            return 1;
        }

        int k = (n - 1)- Pivot ;
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2,3};
        System.out.println(findPivot(nums));
    }
}
