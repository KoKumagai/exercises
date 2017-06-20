public class Solution {

    public String convertToTitle(int n) {

        String result = "";

        while (n > 0) {

            n--;
            char ch = (char) (n % 26 + 'A');
            result = ch + result;
            n  /= 26;

        }

        return result;

    }

}
