package plus_one;

// You are given a large integer represented as an integer array digits,
// where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

// Example 1:
//  Input: digits = [1,2,3]
//  Output: [1,2,4]
//  Explanation: The array represents the integer 123.
//  Incrementing by one gives 123 + 1 = 124.
//  Thus, the result should be [1,2,4].

// Example 2:
//  Input: digits = [4,3,2,1]
//  Output: [4,3,2,2]
//  Explanation: The array represents the integer 4321.
//  Incrementing by one gives 4321 + 1 = 4322.
//  Thus, the result should be [4,3,2,2].

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;

        for(int i = digits.length-1; i >= 0; i--) {
            sum = digits[i] + carry;

            if(sum == 10)
                carry = 1;
            else
                carry = 0;

            digits[i] = sum % 10;
        }

        if(carry == 1) {
            int[] extendedDigits = new int[digits.length + 1];
            extendedDigits[0] = 1;
            return extendedDigits;
        }

        return digits;
    }
}
