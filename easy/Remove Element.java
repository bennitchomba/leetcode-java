/**
 * Problem 7: Remove Element
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-element/
 * Approach: Use two pointers. Iterate through the array and overwrite elements not equal to `val`.
 * Time complexity: O(n)
 * Space complexity: O(1) — in-place modification
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of next valid element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is not equal to val, move it to the k-th position
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++; // Increment k for next valid element
            }
        }

        // k is the new length of the array after removal
        return k;
    }
}
