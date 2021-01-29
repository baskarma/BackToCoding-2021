/* 
 * Problem Statement:
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */

public class Solution8M {
    public static void main(String[] args){
        int[][] matrix = {{1,0,5,2}, {2,2,4,4}, {1,4,5,0}};
        int m = matrix.length;
        int n = matrix[0].length;
        PrintMatrix("Original :", matrix);
        PrintMatrix("Modified :", CheckMatrixForZeroAndReplaceRowColumns(matrix, m, n));
    }

    private static void PrintMatrix(String msg, int[][] matrix) {
        System.out.println(msg);
        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static int[][] CheckMatrixForZeroAndReplaceRowColumns(int[][] matrix, int m, int n) {
        if(m < 2 && n < 2 || matrix == null)
            return matrix;
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for(int k = 0; k < row.length; k++){
            if(row[k])
                SetRowToZero(k, matrix);
        }

        for(int k = 0; k < column.length; k++){
            if(column[k])
                SetColumnToZero(k, matrix);
        }
        return matrix;
    }

    private static void SetRowToZero(int rowIndex, int[][] matrix) {
        for(int k = 0; k < matrix[0].length; k++){
            matrix[rowIndex][k] = 0;
        }
    }
    private static void SetColumnToZero(int columnIndex, int[][] matrix) {
        for(int k = 0; k < matrix.length; k++){
            matrix[k][columnIndex] = 0;
        }
    }
}
