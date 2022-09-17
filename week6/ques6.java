package week6;

public class ques6 {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,7,3,2,1,6,11,14,54,85,98};
        int max = arr[0];
        int temp;

        for (int i = 0; i <= arr.length-1; i++) {
            if( arr[i] > max){
                temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        for(int j = 0; j <= arr[arr.length-1] ; j++){
        System.out.print(arr[j] + " ");
    }
    }
}
