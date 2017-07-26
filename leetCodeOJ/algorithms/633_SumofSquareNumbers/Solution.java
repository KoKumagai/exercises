public class Solution {

    public boolean judgeSquareSum(int c) {

        int low = 0;
        int high = (int) Math.sqrt(c);

        while (low <= high) {

            int sum = low * low + high * high;

            if (sum == c) {
                return true;
            }

            if (sum < c) {
                low++;
            } else if (sum > c) {
                high--;
            }

        }

        return false;

    }

}
