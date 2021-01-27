/* 
 * Problem Statement:
 * 
 * Write a method to replace all spaces in a string with'%20'.
 * You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the "true" length of the string. 
 * (Note: for Java, please use a character array so that you can perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith" Output: "Mr%20Dohn%20Smith"
 */

 public class Solution5M {

     private static String ReplaceSpacesInString(char[] input){
        if(input.length == 0 || input == null)
            return null;

        int spaceCount = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == ' '){
                spaceCount++;
            }
        }

        int newLength = input.length + spaceCount * 2;

        char[] temp = new char[newLength];
        
        for(int j = input.length - 1; j >=0; j--){
            if(input[j] == ' '){
                temp[newLength - 1] = '0';
                temp[newLength - 2] = '2';
                temp[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else{
                temp[newLength - 1] = input[j];
                newLength--;
            }
        }
        return String.valueOf(temp);
     }
 }

/* 
 * Testcases:
 * 
 * T1: input = "Hel lo" --> "Hel%20lo"
 * T2: input = "Mr John Smith" --> "Mr%20John%20Smith"
 * T3: input = "   12  A  " --> "%20%20%2012%20%20A%20%20"
 * T4: input = "" --> null
 */