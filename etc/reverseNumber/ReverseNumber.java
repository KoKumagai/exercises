import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to reverse: ");

        int number = sc.nextInt();
        int reverse = 0;

        while (number != 0) {

            reverse *= 10;
            reverse += number % 10;
            number /= 10;

        }

        System.out.println("Reverse of the number is: " + reverse);

    }

}
