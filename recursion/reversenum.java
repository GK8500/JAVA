package recursion;

public class reversenum {
    public static void rev(int n) {
        if(n < 10){
            System.out.println(n);
            return;
        }
        System.out.print(n% 10);
        rev(n/10);
    }

    public static void main(String[] args) {
        int n = 554824;
        rev(n);
    }
}
