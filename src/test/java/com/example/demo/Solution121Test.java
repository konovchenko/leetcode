package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution121Test {

    /**
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    @Test
    public void test1() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int output = new Solution121().maxProfit(arr);
        int expected = 5;
        assertEquals(output, expected);
    }

    /**
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     */
    @Test
    public void test2() {
        int[] arr = new int[]{7, 6, 4, 3, 1};
        int output = new Solution121().maxProfit(arr);
        int expected = 0;
        assertEquals(output, expected);
    }
}
