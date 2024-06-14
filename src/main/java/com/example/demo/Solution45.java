package com.example.demo;

/**
 * 45. Jump Game II
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <p>
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words,
 * if you are at nums[i], you can jump to any nums[i + j] where:
 * <p>
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can
 * reach nums[n - 1].
 */
public class Solution45 {
    public int jump(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i] == 0) {
                return 0;
            }
            int max = 0;
            int maxIndex = i + 1;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                int localSum = j + nums[j] - i;
                if (max <= localSum || ((j + nums[j]) >= nums.length - 1)) {
                    max = localSum;
                    maxIndex = j;
                }
            }
            i = maxIndex;
            res++;
        }

        return res;
    }
}
