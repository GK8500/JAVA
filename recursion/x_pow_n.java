package recursion;

public class x_pow_n {
    public static Double pow(int i , int j2) {
        if (j2 == 0) {
            return 1.0;
        }

        else if(i ==0) {
            return 0.0;
        }
        Double j = i * Math.pow(i ,j2-1);
        j = Math.pow(i, j2);
        return j;

        
    }

    public static void main(String[] args) {
        Double ans = pow(2, 5);
        System.out.println(ans);

    }
}


// public class recursion {
    // public static int calcPower(int x, int n) {
    // if(n == 0) { // base case 1
    // return 1;
    // }
    // if(x == 0) { // base case 2
    // return 0;
    // }
    // int xPownm1 = calcPower(x, n-1); // kaam
    // int xPown = x * xPownm1;
    // return xPown;
    // }
    
    // public static void main(String args[]) {
    // int x = 2, n = 5;
    // int ans = calcPower(x, n);
    // System.out.println(ans);
    // }
    // }
