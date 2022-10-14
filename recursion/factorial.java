// package recursion;

public class factorial {
    public static int printFac(int n) {
        if (n == 1 || n == 0){
            
            return 1;
        }
        // int fac_nm1 = printFac(n-1);
        // int fac_n = n * printFac(n-1);
        return n * printFac(n-1);
        // return fac_n;
        
    }
    public static void main(String[] args) {
        int ans = printFac(5);
        System.out.println(ans);
    }
}
