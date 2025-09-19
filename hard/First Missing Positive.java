/**
 * Problem 13: First Missing Positive
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/first-missing-positive/
 * Approach: Place each number in its correct index (cyclic sort). Then the first index where the number is incorrect gives the missing positive.
 * Time complexity: O(n)
 * Space complexity: O(1) — in-place modification
 */

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct index
        for (int i = 0; i < n; i++) {
            // Continue swapping until current number is out of range, negative, or in correct position
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int rightIndex = nums[i] - 1; // Correct index for current number
                int temp = nums[i];           // Swap nums[i] with nums[rightIndex]
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
        }

        // Find the first index where number is not i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // Missing positive found
            }
        }

        // If all numbers are in correct positions, return n + 1
        return n + 1;
    }
}
