import java.util.Scanner;



public class palindrome_str {
    // public static void main(String[] args) {
        public static void main(String[] args) {
        
            Scanner st = new Scanner(System.in);
            
            System.out.print("Enter a string: ");
            String str = st.nextLine();
            String rev = "";
            int length = str.length();
            for ( int i = length - 1; i >= 0; i-- ){
               rev = rev + str.charAt(i);
            }
            if ((str.toLowerCase()).equals((rev.toLowerCase()))){
               System.out.println(str+" is a palindrome");
            }
            else{
               System.out.println(str+" is not a palindrome");
            }
            st.close();
        }
    }
