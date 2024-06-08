package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution88Test {
    @Test
    public void test1() {
        //nums1 = [1], m = 1, nums2 = [], n = 0
        int[] arr = new int[] {1};
        new Solution88().merge(arr, 1, new int[0], 0);
        int[] expected = new int[] {1};
        assertArrayEquals(arr, expected);
    }

    @Test
    public void test2() {
        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        new Solution88().merge(nums1, 3, nums2, 3);
        int[] expected = new int[] {1,2,2,3,5,6};
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void test3() {
        //nums1 = [0], m = 0, nums2 = [1], n = 1
        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};
        new Solution88().merge(nums1, 0, nums2, 1);
        int[] expected = new int[] {1};
        assertArrayEquals(nums1, expected);
    }
}
