/**
 * Problem 4: Valid Perfect Square
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-perfect-square/
 * Approach: Iterate from 1 to sqrt(num), checking if any square equals the given number.
 * Time complexity: O(sqrt(n))
 * Space complexity: O(1)
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        // Use long to prevent integer overflow when squaring large numbers
        for (long i = 1; i * i <= num; i++) {
            // If i squared equals num, then num is a perfect square
            if (i * i == num) {
                return true; // Early return if perfect square is found
            }
        }
        // If no integer square equals num, return false
        return false;
    }
}
