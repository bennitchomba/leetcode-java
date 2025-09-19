/**
 * Problem 9: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Approach: Use two pointers. `i` tracks the position of the last unique element, and `j` scans the array.
 * Time complexity: O(n)
 * Space complexity: O(1) — in-place modification
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Pointer for the last unique element

        // Start from the second element and compare with the last unique
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) { 
                i++;          // Move the unique pointer forward
                nums[i] = nums[j]; // Update the position with the new unique element
            }
        }

        return i + 1; // New length of the array after removing duplicates
    }
}
