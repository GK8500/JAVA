public class bs {
    public static int b_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(end > start){
            int mid = (start + (end - start))/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int target = 6;
        int ans = b_search(arr,target);
        System.out.println(ans);
    }
}
