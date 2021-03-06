/*
 * Problem Statement:
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring.
 * (e.g.,"waterbottle"is a rota- tion of"erbottlewat").
 */

public class Solution9M {

    private static boolean IsRotation(String s1, String s2){
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        String s1New = s1 + s1;
        return isSubstring(s1New.toLowerCase(), s2.toLowerCase());
        }

	private static boolean isSubstring(String s1New, String s2) {
        return s1New.contains(s2);
	}
}

/* 
 * Testcases:
 * 
 * T1: input = ("wizard","zardwiz") --> false
 * T2: input = ("wizard","") --> false
 * T3: input = (null,"zardwiz") --> false
 * T4: input = ("waterbottle","erBottlEwat") --> true
 * 
 */