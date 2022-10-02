//  Print the sunsequences of a string.
//  Subsequences are the words made from charecters of a string in the nsame order.  For example : mad is a subsequence of Hammad but dam is not.


package recursion;

public class subsequence {
    public static int count = 0;
    public static void subsequences(String str , int indx , String newString) {
    if(indx == str.length()){
        System.out.println(newString);
        
        return;
    }        
    char currChar = str.charAt(indx);
    subsequences(str, indx+1, newString+currChar);
    count ++;
    subsequences(str, indx+1, newString);
    count ++ ;

    }
    public static void main(String[] args) {
        String str = "hammad";
        subsequences(str, 0, "");
        System.out.println(count);
    }
}
