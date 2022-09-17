import java.util.function.DoubleToIntFunction;

public class diamond {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <=5; i++) {
            for (int space = i; space <= 5; space++) {
                System.out.print(" ");
                
            }

            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        

        for (int i = 5; i >=0; i--) {
            for (int space = i; space <= 5; space++) {
                System.out.print(" ");
                
            }

            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
