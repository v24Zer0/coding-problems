package longest_substring_without_repeating_characters;

// Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> used = new HashMap<>();

        int maxLength = 0;
        int left = 0;
        int length = 0;

        for(int i = 0; i < chars.length; i++) {
            if(used.containsKey(chars[i])) {
                if(used.get(chars[i]) >= left) {
                    left = used.get(chars[i]) + 1;
                }
            }

            used.put(chars[i], i);
            length = i - left + 1;

            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }
}
