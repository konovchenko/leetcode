package com.example.demo;

/**
 * 189. Rotate Array
 * <p>
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length < 2) {
            return;
        }

        if (k > nums.length) {
            k = k % nums.length;
        }

        int len = nums.length;
        for (int startIndex = 0; len > 0; startIndex++) {
            int currentIndex = startIndex;
            int currentValue = nums[currentIndex];
            while (len > 0) {
                int targetIndex = currentIndex + k;
                if (targetIndex >= nums.length) {
                    targetIndex = targetIndex - nums.length;
                }

                int tempValue = nums[targetIndex];
                nums[targetIndex] = currentValue;

                currentValue = tempValue;
                currentIndex = targetIndex;
                len--;

                if (currentIndex == startIndex) {
                    //loop detection
                    break;
                }
            }
        }
    }
}
