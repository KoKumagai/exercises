import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {

                int math = sc.nextInt();
                int english = sc.nextInt();
                int japanese = sc.nextInt();

                if (math == 100 || english == 100 || japanese==100) {
                    System.out.println('A');
                    continue;
                }

                if (90 <= (math + english) / 2) {
                    System.out.println('A');
                    continue;
                }

                if (80 <= (math + english + japanese) / 3) {
                    System.out.println('A');
                    continue;
                }

                if (70 <= (math + english + japanese) / 3) {
                    System.out.println('B');
                    continue;
                }

                if ((50 <= (math + english + japanese) / 3) && (80 <= math || 80 <= english)) {
                    System.out.println('B');
                    continue;
                }

                System.out.println('C');

            }

        }

    }

}
