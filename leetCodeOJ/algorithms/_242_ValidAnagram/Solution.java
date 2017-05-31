public class Solution {

    public static boolean isAnagram(String s, String t) {

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] alphabetsCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabetsCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            alphabetsCount[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphabetsCount.length; i++) {

            if (alphabetsCount[i] != 0) {
                return false;
            }

        }

        return true;

    }

}
