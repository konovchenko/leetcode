package com.example.demo;

/**
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[prices.length - 1];
        int max = prices[prices.length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            if (min > prices[i]) {
                min = prices[i];
            }

            if (max < prices[i]) {
                max = prices[i];
                min = prices[i];
            }

            int localProfit = max - min;
            if (profit < localProfit) {
                profit = localProfit;
            }
        }

        return profit;
    }
}
