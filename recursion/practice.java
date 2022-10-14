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
    public static String binary(int num , String x) {
        // String x = "";
        if(num == 0){
            return x;
        }
        x = x + (num % 2);
        num =num/2;
        return binary(num ,x);
    }
        
    
    public static void main(String[] args) {
        // String str = "hamah";
        // System.out.println(isPalindrome("racecar"));
        System.out.println(binary(223,""));
        
    }
}



