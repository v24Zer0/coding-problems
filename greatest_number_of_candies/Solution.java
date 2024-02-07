package greatest_number_of_candies;

import java.util.ArrayList;
import java.util.List;

// There are n kids with candies. You are given an integer array candies,
// where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
// denoting the number of extra candies that you have.
// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
// they will have the greatest number of candies among all the kids, or false otherwise.
// Note that multiple kids can have the greatest number of candies.

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hasMostCandy = new ArrayList<>();
        int maxCandy = 0;

        for(int i = 0; i < candies.length; i++) {
            maxCandy = Math.max(maxCandy, candies[i]);
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandy)
                hasMostCandy.add(true);
            else
                hasMostCandy.add(false);
        }

        return hasMostCandy;
    }
}
