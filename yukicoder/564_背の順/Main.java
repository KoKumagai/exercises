import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();

        int rank = 1;

        for (int i = 0; i < N - 1; i++) {

            if (sc.nextInt() > H) {
                rank++;
            }

        }

        if (rank % 10 == 1) {
            System.out.println(rank + "st");
        } else if (rank % 10 == 2) {
            System.out.println(rank + "nd");
        } else if(rank % 10 == 3) {
            System.out.println(rank + "rd");
        } else {
            System.out.println(rank + "th");
        }

    }

}
