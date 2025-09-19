/**
 * Problem 3: Average Value of Even Numbers That Are Divisible by 3
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-3/
 * Approach: Iterate through the array, summing numbers divisible by both 2 and 3, then return the integer average.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;   // Sum of numbers divisible by 2 and 3
        int count = 0; // Count of numbers satisfying the condition

        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the number is divisible by both 2 (even) and 3
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                sum += nums[i]; // Add number to sum
                count++;        // Increment count
            }
        }

        // If no numbers satisfy the condition, return 0
        if (count == 0) {
            return 0;
        }

        // Return the integer average
        return sum / count;
    }
}
