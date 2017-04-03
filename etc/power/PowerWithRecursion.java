public class PowerWithRecursion {

    private static long power(long base, long exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, --exponent);

    }

    public static void main(String[] args) {

        System.out.println(power(2, 8));

    }

}
