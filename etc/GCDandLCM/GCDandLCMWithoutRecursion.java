public class GCDandLCMWithoutRecursion {

    private static int gcd(int a, int b) {

        while (b > 0) {

            int tmp = b;
            b = a % b;
            a = tmp;

        }

        return a;

    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        System.out.println("GCD = " + gcd(54, 24));
        System.out.println("LCM = " + lcm(54, 24));

    }

}
