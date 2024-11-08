package sliding_window_planet_detection;

public class Solution {
    public double maxAverage(int[] nums) {
        int left = 0;
        int size = 0;
        double maxVal = 0;
        double val = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                continue;

            val += nums[i];
            size++;

            if(size == 3) {
                maxVal = Math.max(maxVal, val/3);

                while(nums[left] == 0 && left <= i) {
                    left++;
                }
                val -= nums[left++];
                size--;
            }
        }

        return maxVal;
    }
}
