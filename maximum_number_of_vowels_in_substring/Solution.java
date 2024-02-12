package maximum_number_of_vowels_in_substring;

// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int max = 0;
        int left = 0;
        int numVowels = 0;

        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                numVowels++;
            }

            if((i - left + 1) == k) {
                max = Math.max(max, numVowels);
                if(vowels.contains(s.charAt(left))) {
                    numVowels--;
                }
                left++;
            }
        }

        return max;
    }
}
