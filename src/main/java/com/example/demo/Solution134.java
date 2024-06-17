package com.example.demo;

/**
 * 134. Gas Station
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its
 * next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * <p>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the
 * circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to
 * be unique
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) return -1;

        int total = 0;
        int res = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }
}
