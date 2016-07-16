public class Solution {

    public int addDigits(int num) {

        int sum = 0;
        boolean isOneDigit = false;

        while (!isOneDigit) {

            while (num/10 != 0) {

                sum += num % 10;
                num /= 10;

            }

            sum += num;

            if (sum/10 == 0) {

                isOneDigit = true;

            } else {

                num = sum;
                sum = 0;

            }

        }

        return sum;

    }

}
