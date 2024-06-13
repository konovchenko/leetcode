package com.example.demo;

/**
 * 55. Jump Game
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i] == 0) {
                return false;
            }
            int max = 0;
            int maxIndex = i + 1;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                int localSum = j + nums[j] - i;
                if (max <= localSum) {
                    max = localSum;
                    maxIndex = j;
                }
            }
            i = maxIndex;
        }

        return true;
    }
}
