/* 
 * Problem Statement:
 * a.Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees.
 * b.Can you do this in place?
 */
public class Solution7M {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};

        if(matrix.length != matrix[0].length || matrix.length == 0 || matrix == null)
        {
            System.out.println("Invalid Matrix!");
        }
        else
        {
            System.out.println("Original : ");
            PrintMatrix(matrix);
            System.out.println("\nRotated Matrix : ");
            PrintMatrix(RotateMatrix(matrix, matrix.length));
            System.out.println("\nRotated In Place Matrix : ");
            PrintMatrix(RotateMatrixInPlace(matrix, matrix.length));          
        }
    }

    //print the matrix
    private static void PrintMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    
    //Rotate Matrix using new Matrix
    private static int[][] RotateMatrix(int[][] matrix, int n){
        int[][] rotatedMatrix = new int[n][n];
        for(int i = 0 ; i < n; i++){
            int k = n - 1;
            for(int j = 0; j < n; j++){
                rotatedMatrix[i][j] = matrix[k][i];
                k--;
            }
        }
        return rotatedMatrix;
    }

    //Rotate Matrix in place by swapping values
    private static int[][] RotateMatrixInPlace(int[][] matrix, int n){
        for(int i = 0; i < n/2; i++)
        {
            //stepping from outside to inside of the matrix
            int firstRow = i;
            int lastRow = n - i - 1;

            for(int j = firstRow; j < lastRow; j++)
            {
                int offset = j - firstRow;

                int temp = matrix[firstRow][j]; // save top to temp

                matrix[firstRow][j] = matrix[lastRow - offset][firstRow]; //swap left to top
                
                matrix[lastRow - offset][firstRow] = matrix[lastRow][lastRow - offset]; // swap bottom to left
                
                matrix[lastRow][lastRow - offset] = matrix[j][lastRow]; // swap right to bottom
                
                matrix[j][lastRow] = temp; // swap temp to top
            }
        }
        return matrix;
    }
}

/*
 * Testcases:
 * 
 * T1: matrix = {{}} --> Invalid Matrix!
 * T2: matrix = {{1,1,1,1},{2,2,2,2},{3,3,3,3}} --> Invalid Matrix!
 * T3: matrix = {{1,1,1},{2,2,2},{3,3,3}}
 * -->
 * Original : 
 * 
 * 1 1 1 
 * 2 2 2 
 * 3 3 3 
 * Rotated Matrix : 
 * 
 * 3 2 1 
 * 3 2 1 
 * 3 2 1 
 * Rotated In Place Matrix :
 * 
 * 3 2 1 
 * 3 2 1 
 * 3 2 1
 */
