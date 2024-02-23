package unique_number_of_occurences;

// Given an array of integers arr,
// return true if the number of occurrences of each value in the array is unique or false otherwise.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> nums = new HashMap<>();
        Set<Integer> occurences = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            nums.put(arr[i], nums.getOrDefault(arr[i], 0) + 1);
        }

        for(Integer count : nums.values()) {
            if(occurences.contains(count))
                return false;
            occurences.add(count);
        }

        return true;
    }
}
