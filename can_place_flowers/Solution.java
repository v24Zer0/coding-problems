package can_place_flowers;

// You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
// and an integer n,
// return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers
// rule and false otherwise.

// Example 1:
//      Input: flowerbed = [1,0,0,0,1], n = 1
//      Output: true

// Example 2:
//      Input: flowerbed = [1,0,0,0,1], n = 2
//      Output: false

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int next = 1;

        while(i < flowerbed.length) {
            if(flowerbed[i] == 0) {
                if((i == flowerbed.length - 1) || (next < flowerbed.length && flowerbed[next] == 0)) {
                    flowerbed[i] = 1;
                    n -= 1;
                }
            }

            if(next < flowerbed.length && flowerbed[next] == 1) {
                i = next + 2;
                next = i + 1;
                continue;
            }

            i += 2;
            next += 2;
        }

        return n <= 0;
    }
}
