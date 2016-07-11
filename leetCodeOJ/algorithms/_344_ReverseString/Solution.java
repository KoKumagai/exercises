public class Solution {

    public String reverseString(String s) {

        char[] stringArray = s.toCharArray();

        int begin = 0;
        int end = s.length() - 1;

        while (begin < end) {

            char temp = stringArray[begin];
            stringArray[begin] = stringArray[end];
            stringArray[end] = temp;
            begin++;
            end--;

        }

        return new String(stringArray);

    }

}
