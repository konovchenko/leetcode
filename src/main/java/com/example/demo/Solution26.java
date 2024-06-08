package com.example.demo;

/**
 * 26. Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
 * that each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they
 * were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
