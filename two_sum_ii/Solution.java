package two_sum_ii;

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.

// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

// Return the indices of the two numbers, index1 and index2,
// added by one as an integer array [index1, index2] of length 2.

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[]{left+1, right+1};
            }

            if(sum < target) {
                left += 1;
            } else {
              right -= 1;
            }
        }

        return new int[]{-1, -1};
    }
}
