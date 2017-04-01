public class SquareRoot {

    private static double squareRoot(double num) {

        double result = num / 2;
        double last = 0;

        while (result != last) {

            last = result;
            result = (result + num / result) / 2;

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(squareRoot(2));
        System.out.println(squareRoot(4));

    }

}
