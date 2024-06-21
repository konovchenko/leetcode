package com.example.demo;

/**
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */
public class Solution42 {
    public int trap(int[] height) {

        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int res = 0;
        for (int leftCur = 0, rightCur = height.length - 1; leftCur < rightCur;) {
            if (leftMax < rightMax) {
                leftCur++;
                leftMax = Math.max(leftMax, height[leftCur]);
                res += leftMax - height[leftCur];
            } else {
                rightCur--;
                rightMax = Math.max(rightMax, height[rightCur]);
                res += rightMax - height[rightCur];
            }
        }

        return res;
    }
}
