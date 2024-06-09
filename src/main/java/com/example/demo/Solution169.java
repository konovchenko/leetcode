package com.example.demo;

/**
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority
 * element always exists in the array.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * <p>
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class Solution169 {

    /**
     * there are 3 options:
     * 1. O(n log n) time: sort array and take the middle element
     * 2. O(n) space: HashMap with counts
     * 3. O(n) time and space: Boyer-Moore majority vote algorithm
     *
     * @link <a href="https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm"/>
     * Here we use siplified version with only one pass, as it is set that the majority is guaranteed in passed
     * array
     * <p>
     * Initialize an element m and a counter c with c = 0
     * For each element x of the input sequence:
     *  If c = 0, then assign m = x and c = 1
     *  else if m = x, then assign c = c + 1
     *  else assign c = c − 1
     * Return m
     */
    public int majorityElement(int[] nums) {

        int c = 0;
        int m = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                m = nums[i];
                c++;
            } else if (m == nums[i]) {
                c++;
            } else {
                c--;
            }
        }

        return m;
    }
}
