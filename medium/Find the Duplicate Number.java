/**
 * Problem 10: Find the Duplicate Number
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-the-duplicate-number/
 * Approach: Use a HashSet to track numbers seen. The first number that already exists in the set is the duplicate.
 * Time complexity: O(n)
 * Space complexity: O(n) — for the HashSet
 */

import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> duplicateNumber = new HashSet<>(); // Set to store seen numbers
        int duplicate = 0; // Variable to store the duplicate number

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If number already exists in the set, it's the duplicate
            if (duplicateNumber.contains(nums[i])) {
                duplicate = nums[i];
            }
            // Add current number to the set
            duplicateNumber.add(nums[i]);
        }

        return duplicate; // Return the found duplicate
    }
}
