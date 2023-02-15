public class floor {
    static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9};
        int target = 6;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
}
