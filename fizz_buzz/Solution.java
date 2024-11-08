package fizz_buzz;

// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0)
                sb.append("Fizz");
            if(i % 5 == 0)
                sb.append("Buzz");
            if(sb.isEmpty())
                sb.append(i);

            ans.add(sb.toString());
            sb.setLength(0);
        }

        return ans;
    }
}
