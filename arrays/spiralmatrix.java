import java.util.Scanner;



public class spiralmatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("ENter the number of coloumns: ");
        int coloumns = sc.nextInt();
        int [][] numbers = new int [rows][coloumns];
        
        // Input 
        // Rows
        for(int i = 0; i < rows ;i++ ){
            // coloumns
            for (int j = 0 ; j < coloumns ; j++){
                System.out.print("ENter the values for the cell (" + (i) + "," + j + ")");
                numbers[i][j] = sc.nextInt();   // This is basically just adding values to cells. Eg: 2 in (0,0)
            }
        }

        // Output
        for(int k = 0 ; k < coloumns/2 ; k++ ){     

            int i = 0;
            int j= 0;
            for (;i < rows -k ; i++)
                System.out.println(numbers [i][j]);
                
            for (;j < coloumns -k ; j++)
                System.out.println(numbers [i][j]);
                
            for (;i < rows - k ; i--)
                System.out.println(numbers [i][j]);
                
            for (;j < coloumns - k ; j++)
                System.out.println(numbers [i][j]);
                
            }
            sc.close();

        }
        
    }

        