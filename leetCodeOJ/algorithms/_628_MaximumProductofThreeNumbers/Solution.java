import java.util.Arrays;

public class Solution {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int pattern1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int pattern2 = nums[0] * nums[1] * nums[nums.length - 1];

        return Math.max(pattern1, pattern2);

    }

}
