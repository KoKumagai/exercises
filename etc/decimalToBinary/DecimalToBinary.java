public class DecimalToBinary {

    private static long toBinary(int num) {

        if (num == 0){
            return 0;
        }

        if (num < 0) {
            throw new RuntimeException("Not a positive number");
        }

        int binary = 0;
        int digit = 1;

        while (num > 0) {
            int remainder = num % 2;
            num /= 2;
            binary += remainder * digit;
            digit *= 10;
        }

        return binary;

    }

    public static void main(String[] args) {

        System.out.println(toBinary(123));

    }

}
