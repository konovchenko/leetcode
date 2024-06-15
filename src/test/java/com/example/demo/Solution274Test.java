package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution274Test {

    /**
     * Input: citations = [3,0,6,1,5]
     * Output: 3
     * Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
     * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
     */
    @Test
    public void test1() {
        int[] nums = new int[]{3, 0, 6, 1, 5};
        int k = new Solution274().hIndex(nums);
        assertEquals(3, k);
    }

    /**
     * Input: citations = [1,3,1]
     * Output: 1
     */
    @Test
    public void test2() {
        int[] nums = new int[]{1, 3, 1};
        int k = new Solution274().hIndex(nums);
        assertEquals(1, k);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1};
        int k = new Solution274().hIndex(nums);
        assertEquals(1, k);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{11, 15};
        int k = new Solution274().hIndex(nums);
        assertEquals(2, k);
    }

}
