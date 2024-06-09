package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution80Test {

    /**
     * Input: nums = [1,1,1,2,2,3]
     * Output: 5, nums = [1,1,2,2,3,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test1() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = new Solution80().removeDuplicates(nums);
        assertEquals(5, k);
        assertEquals(1, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(2, nums[3]);
        assertEquals(3, nums[4]);
    }

    /**
     * Input: nums = [0,0,1,1,1,1,2,3,3]
     * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
     * Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test2() {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int k = new Solution80().removeDuplicates(nums);
        assertEquals(7, k);
        assertEquals(0, nums[0]);
        assertEquals(0, nums[1]);
        assertEquals(1, nums[2]);
        assertEquals(1, nums[3]);
        assertEquals(2, nums[4]);
        assertEquals(3, nums[5]);
        assertEquals(3, nums[6]);
    }

}
