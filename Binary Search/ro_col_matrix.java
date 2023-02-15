import java.util.Arrays;

public class ro_col_matrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,8)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }


//    static int[] search(int[][] matrix, int target) {
//        int r = 0;
//        int c = matrix[0].length - 1;
//
//        while (r < matrix.length && c >= 0) {
//            if (matrix[r][c] == target) {
//                return new int[]{r, c};
//            }
//            if (matrix[r][c] < target) {
//                r++;
//            } else {
//                c--;
//            }
//        }
//        return new int[]{-1, -1};
//    }
}

