package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution26Test {

    /**
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test1() {
        int[] nums = new int[]{1, 1, 2};
        int k = new Solution26().removeDuplicates(nums);
        assertEquals(2, k);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    /**
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being
     * 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = new Solution26().removeDuplicates(nums);
        assertEquals(5, k);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }

}
