package reverse_words_in_string;

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words.
// The returned string should only have a single space separating the words. Do not include any extra spaces.

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        Stack<String> words = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
//            add characters to new word until a space is found, add word to stack
            if(s.charAt(i) == ' ') {
//                add word to stack
                if(sb.length() > 0) {
                    words.push(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        if(sb.length() != 0) {
            words.push(sb.toString());
            sb.setLength(0);
        }

//        pop words from stack into new string until stack is empty
        while(!words.isEmpty()) {
            sb.append(words.pop());
            if(words.isEmpty()) {
                break;
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}
