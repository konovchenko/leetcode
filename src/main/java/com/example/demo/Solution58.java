package com.example.demo;

/**
 * 58. Length of Last Word
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        //O(N)
//        String[] arr = s.split(" ");
//        return arr[arr.length - 1].length();

        //O(1)
        var len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len != 0) {
                    break;
                }
            } else {
                len++;
            }
        }
        return len;

    }
}
