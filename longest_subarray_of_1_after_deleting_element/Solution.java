package longest_subarray_of_1_after_deleting_element;

// Given a binary array nums, you should delete one element from it.
// Return the size of the longest non-empty subarray containing only 1's in the resulting array.
// Return 0 if there is no such subarray.

// Example 1:
//      Input: nums = [1,1,0,1]
//      Output: 3
//      Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

// Example 2:
//      Input: nums = [0,1,1,1,0,1,1,0,1]
//      Output: 5
//      Explanation: After deleting the number in position 4,
//          [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

// Example 3:
//      Input: nums = [1,1,1]
//      Output: 2
//      Explanation: You must delete one element.

public class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        boolean deleted = false;
        int deletedIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(deleted) {
                    deleted = false;
                    left = deletedIndex + 1;
                }
                deleted = true;
                deletedIndex = i;
            }

            max = Math.max(max, i - left);
        }

        return max;
    }
}
