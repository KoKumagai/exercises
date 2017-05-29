public class Solution {

    public int titleToNumber(String s) {

        int columnNumber = 0;

        for (int i = 0; i < s.length(); i++) {

            columnNumber *= 26;
            columnNumber += s.charAt(i) - 'A' + 1;

        }

        return columnNumber;

    }

}
