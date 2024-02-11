package maximum_average_subarray_1;

// You are given an integer array nums consisting of n elements, and an integer k.
// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
// Any answer with a calculation error less than 10-5 will be accepted.

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        double sum = 0;
        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if((i - left + 1) == k) {
                average = Math.max(average, sum / k);
                sum -= nums[left];
                left++;
            }
        }

        return average;
    }
}
