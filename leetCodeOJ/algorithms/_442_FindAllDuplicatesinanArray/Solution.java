import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicatesList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicatesList.add(Math.abs(index + 1));
            } else {
                nums[index] = -nums[index];
            }

        }

        return duplicatesList;

    }

}
