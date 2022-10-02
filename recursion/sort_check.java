// Check if the array is sorted or not

package recursion;

public class sort_check {
    public static boolean check(int[]arr, int i){
        
        if(i == arr.length-1){
            // System.out.println(sorted);
            return true;
        }
        if(arr[i] >= arr[i+1]){
                return false;
            }
            else{
                return check(arr,i+1);
            }
    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr, 0));
    }
}


