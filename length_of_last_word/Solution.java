package length_of_last_word;

// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] sChars = s.toCharArray();

        int left = 0;
        int right = sChars.length - 1;

        while(right > 0 && sChars[right] == ' ')
            right--;

        left = right;

        while(left > 0 && sChars[left] != ' ') {
            left--;
        }

        if(sChars[left] == ' ')
            left++;

        if(left <= right)
            return right - left + 1;

        return length;
    }
}
