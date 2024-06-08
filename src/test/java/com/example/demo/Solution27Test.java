package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution27Test {

    /**
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test1() {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        int k = new Solution27().removeElement(nums, val);
        assertEquals(2, k);
    }

    /**
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums
     * containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    public void test2() {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = new Solution27().removeElement(nums, val);
        assertEquals(5, k);
    }

}
