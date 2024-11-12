package valid_palindrome;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
// and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }

        char[] palindrome = sb.toString().toCharArray();
        int left = 0;
        int right = palindrome.length - 1;

        while(left <= right) {
            if(palindrome[left] != palindrome[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}
