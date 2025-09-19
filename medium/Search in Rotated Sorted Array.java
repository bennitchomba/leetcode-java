/**
 * Problem 12: Binary Search (Linear Search Approach)
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/binary-search/
 * Approach: Iterate through the array to find the target index. If not found, return -1.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {
        int targetIndex = 0; // Variable to store the index of the target

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndex = i; // Update targetIndex when target is found
            }
        }

        // If targetIndex was never updated (still 0), check if first element was not the target
        if (targetIndex == 0 && nums.length == 0 || nums[0] != target) {
            targetIndex = -1; // Target not found
        }

        return targetIndex; // Return the target index or -1
    }
}
