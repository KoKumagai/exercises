import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int cylinder1 = 0;
            int cylinder2 = 0;

            String answer = "YES";

            for (int j = 0; j < 10; j++) {

                int ball = sc.nextInt();

                if (ball > cylinder1) {
                    cylinder1 = ball;
                } else if (ball > cylinder2) {
                    cylinder2 = ball;
                } else if (ball < cylinder1 && ball < cylinder2){
                    answer = "NO";
                }

            }

            System.out.println(answer);

        }

    }

}
