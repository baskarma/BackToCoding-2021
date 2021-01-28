/* 
 * Problem Statement:
 * a.Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees.
 * b.Can you do this in place?
 */
public class Solution7M {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(RotateMatrix(matrix));
    }

    private static int[][] RotateMatrix(int[][] matrix){
        if(matrix.length != matrix[0].length)
            return matrix;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j > matrix.length; j--){
                
            }
        }
        return matrix;
    }
}
