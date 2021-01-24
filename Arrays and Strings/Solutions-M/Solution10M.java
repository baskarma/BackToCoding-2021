
/*
Question:
Given an integer, write a function to return its roman numeral representation.
Note: The largest number you can write in Roman numerals is 3,999.
Example:
integerToRoman(1)  = "I"
integerToRoman(4)  = "IV"
integerToRoman(49) = "XLIX"
*/

public class Solution10M{
    private static final String[] romanValues = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
        "V", "IV", "I"};
    private static final int[] integerValues = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
    //public static void main(String args[]){
    //    System.out.println(integerToRoman(0));
    //}

    public static String integerToRoman(int num){
        StringBuilder sb = new StringBuilder();
        if(num > 3999 || num < 1)
            return "Invalid integer value!";
        int i = 0;
        while(num > 0){
            if(num - integerValues[i] >= 0){
                sb.append(romanValues[i]);
                num -= integerValues[i];
            }
            else
                i++;
        }

        return sb.toString();
    }
}

/*
Testcases:

T1: num = 0     --> Invalid integer value!
T2: num = -1    --> Invalid integer value!
T3: num = 13    --> XIII
T4: num = 3362  --> MMMCCCLXII
*/