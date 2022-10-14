import java.util.Scanner ;


public class TwoDarays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int coloumns = sc.nextInt();
        int [][] numbers = new int [rows][coloumns];
        
        // Input 
        // Rows
        for(int i = 0; i < rows ;i++ ){
            // coloumns
            for (int j = 0 ; j < coloumns ; j++){
                System.out.print("Enter the values for the cell (" + (i) + "," + (j) + ")");
                numbers[i][j] = sc.nextInt();   // This is basically just adding values to cells. Eg: 2 in (0,0)
            }
        }

        // output
        for(int i=0; i<rows; i ++) {
            for(int j=0; j<coloumns; j ++) {
            System.out.print(numbers [i] [j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}