package merge_strings_alternately;

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int mergedLength = word1.length() + word2.length();
        char[] mergedChars = new char[mergedLength];

        int shortestLength;

        if(word2.length() > word1.length()) {
            shortestLength = word1.length();
        } else {
            shortestLength = word2.length();
        }

        int i;
        int mergedIndex = 0;

        for(i = 0 ; i < shortestLength; i++) {
            mergedChars[mergedIndex] = word1.charAt((i));
            mergedIndex++;

            mergedChars[mergedIndex] = word2.charAt((i));
            mergedIndex++;
        }

        if(shortestLength == word2.length()) {
            while(i < word1.length()) {
                mergedChars[mergedIndex] = word1.charAt((i));
                i++;
                mergedIndex++;
            }
        } else {
            while(i < word2.length()) {
                mergedChars[mergedIndex] = word2.charAt((i));
                i++;
                mergedIndex++;
            }
        }

        return new String(mergedChars);
    }
}
