package find_difference_of_two_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
//      answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//      answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// Note that the integers in the lists may be returned in any order.

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        Set<Integer> uniqueNums1 = new HashSet<>();
        Set<Integer> uniqueNums2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            uniqueNums1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            uniqueNums2.add(nums2[i]);
        }

        for(int num : uniqueNums1) {
            if(!uniqueNums2.contains(num)) {
                answer0.add(num);
            }
        }

        for(int num : uniqueNums2) {
            if(!uniqueNums1.contains(num)) {
                answer1.add(num);
            }
        }

        List<List<Integer>> difference = new ArrayList<>();
        difference.add(answer0);
        difference.add(answer1);

        return difference;
    }
}
