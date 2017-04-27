import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rank = 1;

        int scoreK = sc.nextInt();

        System.out.println(rank);

        for (int i = 1; i < n; i++) {

            int scoreOthers = sc.nextInt();

            if (scoreOthers > scoreK) {
                rank++;
            }

            System.out.println(rank);

        }

    }

}
