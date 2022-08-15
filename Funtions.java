
// import java.util.*;                                                         //def printMyName(name):
// public class Funtions {                                                         //print(name)
// public static void printMyName(String name) {                                   //
// System.out.println(name);                                                       // return(name)
// return;
// }


// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String name = sc.next();
// printMyName(name);// call kiya function ko
// }
// }



import java.util.*;                                                         //def printMyName(name):
public class Funtions {                                                         //print(name)
public static int calculate(int a, int b){
    int sum =  a + b;
    return sum;
}



public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no: ");
int a = sc.nextInt();
System.out.println("Enter a no: ");
int b = sc.nextInt();

int sum = calculate(a, b);// call kiya function ko
System.out.println(sum);
sc.close();
}

}



