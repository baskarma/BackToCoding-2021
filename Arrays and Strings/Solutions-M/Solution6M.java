/* 
 * Problem Statement:
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.
 */

public class Solution6M {

    public static void main(String[] args){
        System.out.println(CompressString("12qwereeeqwsdfg"));
    }
    private static String CompressString(String input){
        if(input.isEmpty() || input == null)
            return null;

        StringBuilder sb = new StringBuilder();
        int charCount = 1;

        for(int i = 0; i<input.length();i++){
            if((i+1 < input.length()) && (input.charAt(i) == input.charAt(i+1))){
                charCount++;
            }
            else{
                sb.append(input.charAt(i));
                sb.append(charCount);
                charCount = 1;
            }
        }
        if(sb.length() >= input.length())
            return input;
        else
            return sb.toString();
    }
}

/* 
 * Testcases:
 * 
 * T1: input = "aabccccaaa" --> "a2b1c4a3"
 * T2: input = "   " --> " 3"
 * T3: input = "" --> null
 * T4: input = "1111ffrgyhst" --> "1111ffrgyhst"
 */