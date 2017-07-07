public class Solution {

    public static int countSegments(String s) {

        int spaceCount = 0;

        s += " ";

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                spaceCount++;
            }

        }

        return spaceCount;

    }

}
