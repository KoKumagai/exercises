import java.util.Arrays;

public class Solution {

    public int missingNumber(int[] nums) {

        int left = 0;
        int right = nums.length;

        Arrays.sort(nums);

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        return left;

    }

}
