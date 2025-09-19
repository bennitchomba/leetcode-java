/**
 * Problem 2: Smallest Index With Equal Value
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/smallest-index-with-equal-value/
 * Approach: Iterate through the array and check if the last digit of the index equals the value at that index.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int smallestEqual(int[] nums) {
        // Iterate through each index of the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the last digit of the index equals the value at that index
            // Using i % 10 to get the last digit of the index
            if (i % 10 == nums[i]) {
                return i; // Return immediately when the condition is satisfied
            }
        }
        // If no index satisfies the condition, return -1
        return -1;
    }
}
