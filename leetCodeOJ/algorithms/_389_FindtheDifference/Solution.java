public class Solution {

    public char findTheDifference(String s, String t) {

        char addedChar = 0;

        for (int i = 0; i < s.length(); i++) {
            addedChar ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            addedChar ^= t.charAt(i);
        }

        return addedChar;

    }

}
