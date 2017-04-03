public class PowerWithoutRecursion {

    private static long power(long base, long exponent) {

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(power(2, 8));

    }

}
