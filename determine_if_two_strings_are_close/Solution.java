package determine_if_two_strings_are_close;

// Two strings are considered close if you can attain one from the other using the following operations:
//  Operation 1: Swap any two existing characters.
//      For example, abcde -> aecdb
//  Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
//      For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)

// You can use the operations on either string as many times as necessary.
// Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> word1Chars = new HashSet<>();
        Set<Character> word2Chars = new HashSet<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if(word1.length() != word2.length())
            return false;

        for(int i = 0; i < word1.length(); i++) {
            word1Chars.add(word1.charAt(i));
            word2Chars.add(word2.charAt(i));

            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        for(Character c : word1Chars) {
            if(!word2Chars.contains(c))
                return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i = 0; i < 26; i++) {
            if(freq1[i] != freq2[i])
                return false;
        }

        return true;
    }
}
