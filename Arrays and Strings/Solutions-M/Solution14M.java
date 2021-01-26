/* 
 * Problem Statement:
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the result.
 */

public class Solution14M {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] newArr = new int[m*n];
        
        int i = 0, j = 0;
        boolean isUp = true;
        
        for(int k = 0; k < m*n;){
            if(isUp){
                for(;i>=0 && j < n; j++, i--){
                    newArr[k] = matrix[i][j];
                    k++;
                }
                if(i<0 && j<=(n-1))
                {
                    i=0;
                }
                if(j==n){
                    i+=2;
                    j--;
                }
            }
            else{
                for(;j>=0 && i < m; i++,j--){
                    newArr[k] = matrix[i][j];
                    k++;
                }
                if(j<0 && i<=(m-1)){
                    j=0;
                }
                if(i==m){
                    j+=2;
                    i--;
                }
            }
            
            isUp = !isUp;
        }
        return newArr;
    }
}

/* 
 * Testcases:
 * 
 * T1: inputMatrix: {{1,2},{4,5},{7,8}} --> {1,2,4,7,5,8}
 * T2: inputMatrix: {{11,2,36},{14,25,6},{7,28,9}} --> {11,2,14,7,25,36,6,28,9}
 * T3: inputMatrix: {{11,22,33}} --> {11,22,33}
 * T4: inputMatrix: {{}} --> {}
 */