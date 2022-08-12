// import java.util.*;

// public class pattern {

    
//     public static void main(String args[]) {
//         Scanner cal = new Scanner(System.in);

//         // int i = 0;
//         // int j = 0;

//     for (int i = 0 ; i < 4; i++)
//     {
//         for (int j = 0; j < 5 ; j++)
//             {System.out.print("*");} 
//             System.out.println();  
//     }   
    

// }
// }
import java.util.*;
public class pattern {
public static void printMyName(String name) {
System.out.println(name);
return;
}

    public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.next();
        printMyName(name);// call kiya function ko
    }
    }
}