/**
 * Problem 11: Find All Duplicates in an Array
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Approach: Use a HashSet to track seen numbers. If a number is already in the set, add it to the duplicates list.
 * Time complexity: O(n)
 * Space complexity: O(n) — for the HashSet and duplicates list
 */


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>(); // List to store duplicate numbers
        HashSet<Integer> numbers = new HashSet<>();   // Set to track seen numbers

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If number has not been seen before, add to set
            if (!numbers.contains(nums[i])) {
                numbers.add(nums[i]);
            } else {
                // If number already exists in set, it's a duplicate
                duplicates.add(nums[i]);
            }
        }

        return duplicates; // Return list of duplicates
    }
}
