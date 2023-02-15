// in a given array, find the first and last occurance of the target number

public class first_and_last_occurence_LC {
    public static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        int start = search(nums , target, true);
        int end = search(nums , target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int search(int[] nums,int target,boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + (end - start))/2;
            if(target > nums[mid]){
                start = mid +1;
            } else if (target < nums[mid]) {
                end = mid -1;
            } else{
                ans = mid;
                if(findStart){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,7,7,8,8,10};
        int target = 7;
        int[] j = searchRange(nums,target);
        for(int i = 0; i < j.length-1; i ++){
            System.out.print(j[i]);
        }
    }
}
