package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution42Test {

    /**
     * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * Output: 6
     * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
     * In this case, 6 units of rain water (blue section) are being trapped.
     */
    @Test
    public void test1() {
        int[] nums = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int k = new Solution42().trap(nums);
        assertEquals(6, k);
    }

    /**
     * Input: height = [4,2,0,3,2,5]
     * Output: 9
     */
    @Test
    public void test2() {
        int[] nums = new int[]{4, 2, 0, 3, 2, 5};
        int k = new Solution42().trap(nums);
        assertEquals(9, k);
    }

}
