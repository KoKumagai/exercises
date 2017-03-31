public class FactorialWithoutRecursion {

    private static int factorial(int num) {

        int result = 1;

        while (0 < num) {

            result *= num;
            num--;

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(factorial(7));

    }

}
