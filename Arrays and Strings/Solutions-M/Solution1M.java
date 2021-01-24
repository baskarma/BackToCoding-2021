/*
 * Problem statement: Remove all duplicate characters from the given string.
 */

public class Solution1M
{
    private static String RemoveDuplicatesInString(String inputString){
        if(inputString == null || inputString.isEmpty())
            return null;

        StringBuilder sb = new StringBuilder("");
        char temp[] = inputString.toCharArray();

        for(int i = 0; i < inputString.length(); i++){
            boolean flag = false;
            for(int j = 0; j < i; j++){
                if(Character.toLowerCase(temp[i]) == Character.toLowerCase(temp[j])){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                sb.append(temp[i]);
        }    
        return sb.toString();
    }
}

/* Testcases:

T1: inputString = "Hello World"      --> "Helo Wrd"
T2: inputString = "   Megaa mind"    --> " Megaind"
T3: inputString = ""                 --> null
T4: inputString = "  qwerrrty122242" --> " qwerty124"
T5: inputString = null               --> null
*/