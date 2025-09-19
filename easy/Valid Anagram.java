/**
 * Problem 5: Valid Anagram
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-anagram/
 * Approach: Convert both strings to character arrays, sort them, and compare for equality.
 * Time complexity: O(n log n) due to sorting
 * Space complexity: O(n) for storing character arrays
 */

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        // Compare sorted arrays; if equal, strings are anagrams
        return Arrays.equals(sCharArray, tCharArray);
    }
}
