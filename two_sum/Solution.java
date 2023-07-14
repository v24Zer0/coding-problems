package two_sum;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> used = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int currDiff = target - nums[i];

            if(used.containsKey(currDiff)) {
                return new int[]{used.get(currDiff), i};
            }
            used.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
