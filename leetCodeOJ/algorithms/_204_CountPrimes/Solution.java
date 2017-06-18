public class Solution {

    public int countPrimes(int n) {

        boolean[] notPrime = new boolean[n];

        int count = 0;

        for (int i = 2; i < n; i++) {

            if (notPrime[i]) {
                continue;
            }

            count++;

            for (int j = i; j < n; j = i + j) {
                notPrime[j] = true;
            }

        }

        return count;

    }

}
