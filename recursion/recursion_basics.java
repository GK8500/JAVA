package recursion;

public class recursion_basics {
    public static void printN(int n) {

        if(n == 0) {
            return;
        }
        System.out.print(n);
        printN(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        printN(n);
    }
}


