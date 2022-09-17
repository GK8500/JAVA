package week5;
public class ques2 {
    public static void main(String[] args) {
        int arr[] = {1,2,6,5,9,3,5};
        int sum = 0;

        for(int i = 0 ; i < arr.length; i++) {
            
            sum = sum + arr[i];

        }
        System.out.println("Sum of digits: " + sum);
    }
}
