public class practice {
    // public static boolean isPalindrome(String str){ 
    //     int count = 0;
    //     if(str.length() == 0 || str.length() ==1){
    //         return true;
    //     }
    //     if((str.charAt(0)) == str.charAt(str.length() -1)){
    //         count ++ ;
    //         System.out.println(count);
    //         return isPalindrome(str.substring(1, str.length()-1));
    //     }
    //     return false;
    // }  

    // public static String binary(int num , String num) {
    //     // String num = "";
    //     if(num == 0){
    //         return num;
    //     }
    //     num = (num % 2) + num;
    //     // num =num/2;
    //     return binary(num/2 ,num);
    // }

    // public static int summation(int n) {
    //     if(n == 0){
    //         return n;
    //     }
    //     return n + summation(n-1);
    // }


    public static int binarySearch(int[] a , int start , int end , int num) {
        if(start > end){
            return 66;
        }

        int mid =(start + end)/2;

        if(num == a[mid]){
            return mid;
        }
        else if(num > a[mid]){
            return binarySearch(a, mid+1, end, num);
        }
        return binarySearch(a, start, mid -1 , num);
    }
        
    
    public static void main(String[] args) {
        // String str = "hamah";
        // System.out.println(isPalindrome("racecar"));
        // System.out.println(binary(25,""));
        // System.out.println(summation(5));
        // int a[] = new int[10];
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println( "The element is at the position " + (binarySearch(a, a[0], a[a.length-1], 10)));
        
    }
}



