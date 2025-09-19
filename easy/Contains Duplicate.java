/**
 * Problem 6: Contains Duplicate
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Approach: Use a HashSet to track seen numbers. If a number is already in the set, return true.
 * Time complexity: O(n) — each number is checked and added once
 * Space complexity: O(n) — for storing numbers in the HashSet
 */

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet to store unique numbers encountered
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, a duplicate exists
            if (seen.contains(num)) {
                return true; // Early return
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }

        // No duplicates found
        return false;
    }
}
