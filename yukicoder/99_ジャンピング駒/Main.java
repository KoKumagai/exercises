import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numPieces = sc.nextInt();

        int evenOddDifference = 0;

        for (int i = 0; i < numPieces; i++) {

            int coordinate = sc.nextInt();

            if (coordinate % 2 == 0) {
                evenOddDifference++;
            } else {
                evenOddDifference--;
            }

        }

        System.out.println(Math.abs(evenOddDifference));

    }

}
