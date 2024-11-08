package reverse_vowels_of_string;

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
//      Input: s = "hello"
//      Output: "holle"

// Example 2:
//      Input: s = "leetcode"
//      Output: "leotcede"

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

        char[] sAsChar = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            boolean isRightVowel = vowels.contains(sAsChar[right]);
            boolean isLeftVowel = vowels.contains(sAsChar[left]);

            if(isLeftVowel && isRightVowel) {
                char temp = sAsChar[left];
                sAsChar[left] = sAsChar[right];
                sAsChar[right] = temp;

                left++;
                right--;
            }

            if(!isLeftVowel) {
                left++;
            }

            if(!isRightVowel) {
                right--;
            }
        }

        return new String(sAsChar);
    }
}
