/*
* Problem Statement:
* Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
* In Pascal's Triangle, each number is the sum of the two numbers directly above it.
* Input: 5
* Output:
* [
*      [1],
*     [1,1],
*    [1,2,1],
*   [1,3,3,1],
*  [1,4,6,4,1]
* ]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution12M {
    public static void main(String args[]){
        int numRows = 1;
        System.out.println(GeneratePascalTriangle(numRows));
    }

    public static List<List<Integer>> GeneratePascalTriangle(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<List<Integer>>();
        
        if(numRows <= 0)
            return pTriangle;
        if(numRows >= 1)
        {
            List<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1));
            pTriangle.add(row1);
        }
        if(numRows >= 2)
        {
            List<Integer> row2 = new ArrayList<Integer>(Arrays.asList(1,1));
            pTriangle.add(row2);
        }
        for(int i = 2; i < numRows; i++)
        {
            List<Integer> subRow = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    subRow.add(j,1);
                }
                else
                {
                    List<Integer> value = pTriangle.get(i-1);
                    int newValue = value.get(j-1) + value.get(j);
                    subRow.add(j, newValue);
                }
            }
            pTriangle.add(subRow);
        }
        return pTriangle;
    }
}

/*
 * Testcases:
 * 
 * T1: numRows = -1 --> []
 * T2: numRows = 0  --> []
 * T3: numRows = 1  --> [[1]]
 * T4: numRows = 5  --> [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
 */

