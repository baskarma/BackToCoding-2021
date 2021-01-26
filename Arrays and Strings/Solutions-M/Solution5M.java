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
     public static void main(String[] args){
        System.out.println(ReplaceSpacesInString("Hel lo"));
     }

     private static String ReplaceSpacesInString(String input){
        if(input.isEmpty() || input == null)
            return null;
        int spaceCount = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                spaceCount++;
            }
        }

        int newLength = input.length() + spaceCount * 2;

        char[] temp = new char[newLength];
        temp = input.toCharArray();

        /*for(int j = newLength; j >=0; j--){
            if(temp)
        }*/
        
        return temp.toString();
     }
 }