package first_missing_positive;

// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> found = new HashSet<>();
        int firstPositive = 1;

        for(int i = 0; i < nums.length; i++) {
            if(!found.contains(nums[i])) {
                found.add(nums[i]);
            }
        }

        while(found.contains(firstPositive)) {
            firstPositive += 1;
        }

        return firstPositive;
    }

    public int firstMissingPositiveOptimised(int[] nums) {
//        Cycle sort

        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}