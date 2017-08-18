public class Solution {

    public String reverseWords(String s) {

        char[] str = s.toCharArray();

        int begin = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i] == ' ') {

                reverse(str, begin, i - 1);
                begin = i + 1;

            }

        }

        reverse(str, begin, str.length - 1);

        return new String(str);

    }

    private void reverse(char[] str, int begin, int end) {

        while (begin < end) {

            char tmp = str[begin];
            str[begin] = str[end];
            str[end] = tmp;

            begin++;
            end--;

        }

    }

}
