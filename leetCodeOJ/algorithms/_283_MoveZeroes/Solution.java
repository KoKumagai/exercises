public class Solution {

    public void moveZeroes(int[] nums) {

        int insertZeroPos = 0;

        for (int num: nums) {

            if (num != 0) {

                nums[insertZeroPos] = num;
                insertZeroPos++;

            }

        }

        while (insertZeroPos < nums.length) {
            nums[insertZeroPos++] = 0;
        }

    }

}
