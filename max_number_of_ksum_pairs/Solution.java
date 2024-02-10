package max_number_of_ksum_pairs;

// You are given an integer array nums and an integer k.
// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
// Return the maximum number of operations you can perform on the array.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxOperations(int[] nums, int k) {
//        Solution using map:

//        Map<Integer, Integer> map = new HashMap<>();
//        int operations = 0;
//
//        for(int i = 0; i < nums.length; i++) {
//            int target = k - nums[i];
//            if(map.containsKey(target) && map.get(target) > 0) {
//                operations++;
//
//                map.put(target, map.getOrDefault(target, 1) - 1);
//            } else {
//                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//            }
//        }

//        Solution using two pointers, sorting array first
        int operations = 0;
        int left = 0;
        int right = nums.length - 1;

        Arrays.sort(nums);

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                operations++;
                left++;
                right--;
            } else if(sum < k) {
                 left++;
            } else {
                 right--;
            }
        }

        return operations;
    }
}
