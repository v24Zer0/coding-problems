package removing_stars_from_string;

// You are given a string s, which contains stars *.
// In one operation, you can:
//      Choose a star in s.
//      Remove the closest non-star character to its left, as well as remove the star itself.
//      Return the string after all stars have been removed.

// Note:
//      The input will be generated such that the operation is always possible.
//      It can be shown that the resulting string will always be unique.

// Example 1:
//  Input: s = "leet**cod*e"
//  Output: "lecoe"
//      Explanation: Performing the removals from left to right:
//      - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//      - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//      - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//      There are no more stars, so we return "lecoe".

// Example 2:
//  Input: s = "erase*****"
//  Output: ""
//      Explanation: The entire string is removed, so we return an empty string.

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        Stack<Character> chars = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!chars.isEmpty()) {
            sb.append(chars.pop());
        }

        return sb.reverse().toString();
    }
}
