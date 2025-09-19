/**
 * Problem 8: Single Number
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/single-number/
 * Approach: Use XOR to find the unique number. XOR of a number with itself is 0, and XOR with 0 is the number itself.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0; // Initialize XOR accumulator

        // Iterate through each number and XOR it with the accumulator
        for (int num : nums) {
            answer ^= num; // Duplicate numbers cancel out, leaving the single number
        }

        return answer; // Return the unique number
    }
}
