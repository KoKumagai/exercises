public class Solution {

    public int rob(int[] nums) {

        int current = 0;
        int last = 0;

        for (int i = 0; i < nums.length; i++) {

            int tmp = current;
            current = Math.max(last + nums[i], current);
            last = tmp;

        }

        return current;

    }

}
