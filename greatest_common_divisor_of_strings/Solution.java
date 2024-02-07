package greatest_common_divisor_of_strings;

// For two strings s and t, we say "t divides s" if and only if:
// s = t + ... + t (i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

// Example 1:
//      Input: str1 = "ABCABC", str2 = "ABC"
//      Output: "ABC"

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
           return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
