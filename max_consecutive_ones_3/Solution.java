package max_consecutive_ones_3;

// Given a binary array nums and an integer k,
// return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

// Example 1:
//      Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//      Output: 6
//      Explanation: [1,1,1,0,0,1,1,1,1,1,1]

// Example 2:
//      Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//      Output: 10
//      Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        int flipped = 0;

        while(right < nums.length) {
            if(nums[right] == 1) {
                count++;
                right++;
            } else if(nums[right] == 0 && flipped < k) {
                count++;
                right++;
                flipped++;
            } else {
                if(nums[left] == 0) {
                    flipped--;
                }
                left++;
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
