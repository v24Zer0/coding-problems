package product_of_array_except_self;

// Given an integer array nums, return an array answer such that answer[i] is equal to the product
// of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
//      Input: nums = [1,2,3,4]
//      Output: [24,12,8,6]

// Example 2:
//      Input: nums = [-1,1,0,-3,3]
//      Output: [0,0,9,0,0]

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] leftProd = new int[length];
        int[] rightProd = new int[length];

        leftProd[0] = 1;
        rightProd[length-1] = 1;

        for(int i = 1; i < length; i++) {
            leftProd[i] = nums[i-1] * leftProd[i-1];
        }

        for(int i = length - 2; i >= 0; i--) {
            rightProd[i] = nums[i+1] * rightProd[i+1];
        }

        for(int i = 0; i < length; i++) {
            nums[i] = leftProd[i] * rightProd[i];
        }

        return nums;
    }
}
