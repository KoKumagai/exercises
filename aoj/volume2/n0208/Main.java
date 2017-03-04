import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] okList = {0, 1, 2, 3, 5, 7, 8, 9};

        while (true) {

            int n = sc.nextInt();

            if (n == 0 ) {
                break;
            }

            long newRoomNumber = 0;
            long position = 1;

            while (0 < n) {

                newRoomNumber += position * okList[n % 8];
                position *= 10;
                n /= 8;

            }

            System.out.println(newRoomNumber);

        }

    }

}
