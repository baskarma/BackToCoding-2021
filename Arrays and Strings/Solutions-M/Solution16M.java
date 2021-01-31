/*
 * Problem Statement: 
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0. 
 */
public class Solution16M {
    public static void main(String args[]){
        System.out.println(addBinary("", "1010"));
    }

    public static String addBinary(String a, String b) {
        if((a.isEmpty() || a == null) ||
            (b.isEmpty() || b == null))
            return null;

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i) - '0';
            if(j >= 0)
                sum += b.charAt(j) - '0';
            
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
            
        }
        if(carry>0)
            sb.append(1);
        return sb.reverse().toString();
    }
}

/*
 * Testcases:
 * 
 * T1: input = "11", "1" --> "100"
 * T2: input = "1001", "1010" --> "10011"
 * T2: input = "", "1111" --> null
 */