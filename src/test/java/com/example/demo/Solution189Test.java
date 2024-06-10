package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution189Test {

    /**
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution189().rotate(arr, 3);
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(arr, expected);
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
        int[] nums1 = new int[]{-1, -100, 3, 99};
        new Solution189().rotate(nums1, 2);
        int[] expected = new int[]{3, 99, -1, -100};
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{1, 2};
        new Solution189().rotate(nums1, 1);
        int[] expected = new int[]{2, 1};
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void test4() {
        int[] nums1 = new int[]{1, 2};
        new Solution189().rotate(nums1, 3);
        int[] expected = new int[]{2, 1};
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void test5() {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6};
        new Solution189().rotate(nums1, 2);
        int[] expected = new int[]{5, 6, 1, 2, 3, 4};
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void test6() {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54};
        new Solution189().rotate(nums1, 45);
        int[] expected = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 1, 2,
                3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(nums1, expected);
    }
}
