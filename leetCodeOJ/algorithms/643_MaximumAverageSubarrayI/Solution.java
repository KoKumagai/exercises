public class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = 0, j = k; j < nums.length; i++, j++) {
            sum = sum - nums[i] + nums[j];
            max = Math.max(sum, max);
        }

        double maxAverage = (double) max / (double) k;

        return maxAverage;

    }

}
