/* 
 * Identify if the given string is a palindrome. 
 */

public class Solution2M 
{    
    private static boolean CheckForPalindrome(String inputString){
        if(inputString == null || inputString.isEmpty())
            return false;

        StringBuilder sb = new StringBuilder(inputString.toLowerCase());
        return sb.reverse().toString().equals(inputString.toLowerCase());
    }
}

/*
Testcases:

T1: inputString = "madam"           --> true
T2: inputString = ""                --> false
T3: inputString = " yythtyy "       --> true
T4: inputString = null              --> false
T5: inputString = "hodoh h odoh"    --> false
T6: inputString = "Aas bb c bb saa" --> true
*/