package recursion;

public class TowerOfHanoi {
    
    public static void TOH(int n , String src , String helper, String Dest) {

        if(n ==1){
            System.out.println("Tansfer disk " + n + " From " + src + " to " + Dest);
            return;
        }

        TOH(n-1 , src,Dest,helper);
        System.out.println("Tansfer disk " + n + " From " + src + " to " + Dest);
        TOH(n-1, helper, src, Dest);
    }
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "S", "H", "D");
    }
}
