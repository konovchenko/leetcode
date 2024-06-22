package com.example.demo;

import java.util.Map;

/**
 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class Solution13 {
    public int romanToInt(String s) {
        var map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int res = 0;

        char prev = '0';
        for (int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            int num = map.get(cur);
            if (cur == 'I' && (prev == 'V' || prev == 'X')) {
                res -= num;
            } else if (cur == 'X' && (prev == 'L' || prev == 'C')) {
                res -= num;
            } else if (cur == 'C' && (prev == 'D' || prev == 'M')) {
                res -= num;
            } else {
                res += num;
            }
            prev = cur;
        }

        return res;
    }
}
