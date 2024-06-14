package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution45Test {

    /**
     * Input: nums = [2,3,1,1,4]
     * Output: 2
     * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1,
     * then 3 steps to the last index.
     */
    @Test
    public void test1() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int k = new Solution45().jump(nums);
        assertEquals(2, k);
    }

    /**
     * Input: nums = [2,3,0,1,4]
     * Output: 2
     */
    @Test
    public void test2() {
        int[] nums = new int[]{2, 3, 0, 1, 4};
        int k = new Solution45().jump(nums);
        assertEquals(2, k);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{2, 3, 1};
        int k = new Solution45().jump(nums);
        assertEquals(1, k);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
        int k = new Solution45().jump(nums);
        assertEquals(2, k);
    }
}
