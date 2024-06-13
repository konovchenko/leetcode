package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution55Test {

    /**
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     */
    @Test
    public void test1() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean canJump = new Solution55().canJump(nums);
        assertTrue(canJump);
    }

    /**
     * Input: nums = [3,2,1,0,4]
     * Output: false
     * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
     */
    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean canJump = new Solution55().canJump(nums);
        assertFalse(canJump);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0, 1};
        boolean canJump = new Solution55().canJump(nums);
        assertFalse(canJump);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{2, 0};
        boolean canJump = new Solution55().canJump(nums);
        assertTrue(canJump);
    }

    @Test
    public void test5() {
        int[] nums = new int[]{2, 0, 1, 1, 2, 1, 0, 0, 0};
        boolean canJump = new Solution55().canJump(nums);
        assertFalse(canJump);
    }

    @Test
    public void test6() {
        int[] nums = new int[]{2, 4, 4, 2, 0, 3, 1, 4, 1, 3, 2, 0, 1, 1, 2, 1, 0, 1, 4};
        boolean canJump = new Solution55().canJump(nums);
        assertFalse(canJump);
    }

}
