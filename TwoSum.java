/**
 * Problem 1: Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 * Approach: I use a hashmap to store the indices of the visited numbers.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        HashMap<Integer, Integer> numbersAndIndices = new HashMap<>();
        
        // Array to store the result indices
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numbersAndIndices.containsKey(complement)) {
                result[0] = numbersAndIndices.get(complement);
                result[1] = i;
                return result;
            } else {
                numbersAndIndices.put(nums[i], i);
            }
        }
        
        // Should never reach here if input guarantees one solution
        return result;
    }
}
