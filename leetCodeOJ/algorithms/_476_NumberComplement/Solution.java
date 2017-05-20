public class Solution {

    public int findComplement(int num) {

        int exponent = 0;

        int i = 0;

        while (i < num) {

            i += Math.pow(2, exponent);
            exponent++;

        }

        int complement = i - num;

        return complement;

    }

}
