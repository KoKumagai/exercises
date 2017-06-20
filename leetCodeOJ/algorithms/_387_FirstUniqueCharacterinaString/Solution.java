public class Solution {

    public int firstUniqChar(String s) {

        int[] charsCount = new int[26];

        for (int i = 0; i < s.length(); i ++) {
            charsCount[s.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < s.length(); i ++) {

            if (charsCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }

        }

        return -1;

    }

}
