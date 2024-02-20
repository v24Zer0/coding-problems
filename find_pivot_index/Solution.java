package find_pivot_index;

// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index
// is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.

public class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        int[] leftSum = new int[length];
        int[] rightSum = new int[length];

        leftSum[0] = 0;
        for(int i = 1; i < length; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        for(int i = length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        rightSum[length-1] = 0;
        for(int i = 0; i < length; i++) {
            if(leftSum[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}
