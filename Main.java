import sliding_window_planet_detection.Solution;

// Given an array of integers representing planet detection values,
// determine the maximum average value of 3 detected planets,
// ignoring any zero values in between non-zero detection values.

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1,0,0,0,1,0,0,7};
        double maxAverage = s.maxAverage(nums);

        System.out.println(maxAverage);
    }
}
