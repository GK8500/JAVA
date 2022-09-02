package recursion;

public class fibonacci {
//     public static int fib(int n) {
//         if(n == 0) {
//             return 0;

//         }
//         // int n1 = fib(n);
//         int n2 = n + fib(n-1) ;
//         return n2;
        
//     }
//     public static void main(String[] args) {
//        int ans = fib(7);
//        System.out.println(ans);
//     }
// }

// public class Recursion1 { 
    public static void printFib(int a, int b, int n) {
        if(n == 0) {
        return;
    }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    
    public static void main(String args[]) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n-2);
    }
}