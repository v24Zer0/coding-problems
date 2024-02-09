package move_zeroes;

// Given an integer array nums, move all 0's to the end of it while maintaining the
// relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

public class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right;

        for(right = 1; right < nums.length; right++) {
            if(nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;

                left++;
            } else if(nums[left] != 0) {
                left++;
            }
        }
    }
}
