/*
 * Problem Statement:
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.
 */

public class Solution13M {
    /*public static void main(String args[]){
        int[] nums = {};
        System.out.println(getDominantIndex(nums));
    }*/
    public static int getDominantIndex(int[] nums){
        if(nums.length < 1)
            return -1;

        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[index]){
                index = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(index != i && nums[index] < 2 * nums[i]){
                return -1;
            }
        }
        return index;
    }
}

/*
 * Testcases:
 * 
 * T1: nums = {1,1,5,2,0} --> 2
 * T2: nums = {44, 35, 99, 120, 1, 37} --> -1
 * T3: nums = {} --> -1
 * T4: nums = {12, 24, 54, 103, 2, 49, 250} --> 6
 */
