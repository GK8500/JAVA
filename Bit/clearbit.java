package Bit;

public class clearbit {

    public static void main(String[] args) {
        
    
    int n = 5;
    int pos = 2;
    int bitMask = 1 << pos;
    int NotbitMask = ~(bitMask);

    int newNumber = NotbitMask & n;

    System.out.print(newNumber);

}
}