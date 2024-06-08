package com.example.demo;

/**
 * 88. Merge Sorted Array
 * <p>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
 * be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int resPtr = n + m - 1;
        n--;
        m--;

        while (resPtr >= 0) {
            if (m < 0 && n >= 0) {
                nums1[resPtr--] = nums2[n--];
                continue;
            } else if (n < 0 && m >= 0) {
                nums1[resPtr--] = nums1[m--];
                continue;
            }

            if (nums1[m] > nums2[n]) {
                nums1[resPtr--] = nums1[m--];
            } else {
                nums1[resPtr--] = nums2[n--];
            }
        }
    }
}
