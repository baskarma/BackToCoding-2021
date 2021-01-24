/*
 * Problem Statement:
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

 public class Solution4M {
     //public static void main(String[] args){
     //   System.out.println(HasUniqueCharacters("VIbgyor"));
     //}
     
     // No additional data structures. Implement with HashMap next.
     private static boolean HasUniqueCharacters(String input){
        if(input.isEmpty() || input == null)
            return false;
        
        char[] inputString = input.toCharArray();

        for(int i = 0; i < input.length(); i++)
        {
            for(int j = i+1; j <input.length(); j++)
            {
                if(inputString[i] == inputString[j])
                    return false;
            }
        }
        return true;
     }
 }

/*
 * Testcases:
 * T1: input = "Hello"   --> false
 * T2: input = ""        --> false
 * T3: input = "VIbgyoR" --> true
 * T4: input = null      --> false
 */