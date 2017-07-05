public class Solution {

    public int removeDuplicates(int[] nums) {

        int curIndex = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[curIndex]) {
                curIndex++;
                nums[curIndex] = nums[i];
            }

        }

        curIndex++;

        return curIndex;

    }

}
