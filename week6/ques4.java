package week6;

public class ques4 {
    public static void main(String[] args) {

    int[] arr = {5,6,3,2,10,4,7,8,9};
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(max < arr[i]){
            max = arr[i];

        }
    }
    System.out.println(max);
    
}
}
