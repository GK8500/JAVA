package Bit;

public class setbit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2 ;
        int bitMask = 1 << pos;  // shifts 1 to third position

        int newNumber = bitMask | n ;
        System.out.println(newNumber);
}
}