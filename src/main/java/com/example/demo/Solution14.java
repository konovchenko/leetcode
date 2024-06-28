package com.example.demo;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        var res = strs[0];
        int maxLen = res.length();
        for (int j = 1; j < strs.length; j++) {
            var word = strs[j];
            int len = 0;
            for (int i = 0; i < word.length() && i < maxLen; i++) {
                if (res.charAt(i) != word.charAt(i)) {
                    break;
                } else {
                    len = i + 1;
                }
            }
            if (len == 0) {
                return "";
            }
            if (len < maxLen) {
                maxLen = len;
            }
        }

        return res.substring(0, maxLen);
    }
}
