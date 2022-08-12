import java.util.*;

public class dowhile
 {public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      int n = 1;
       int i =sc.nextInt() ;
       do{
           System.out.println(i + "X" + n + "=" + (i * n));
           // i ++;
           n ++ ;
        } while( n < 11);
   }
}}
