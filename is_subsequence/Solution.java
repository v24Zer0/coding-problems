package is_subsequence;

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
// of the characters without disturbing the relative positions of the remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;

        if(s.length() > t.length())
            return false;

        for(int i = 0; i < t.length() && sIndex < s.length(); i++) {
            if(t.charAt(i) == s.charAt(sIndex))
                sIndex++;
        }

        return sIndex == s.length();
    }
}
