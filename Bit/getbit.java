package Bit;

public class getbit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2 ;
        int bitMask = 1 << pos;  // shifts 1 to third position
        
        if ((bitMask & n) == 0) {
            System.out.println("Bit was Zero.");
        }
        else {
            System.out.println("BIt was one.");
        }
    }
}
