package first_unique_character_in_a_string;

// Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.

public class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            freq[chars[i]-'a']++;
        }

        for(int i = 0; i < chars.length; i++) {
            if(freq[chars[i]-'a'] == 1)
                return i;
        }

        return -1;
    }
}
