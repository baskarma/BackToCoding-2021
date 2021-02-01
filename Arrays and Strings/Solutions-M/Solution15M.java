/* 
 * Problem Statement:
 * There are three types of edits that can be performed on strings : 
 * insert, 
 * remove 
 * or replace a character.
 * Given two strings, write a function to check if they are one edit( or zero edits) away.
 */
public class Solution15M {
   
   private static boolean isOneEditAway(String s1, String s2){
      boolean val = false;
      if(s1 == null || s2 == null)
         return val;
      
      if(s1.length() == s2.length())
         val = Replace(s1, s2);

      if((s1.length() - 1 == s2.length()) || (s1.length() + 1 == s2.length()))
         val = InsertOrRemove(s1, s2);
      
      return val;
   }

   private static boolean Replace(String s1, String s2) {
      int diffCount = 0;
      for(int i = 0; i < s1.length(); i++){
         if(s1.charAt(i) != s2.charAt(i))
            diffCount++;
      }
      if(diffCount == 1)
         return true;
      else
         return false;
   }

   private static boolean InsertOrRemove(String s1, String s2) {
      if(Math.abs(s1.length() - s2.length()) > 1)
         return false;
      
      String first = s1.length() > s2.length() ? s1 : s2;
      String second = s1.length() < s2.length() ? s1 : s2;

      int i = 0;
      int j = 0;
      while(i < first.length() && j < second.length()){
         if(first.charAt(i) != second.charAt(j)){
            if(i != j)
               return false;
            i++;
         }
         else
         {
               i++;
               j++;
         }
      }
      return true;
   }
}

/* 
 * Testcases : 
 * 
 * T1 : input = ("pale", "bale") --> true
 * T2 : input = ("gain", "gail") --> true
 * T3 : input = ("pose", "poise") --> true
 * T4 : input = (null, "still") --> false
 * T5 : input = ("Ball", "bale") --> false //case-sensitive
 * T6 : input = ("dog ", "god") --> false //white-space sensitive
 *
 */