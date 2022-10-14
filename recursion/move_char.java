// move a given charecter to the end of the string

// package recursion;

public class move_char {
    public static void move(String str, int indx , String newString, int count) {

        // Base case

        if(indx == str.length()){
            for (int i = 0; i < count; i++) {
                newString += "x";
            }
            System.out.println(newString);
        }

        // recursive condition  
         if(str.charAt(indx) == 'x'){
            count ++ ;
            move(str, indx+1, newString, count);
               
         }
         else if(str.charAt(indx) != 'x'){
            newString += str.charAt(indx);
            move(str, indx+1, newString, count);
         }
         return;
          

    }
    public static void main(String[] args) {
        String str = "axbcxxdx";
        move(str, 0, "", 0);
    }
}
