import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int outCount = 0;
            int score = 0;
            boolean[] runner = new boolean[3];

            while (outCount < 3) {

                String event = sc.next();

                switch (event) {

                    case "HIT" :
                        if (runner[2]) {
                            score++;
                        }

                        runner[2] = runner[1];
                        runner[1] = runner[0];
                        runner[0] = true;
                        break;

                    case "HOMERUN" :
                        for (int j = 0; j < runner.length; j++) {
                            if (runner[j]) {
                                score++;
                            }
                            runner[j] = false;
                        }
                        score++;
                        break;

                    case "OUT" :
                        outCount++;
                        break;

                }

            }

            System.out.println(score);

        }

    }

}
