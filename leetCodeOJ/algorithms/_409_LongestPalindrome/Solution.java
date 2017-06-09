import java.util.HashSet;

public class Solution {

    public int longestPalindrome(String s) {

        HashSet<Character> charactersHs = new HashSet<Character>();

        int palindromeLen = 0;

        for (int i = 0; i < s.length(); i++) {

            if (charactersHs.contains(s.charAt(i))) {

                charactersHs.remove(s.charAt(i));
                palindromeLen += 2;

            } else {

                charactersHs.add(s.charAt(i));

            }

        }

        if (!charactersHs.isEmpty()) {
            palindromeLen++;
        }

        return palindromeLen;

    }

}
