
/*
 * Given two string, identify if they are anagrams of each other.
 * Anagram is a word formed by rearranging the letters of another typically using all letters only once.
 * 
 */
import java.util.Arrays;

public class Solution3M 
{
    private static boolean CheckAnagram(String inputString1, String inputString2){
        //Empty string, null and length check
        if((inputString1 == null || inputString1.isEmpty()) ||
            (inputString2 == null || inputString2.isEmpty()))
            return false;

        if(inputString1.length() != inputString2.length())
            return false;
        
        //Convert to character array and sort
        char[] temp1 = inputString1.toLowerCase().toCharArray();
        char[] temp2 = inputString2.toLowerCase().toCharArray();
        Arrays.sort(temp1);  
        Arrays.sort(temp2);

        for(int i = 0; i < inputString1.length(); i++){
            if(temp1[i] != temp2[i])
            return false;
        }
        return true;
    }
}

/*
Testcases:

T1: inputStrings = {"Quidditch", "Tiddquich"} --> true
T2: inputStrings = {"", ""}                   --> false
T3: inputStrings = {"qwerty12", "123efr"}     --> false
T4: inputStrings = {"hello", null}            --> false
T5: inputStrings = {"Wizard", "Darwiz"}       --> true
*/
