public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] alphabetsCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            alphabetsCount[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            alphabetsCount[ransomNote.charAt(i) - 'a']--;

            if (alphabetsCount[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }

        }

        return true;

    }

}
