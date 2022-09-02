// import java.io.*;
import java.util.*;
// import java.math.*;

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc =new Scanner(System.in);
    String email = sc.nextLine();
    String username = "";

    for (int i = 0 ; i < email.length() ; i++ ){
        if (email.charAt(i) == '@'){
        break;
    }

        else
            username += email.charAt(i); 
    }
    System.out.println(username);
    sc.close();
}
}










// public class Solutions {

// public static void main(String args[]) {
//     Scanner sc = new Scanner (System.in);
//     String email = sc.next();
//     String userName = "";

//     for(int i=0; i<email.length(); i++) {
//       if(email.charAt(i) == '@') {
//        break;
//       } else {
//         userName += email.charAt(i);
//       }
//     }

//     System.out.println(userName);
//   }
// }
